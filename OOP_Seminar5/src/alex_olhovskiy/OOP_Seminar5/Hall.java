package alex_olhovskiy.OOP_Seminar5;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Hall extends JFrame{
	ArrayList<MyButton>tableButtons=new ArrayList<>();
	Table[]tables=new Table[4];
	
	public Hall(String date,Table[]tables) {
		super("Hall at "+date);
		this.tables=tables;
		this.setBounds(100,100,300,300);
		Container container=this.getContentPane();
		container.setLayout(new GridLayout(2,2,20,20));
		MyButton b;
		for(int i=0;i<4;i++)
		{
			b=new MyButton("Table "+(i+1),getVolume(this.tables[i]));
			tableButtons.add(b);
			b.addActionListener(new ButtonEvent(this.tables[i]));
			container.add(b);
		}
		
		
	}
	
	public int getVolume(Table table) {
		int volume=0;
		for(int i=0;i<4;i++)
		{
			if(!table.getHours(i).equals(" "))
			{
				volume++;
			}
		}
		return volume;
	}
	
	class ButtonEvent implements ActionListener {
		
		private DialogWindow dw;
		private Table table;
		
		public ButtonEvent(Table table) {
			this.table=table;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dw=new DialogWindow(table);
			dw.setVisible(true);
			
		}
		
		
	}
	
	class MyButton extends JButton {
		private static final int part=255/4;
		private int greenComponent;
		private int redComponent;
		
		public MyButton(String text,int volume) {
			super(text);
			greenComponent=(4-volume)*part;
			redComponent=volume*part;
			
			setBackground(new Color(redComponent,greenComponent,0));
		}
		
		
	   
	}
}
