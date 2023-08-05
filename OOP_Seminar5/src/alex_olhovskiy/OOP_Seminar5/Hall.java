package alex_olhovskiy.OOP_Seminar5;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Hall extends JFrame{
	ArrayList<JButton>tables=new ArrayList<>();
	
	public Hall() {
		super("Tables");
		this.setBounds(100,100,300,300);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=this.getContentPane();
		container.setLayout(new GridLayout(3,3,20,20));
		JButton b;
		for(int i=0;i<9;i++)
		{
			b=new JButton("Table "+(i+1));
			tables.add(b);
			b.addActionListener(new ButtonEvent());
			container.add(b);
		}
	}
}
