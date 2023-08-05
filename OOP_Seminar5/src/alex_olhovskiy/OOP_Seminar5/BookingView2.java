package alex_olhovskiy.OOP_Seminar5;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BookingView2 extends JFrame {
	
	private JButton dateButton=new JButton("Date Search");
	private JTextField dataField=new JTextField("",5);
	private JButton clientButton=new JButton("Client Search");
	
	
	public BookingView2() {
		super("Main");
		this.setBounds(100,100,300,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=this.getContentPane();
		container.setLayout(new GridLayout(3,1,5,5));
		
		dateButton.addActionListener(new DateButtonListener());
		clientButton.addActionListener(new ClientButtonListener());
		
		container.add(dataField);
		container.add(dateButton);
		container.add(clientButton);
	}
	
	class DateButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String dateStr=dataField.getText();
			String dateStr2=String.format("%tF",new Date());
			System.out.println(dateStr);
			System.out.println(dateStr2);
			if(dateStr2.equals(dateStr))
			{
				System.out.println("Dates are equals");
			}
			else
			{
				System.out.println("Dates are not equals");
			}
			
		}
		
	}
	
	
	class ClientButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String clientStr=dataField.getText();
			System.out.println(clientStr);
		}
		
	}
	
}
