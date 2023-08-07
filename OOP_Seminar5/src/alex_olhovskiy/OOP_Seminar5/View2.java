package alex_olhovskiy.OOP_Seminar5;

import java.util.ArrayList;
import java.util.Date;

public interface View2 {
	void showTable(ArrayList<Table>tables);

	void setObserver(BookingPresenter bookingPresenter);
	
	void reservationTable(Date date, int tableNo, String name);
	
	void showReservationTableResult(int resId);
}
