package alex_olhovskiy.OOP_Seminar5;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class DialogWindow extends JFrame  {
	
	ArrayList<JRadioButton>hourRadio=new ArrayList<>();
	JButton addButton=new JButton("add");
	ArrayList<JLabel>names=new ArrayList<>(); 
	Table table;
	public DialogWindow(Table table) {
		super("Reserv Tables");
		this.table=table;
		this.setBounds(100,100,300,300);
		Container container=this.getContentPane();
		container.setLayout(new GridLayout(7,3,20,20));
		JRadioButton rb;
		for(int i=0;i<4;i++)
		{
			rb=new JRadioButton(" "+(i+20)+":00-"+(i+21)+":00");
			hourRadio.add(rb);
			container.add(rb);
			if(!table.getHours(i).equals(" "))
			{
				rb.setSelected(true);
				names.add(new JLabel(table.getHours(i)));
			}
			else
			{
				rb.setSelected(false);
				names.add(new JLabel("free"));
			}
			container.add(names.get(i));
		}
		container.add(addButton);
	}
}
