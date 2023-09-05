package alex_olhovskiy.MyFirstJavaGame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyDamper{
	private Color color;
	private int x=10;
	private int y=10;
	private int width=10;
	private int height=50;
	
	
	public MyDamper(int x) {
		this.x=x;
		color=new Color(0,0,0);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		System.out.println("Damper");
		if(y>0)
		{
			if((this.y+height)<300)
			{
				this.y+=5;
			}
		}
		else 
		{
			if(this.y>0)
			{
				this.y-=5;
			}
		}
	}
	
	public int getHeight() {
		return height;
	}
	
	public void damperDraw(Graphics2D g2d,double scale) {
		g2d.setColor(color);	
	    g2d.scale(scale, scale);	
	    //y++;
	    g2d.fillRect(x,y,width,height);
	}
}
