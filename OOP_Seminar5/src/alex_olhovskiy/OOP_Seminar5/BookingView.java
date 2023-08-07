package alex_olhovskiy.OOP_Seminar5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BookingView implements View {
	
	private Scanner input=new Scanner(System.in);
	
	private ViewObserver observer;
	
	public void reservationTable() {
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
	}
	
	public void showReservations() {
		System.out.println(observer.showReservations());
	}
	
	/*public void showReservationsPerDate() {
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
		System.out.println(observer.showReservationsPerDate(date));
	}*/
	
	public void showReservationsPerDate() {
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
		Table[]tables=observer.showReservationsPerDate(date);
		for(int i=0;i<tables.length;i++)
		{
			System.out.println(tables[i]);
		}
	}
	
	

	public void setObserver(BookingPresenter bookingPresenter) {
		observer=bookingPresenter;
	}
	
	public void Menu() {
		System.out.println("Menu");
		System.out.println("Show All reservations      ->s");
		System.out.println("Show reservations per date ->d");
		System.out.println("Make reservation           ->a");
		System.out.println("Remove reservation         ->r");
		System.out.println("Exit                       ->q");
	}
	
	public void Controller() {
		System.out.println("Controller"); 
		String c="";
		while(!c.equals("q"))
		{
			Menu();
			c=input.next();
			switch(c)
			{
				case "s":
					showReservations();
					break;
				case "d":
					showReservationsPerDate();
					break;
				case "a":
					reservationTable();
					break;
				case "r":
					removeReservationTable();
					break;
				default:break;
			}
		}
	}

}
