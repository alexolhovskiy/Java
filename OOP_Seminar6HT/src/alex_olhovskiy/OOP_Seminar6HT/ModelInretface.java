package alex_olhovskiy.OOP_Seminar6HT;

public interface ModelInretface {
	void makeOrder(String clientName,String product,int qnt,double price);
	void saveOrders();
	int getSize();
	Order getOrder(int i);
	void loadOrders();
}
