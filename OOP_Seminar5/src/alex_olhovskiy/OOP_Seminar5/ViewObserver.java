package alex_olhovskiy.OOP_Seminar5;

import java.util.Date;

public interface ViewObserver {
	void onReservationTable(Date date, int tableNo, String name);
}
