package de.thcproductions.nsuluofuo.story;

import java.awt.Graphics;

import de.thcproductions.nsuluofuo.item.Item;
import de.thcproductions.nsuluofuo.item.Trivel;
import de.thcproductions.nsuluofuo.main.Handler;

public class Beginning extends Quest{
	
	private Handler handler;
	private Item trivel;

	public Beginning(Handler handler) {
		super(handler);
		this.handler = handler;
		setName("The Trivel");
		setActive(true);
		setDone(false);
		trivel =  new Trivel();
	}
	
	public void update(){
		
			if(handler.getWorld().getEntityManager().getPlayer().getX() > 200 && handler.getWorld().getEntityManager().getPlayer().getX() > 200){
				setActive(false);
				setDone(true);
			}
		
		
	}
	
	public void render(Graphics g){
		
	}

}
