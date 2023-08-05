package alex_olhovskiy.OOP_Seminar5;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class DialogWindow extends JFrame  {
	
	ArrayList<JRadioButton>hours=new ArrayList<>();
	JButton addButton=new JButton("add");
	public DialogWindow() {
		super("Reserv Table");
		this.setBounds(100,100,300,300);
		Container container=this.getContentPane();
		container.setLayout(new GridLayout(7,3,20,20));
		JRadioButton rb;
		for(int i=0;i<6;i++)
		{
			rb=new JRadioButton(" "+(i+18)+":00-"+(i+19)+":00");
			hours.add(rb);
			container.add(rb);
			container.add(new JLabel("name"));
		}
		container.add(addButton);
	}
}
