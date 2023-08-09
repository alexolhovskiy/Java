package alex_olhovskiy.OOP_Seminar6HT;

public interface ViewInterface {
	void inputFromConsole();
	void outputToConsole(Order order,int num);
	void showOrders();
	void loadOrders();
	void saveOrders();
	void Controller();
	void setPresenter(PresenterInterface presenter);
}
