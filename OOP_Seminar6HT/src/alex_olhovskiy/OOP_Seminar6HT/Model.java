package alex_olhovskiy.OOP_Seminar6HT;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Model implements ModelInretface{
	
	private ArrayList<Order>orders=new ArrayList<>();
	
	private FileWorkerInterface fileWorker=new FileWorker();
	
	public void makeOrder(String clientName,String product,int qnt,double price) {
		orders.add(new Order(clientName,product,qnt,price));
	}
	
	public int getSize() {
		return orders.size();
	}
	
	public Order getOrder(int index) {
		return orders.get(index);
	}
	
	public void saveOrders() {
		fileWorker.clearFile();
		for(Order order:orders)
		{
			fileWorker.saveToJson(order);
		}
    }
	
	public void loadOrders() {
		try {
			orders=fileWorker.loadFromJson();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
