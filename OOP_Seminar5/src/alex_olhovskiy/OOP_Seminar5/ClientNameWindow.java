package alex_olhovskiy.OOP_Seminar5;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ClientNameWindow extends JFrame{
	private JTextField clientField=new JTextField("",5);
	private JButton clientAddButton=new JButton("Client Add");
	
	public ClientNameWindow(){
		super("Add Client");
		this.setBounds(100,100,300,100);
		Container container=this.getContentPane();
		container.setLayout(new GridLayout(2,1,5,5));
		
		container.add(clientField);
		container.add(clientAddButton);
	}
}
