package alex_olhovskiy.OOP_Seminar6HT;

public interface PresenterInterface {
	void makeOrder(String clientName,String product,int qnt,double price);
	void showOrders();
	void saveOrders();
	void Controller();
	void loadOrders();
}
