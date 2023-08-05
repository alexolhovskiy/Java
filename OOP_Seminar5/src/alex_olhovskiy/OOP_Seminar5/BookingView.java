package alex_olhovskiy.OOP_Seminar5;

import java.util.ArrayList;
import java.util.Date;

public class BookingView implements View {
	
	private ViewObserver observer;
	
	public void showTable(ArrayList<Table>tables) {
		for(Table table:tables)
		{
			System.out.println(table);
		}
	}
	
	public void reservationTable(Date date, int tableNo, String name) {
		observer.onReservationTable(date,tableNo,name);
	}

	public void showReservationTableResult(int resId) {
		System.out.println(""+resId);
		
	}

	public void setObserver(BookingPresenter bookingPresenter) {
		observer=bookingPresenter;
		
	}

}
