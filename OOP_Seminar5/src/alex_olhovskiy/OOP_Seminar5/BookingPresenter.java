package alex_olhovskiy.OOP_Seminar5;

import java.util.ArrayList;
import java.util.Date;

public class BookingPresenter implements ViewObserver {
	//private final BookingView view;
	private final BookingView2 view;
	private final TableModel model;
	
	public BookingPresenter(BookingView2 view,TableModel model) {
		this.view=view;
		this.model=model;
		this.model.loadReservation();
		view.setObserver(this);
	}
	
	/*public BookingPresenter(BookingView view,TableModel model) {
		this.view=view;
		this.model=model;
		this.model.loadReservation();
		view.setObserver(this);
	}*/

	public void onReservationTable(Date date,int hour,int tableNo,String name) {
		if(model.reservationTableAdd(date,hour,tableNo,name))
		{
			view.showReservationTableOk();
		}
		else
		{
			view.showReservationTableError();
		}
	}
	
	public void onRemoveReservationTable(Date date,int hour,int tableNo,String name) {
		model.reservationTableRemove(date,hour,tableNo,name);
	}
	
	public String showReservations() {
		return model.showReservations();
	}
	
	public Table [] showReservationsPerDate(Date date) {
		return model.showReservationsPerDate(date); 
	}
	
	/*public void Controller() {
		view.Controller();
	}*/
}
