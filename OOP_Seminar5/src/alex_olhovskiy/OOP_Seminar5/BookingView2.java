package alex_olhovskiy.OOP_Seminar5;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BookingView2 extends JFrame implements View{
	
	private ViewObserver observer;
	
	private JButton dateButton=new JButton("Date Search");
	private JTextField dataField=new JTextField("",5);
	private JButton clientButton=new JButton("Client Search");
	
	private Hall hall;
	
	
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
			String str=dataField.getText();
			SimpleDateFormat format = new SimpleDateFormat();
			format.applyPattern("yyyy-MM-dd");
			Date date = null;
			try {
				date=format.parse(str);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			hall=new Hall(str,observer.showReservationsPerDate(date));
			hall.setVisible(true);
		}
		
	}
	
	
	class ClientButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String clientStr=dataField.getText();
			System.out.println(clientStr);
		}
		
	}
	
	public void setObserver(BookingPresenter bookingPresenter) {
		observer=bookingPresenter;
	}
	
	
	
	/*public void reservationTable() {
		System.out.println("Enter date in format yyyy-MM-dd");
		SimpleDateFormat format = new SimpleDateFormat();
		format.applyPattern("yyyy-MM-dd");
		Date date = null;
		try {
			date=format.parse(input.next());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter Table Number");
		int tableNo=input.nextInt();
		
		System.out.println("Enter your hour from 20:00 - 1 till 23:00 - 4");
		int hour=input.nextInt();
		
		System.out.println("Enter Name");
		String name=input.next();
		
		System.out.println(""+date+" "+hour+" "+tableNo+" "+name);
		
		observer.onReservationTable(date,hour,tableNo,name);
	}

	public void showReservationTableOk() {
		System.out.println("Table reserved");
	}
	
	public void showReservationTableError() {
		System.out.println("Table can't be reserved");
	}
	
	public void removeReservationTable() {
		System.out.println("Enter date in format yyyy-MM-dd");
		SimpleDateFormat format = new SimpleDateFormat();
		format.applyPattern("yyyy-MM-dd");
		Date date = null;
		try {
			date=format.parse(input.next());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter Table Number");
		int tableNo=input.nextInt();
		
		System.out.println("Enter your hour from 20:00 - 1 till 23:00 - 4");
		int hour=input.nextInt();
		
		System.out.println("Enter Name");
		String name=input.next();
		
		observer.onRemoveReservationTable(date,hour,tableNo,name);
	}*/
	
	public void showReservations() {
		System.out.println(observer.showReservations());
	}



	@Override
	public void showReservationTableOk() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void showReservationTableError() {
		// TODO Auto-generated method stub
		
	}
	
}
