package alex_olhovskiy.Animation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.Timer;

import javax.swing.JComponent;

public class MovingCircle extends JComponent implements ActionListener {
	  private double scale;
	  private Color color;
	  private Timer timer;
	  public double x =10;
	  public double y =10;
	 
	  public MovingCircle(Color color, int delay) {
	    scale = 1.0;
	    timer = new Timer(delay, this);
	    this.color = color;
	    setPreferredSize(new Dimension(500, 500));
	  }
	 
	  public void start() {
	    timer.start();
	  }
	 
	  public void stop() {
	    timer.stop();
	  }
	 
	  public void actionPerformed(ActionEvent arg0) {   
	    repaint();
	  }
	 
	  @Override
	  protected void paintComponent(Graphics g) {
	    Graphics2D g2d = (Graphics2D) g;
	    g2d.setColor(Color.white);
	    int width = 500;
	    int height = 500;
	    g.fillRect(0, 0, width, height);
	    g2d.setColor(Color.black);
	    g2d.drawRect(0, 0, width - 1, height - 1);	
	    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	    g2d.setColor(color);	
	    g2d.scale(scale, scale);	
	    x++;
	    y++;
	    g2d.fillOval((int)x, (int)y, 20, 20);
	    //Ellipse2D el = new Ellipse2D.Double(x, y, 20, 20);
	    //g2d.fill(el);
	  }
}
