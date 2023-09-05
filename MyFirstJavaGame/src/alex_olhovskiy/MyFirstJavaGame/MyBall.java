package alex_olhovskiy.MyFirstJavaGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

public class MyBall {
	private Random rand=new Random(); 
	private Color color;
	private int x=0;
	private int y=10;
	private int d=20;
	private boolean flag=true;
	public static int speed=1;

	public void setFlag() {
		flag=false;
	}
	
	public boolean getFlag() {
		return flag;
	}
	
	public int getD() {
		return d;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public MyBall() {
		color=new Color(255,0,0);
		y=rand.nextInt(300-d);
	}
	
	public void ballDraw(Graphics2D g2d,double scale) {
		g2d.setColor(color);	
	    g2d.scale(scale, scale);	
	    x+=speed;
	    g2d.fillOval(x,y,d,d);
	}

}
