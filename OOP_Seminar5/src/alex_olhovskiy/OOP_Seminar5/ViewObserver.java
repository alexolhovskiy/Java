package alex_olhovskiy.OOP_Seminar5;

import java.util.Date;

public interface ViewObserver {
	void onReservationTable(Date date,int hour,int tableNo,String name);
	void onRemoveReservationTable(Date date,int hour,int tableNo,String name);
	String showReservations();
	//String showReservationsPerDate(Date date);
	Table[]showReservationsPerDate(Date date);
}
