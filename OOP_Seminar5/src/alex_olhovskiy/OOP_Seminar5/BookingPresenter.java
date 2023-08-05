package alex_olhovskiy.OOP_Seminar5;

import java.util.ArrayList;
import java.util.Date;

public class BookingPresenter implements ViewObserver {
	private final BookingView view;
	private final TableModel model;
	
	public BookingPresenter(BookingView view,TableModel model) {
		this.view=view;
		this.model=model;
		view.setObserver(this);
	}


	public void onReservationTable(Date date,int tableNo,String name) {
		int resId=model.reservationTable(date, tableNo, name);
		showReservationTableResult(resId);
	}
	
	public void showReservationTableResult(int resId) {
		view.showReservationTableResult(resId);
	}
	
	private ArrayList<Table> loadTable(){
		return model.loadTable();
	}
	
	public void showTables() {
		view.showTable(loadTable());
	}
	
	
}
