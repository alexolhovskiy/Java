package alex_olhovskiy.Animation;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Animation {

	public static void main(String[] args) {
	    SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	          JFrame frame = new JFrame("Moving Circle");
	          JPanel panel = new JPanel();
	          final MovingCircle MovingCircleGreen = new MovingCircle(Color.green, 20);
	          panel.add(MovingCircleGreen);    
	          frame.getContentPane().add(panel);
	          final JButton button = new JButton("Start");
	          button.addActionListener(new ActionListener() {
	            private boolean pulsing = false;
	            @Override
	            public void actionPerformed(ActionEvent e) {
	              if (pulsing) {
	                pulsing = false;
	                MovingCircleGreen.stop();     
	                button.setText("Start");
	              } else {
	                pulsing = true;
	                MovingCircleGreen.start();   
	                button.setText("Stop");
	              }
	            }
	          });
	          panel.add(button);
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.setSize(600, 550);
	          frame.setVisible(true);
	        }
	      });
	    }

	}
