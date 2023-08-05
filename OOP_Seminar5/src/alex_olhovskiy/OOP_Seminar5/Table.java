package alex_olhovskiy.OOP_Seminar5;

import java.util.ArrayList;

public class Table {
	
	private static int counter;
	private final int no;
	{
		no=++counter;
	}
	
	public int getNo() {
		return no;
	}
	
	public String toString() {
		return "Table "+no;
	}
	
	private final ArrayList<Reservation>reservations=new ArrayList<>();
	
	public ArrayList<Reservation>getReservation(){
		return reservations;
	}

}
