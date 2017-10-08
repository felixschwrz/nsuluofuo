package de.thcproductions.nsuluofuo.server;

import java.net.ServerSocket;
import java.net.Socket;

public class MpServer {
	private ServerSocket serversoc;
	private int port;
	private boolean on;
	
	public MpServer(int pport){
		port = pport;
	}
	
	public void start(){
		try {
			
			serversoc = new ServerSocket(port);
			on = true;
			System.out.println("Server: Server started");
			
			Thread tron = new Thread(){
				public void run(){
					while(on){
						
						try {
							
							Socket clientsoc;
							clientsoc = serversoc.accept();
							
							Thread tr = new Thread(new MpClientHandler(clientsoc));
							tr.start();
							
							System.out.println("Server: Client connected");
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			};
			tron.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void stop(){
		try {
			
			serversoc.close();
			on = false;
			
			System.out.println("Server: Server closed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}