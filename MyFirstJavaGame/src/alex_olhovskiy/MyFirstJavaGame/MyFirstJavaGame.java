package alex_olhovskiy.MyFirstJavaGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class MyFirstJavaGame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	          JFrame frame = new JFrame("Game");
	          JPanel panel = new JPanel();
	          
	          final MyScreen myscreen=new MyScreen(20);
	          panel.add(myscreen); 
	          frame.addKeyListener(new KeyListener() {
	        	  @Override
	        	  public void keyTyped(KeyEvent e) {
	        		  
	        	  }

	        	  @Override
	        	  public void keyPressed(KeyEvent e) {
	        		  switch(e.getKeyCode())
	        		  {
							case 38:
								System.out.println("y--");
								myscreen.setMyY(-1);
								break;
							case 40:
								System.out.println("y++");
								myscreen.setMyY(1);
								break;
						}
					}

	        	  @Override
	        	  public void keyReleased(KeyEvent e) {
					System.out.println("Key RELEASE");		
	        	  }  	  
		      });
	          
	          frame.getContentPane().add(panel);
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.setSize(600, 350);
	          frame.setVisible(true);
	        }
	      });

	}

}
