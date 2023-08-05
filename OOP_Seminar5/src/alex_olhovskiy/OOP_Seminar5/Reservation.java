package alex_olhovskiy.OOP_Seminar5;

import java.util.Date;

public class Reservation {
	
	private final int id;
	private Date date;
	private String name;
	private int tableNo;
	private static int counter=1000;
	
	public Reservation(Date date,int tableNo,String name) {
		this.date=date;
		this.name=name;
		this.tableNo=tableNo;
		id=++counter;
	}
	

}
