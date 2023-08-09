package alex_olhovskiy.OOP_Seminar6HT;

public class Presenter implements PresenterInterface{
	private ModelInretface model;
	private ViewInterface view;
	
	public Presenter(Model model,View view) {
		this.model=model;
		this.view=view;
		this.view.setPresenter(this);
	}
	
	public void makeOrder(String clientName,String product,int qnt,double price) {
		model.makeOrder(clientName,product,qnt,price);
	}
	
	public void showOrders() {
    	int arrSize=model.getSize();
    	for(int i=0;i<arrSize;i++)
    	{
    		view.outputToConsole(model.getOrder(i),i);
    	}
    }
	
	public void saveOrders() {
    	model.saveOrders();
    }
	
	public void loadOrders() {
		model.loadOrders();
	}
	
	public void Controller() {
		view.Controller();
	}
}
