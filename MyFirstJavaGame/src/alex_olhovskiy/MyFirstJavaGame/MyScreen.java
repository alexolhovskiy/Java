package alex_olhovskiy.MyFirstJavaGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.Timer;

public class MyScreen extends JComponent implements ActionListener {
	  private double scale;
	  private Timer timer;
	  private int width=500;
	  private int height=300;
	  private int x=450;
	  private ArrayList<MyBall>myballs=new ArrayList<>();
	  private MyDamper mydamper=new MyDamper(x);
	  private int score=0;
	  private int level=1;
	  
	  
	  public MyScreen(int delay) {
	    scale = 1.0;
	    
	    myballs.add(new MyBall());
	    
	    timer = new Timer(delay, this);
	    setPreferredSize(new Dimension(500, 300));
	    timer.start();
	  }
	 
	  public void start() {
	    timer.start();
	  }
	 
	  public void stop() {
	    timer.stop();
	  }
	 
	  @Override
	  public void actionPerformed(ActionEvent arg0) {   
	    repaint();
	  }
	 
	  @Override
	  protected void paintComponent(Graphics g) {
	    Graphics2D g2d = (Graphics2D) g;
	    g2d.setColor(Color.white);
	    g.fillRect(0, 0, width, height);
//	    g2d.setColor(Color.black);
//	    g2d.drawRect(0, 0, width - 1, height - 1);	
	    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	    
	    mydamper.damperDraw(g2d,scale);
	    boolean adding=false;
	    int index=255;
	    for(MyBall myball:myballs)
	    {
	    	myball.ballDraw(g2d,scale);
	    	if(collision(myball,mydamper))
	    	{
	    		System.out.println("Collision");
	    		index=myballs.indexOf(myball);
	    		gameStory();
	    	}
	    	if((myball.getX()>x/2)&&(myball.getFlag()))
			{
	    		myball.setFlag();
	    		adding=true;
			}
	    }
	    System.out.println(index);
	    if(index<255)
	    {
	    	myballs.remove(index);
	    }
	    if(adding)
	    {
	    	myballs.add(new MyBall());
	    }
	    
	    drawInfo(g2d);
	    
	  }
	  
	  public void drawInfo(Graphics2D g2d) {
		  g2d.drawString("Score: "+score,20,300);
		  g2d.drawString("Level: "+level,80,300);
	  }
	  
	  public void gameStory() {
		  score++;
		  if((score/5)>0)
		  {
			  MyBall.speed=score/5+1;
		  }
		  else
		  {
			  MyBall.speed=1;
		  }
	  }
	  
	  public boolean collision(MyBall mb,MyDamper md) {
		  
		  if((mb.getX()+mb.getD())>x)
		  {
			  if(((mb.getY()>md.getY())
					  &&(mb.getY()<(md.getY()+md.getHeight())))||
			  	(((mb.getY()+mb.getD())>md.getY())
					  &&((mb.getY()+mb.getD())<(md.getY()+md.getHeight()))))
			  {
				  return true;
			  }
		  }
		  return false;
	  }
	  
	  public void setMyY(int u) {
		  System.out.println("Screen");
		  mydamper.setY(u);
		  //repaint();
	  }
}
