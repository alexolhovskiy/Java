package alex_olhovskiy.OOP_Seminar5;

public class OOP_Seminar5 {

	public static void main(String[] args) {
		BookingView2 view2=new BookingView2();
		view2.setVisible(true);
		//BookingView view=new BookingView();
		TableModel model=new TableModel();
		//BookingPresenter presenter=new BookingPresenter(view,model);
		BookingPresenter presenter=new BookingPresenter(view2,model);
		

		//presenter.Controller();
		
		System.out.println("OK");

	}

}
