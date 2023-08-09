package alex_olhovskiy.OOP_Seminar6HT;

import java.util.Scanner;

public class View implements ViewInterface{
	private Scanner input = new Scanner(System.in);
	private PresenterInterface presenter;
	
	public void inputFromConsole(){
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int qnt = Integer.parseInt(prompt("Quantity: "));
        double price = Double.parseDouble(prompt("Price: "));
        presenter.makeOrder(clientName,product,qnt,price);
    }

    private String prompt(String message) {
        System.out.print(message);
        return input.next();
    }
    
    public void outputToConsole(Order order,int num) {
    	System.out.println("Order #: "+num);
    	System.out.println("Client name: "+order.getClientName());
    	System.out.println("Product: "+order.getProduct());
    	System.out.println("Quantity: "+order.getQnt());
    	System.out.println("Price: "+order.getPrice());	
    	Sep();
    }
    
    public static void Sep()
	{
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}
    	
    
    public void Menu() {
		System.out.println("Menu");
		System.out.println("Show orders    		  ->s");
		System.out.println("Load orders 		  ->d");
		System.out.println("Make order            ->a");
		System.out.println("Save orders           ->w");
		System.out.println("Exit                  ->q");
	}
    
    public void showOrders() {
    	presenter.showOrders();
    }
    
    public void loadOrders() {
    	presenter.loadOrders();
    }
    
    public void saveOrders() {
    	System.out.println("File will be rewrite! Are you sure? y/n");
    	if(input.next().equals("y"))
    	{
    		presenter.saveOrders();
    	}
    }
    
	public void Controller() {
		System.out.println("Controller"); 
		String c="";
		while(!c.equals("q"))
		{
			Menu();
			c=input.next();
			switch(c)
			{
				case "s":
					showOrders();
					break;
				case "d":
					loadOrders();
					break;
				case "a":
					inputFromConsole();
					break;
				case "w":
					saveOrders();
					break;
				default:break;
			}
		}
	}

    
    public void setPresenter(PresenterInterface presenter) {
    	this.presenter=presenter;
    }
}
