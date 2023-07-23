package alex_olhovskiy.OOP_Seminar2;

import java.util.ArrayList;
import java.util.HashMap;

public class Human extends Actor implements ActorBehavior {
	
	public HashMap <String,Integer> order=new HashMap<>();
	
	private int debt=0;
	
	public Human(String name) {
		super.name=name;
		super.isMakeOrder=false;
		super.isTakeOrder=false;
	}
	
	public Human() {
		this("customer");
	}
	

	@Override
	public void setMakeOrder() {
		super.isMakeOrder^=true;
	}

	@Override
	public void setTakeOrder() {
		super.isTakeOrder^=true;
	}

	@Override
	public boolean isTakeOrder() {
		return super.isTakeOrder;
	}

	@Override
	public boolean isMakeOrder() {
		return super.isMakeOrder;
	}

	@Override
	public String getName() {
		return super.name;
	}
	
	public void buy(int money) {
		debt+=money;
	}
	public void pay(int money) {
		debt-=money;
	}
	
	
	public void makeOrder(String product,int num) {
		int currantlyPresent=0;
		
		if(order.containsKey(product))
		{
			currantlyPresent=order.get(product);
		}
		
		currantlyPresent+=num;
		order.put(product,currantlyPresent);
	}
	
	
	public String toString() {
		return "Castomer "+name+"; Debt is: "+debt+"; Current order: "+order;
	}
	
}
