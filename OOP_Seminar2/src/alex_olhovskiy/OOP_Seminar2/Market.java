package alex_olhovskiy.OOP_Seminar2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Market implements MarketBehavior,QueueBehavior {
	
	private HashMap <Actor,Integer> bills=new HashMap<>();
	private HashMap <Product,Integer> products=new HashMap<>();
	private List <Actor> actorsInMarket=new ArrayList<>();
	private List <Actor> actorsInQueue=new ArrayList<>();
	
	public Market(){
		
	}

	@Override
	public void takeInQueue(Actor actor) {
		actorsInQueue.add(actor);
	}

	@Override
	public void releaseFromQueue(Actor actor) {
		actorsInQueue.remove(actor);
	}

	@Override
	public void giveOrders(Actor actor,int money) {
		if(bills.containsKey(actor))
		{
			if(bills.get(actor)==money)
			{
				releaseFromQueue(actor);
			}
		}
	}

	@Override
	public int takeOrders(HashMap<String,Integer>order,Actor actor) {
		int bill=0;
		for(Map.Entry<String,Integer>item:order.entrySet())
		{
			bill+=orderCheck(item.getKey(), item.getValue());
		}
		bills.put(actor, bill);
		//System.out.println(bill);
		return bill;
	}
	
	public int orderCheck(String name, int num) {
		int bill=0;
		for(Map.Entry<Product,Integer>item:products.entrySet())
		{
			//System.out.println(item.getKey().GetName()+" "+name);
			if(item.getKey().GetName().equals(name))
			{
				//System.out.println("equals");
				if(item.getValue()>=num)
				{
					update(item.getKey(),num,false);
					bill=item.getKey().GetPrice()*num;
				}
			}
		}
		//System.out.println(bill);
		return bill;
	}

	@Override
	public void acceptToMarket(Actor actor) {
		actorsInMarket.add(actor);
	}

	@Override
	public void releaseFromMarket(Actor actor) {
		actorsInMarket.remove(actor);
	}

	@Override
	public int update(Product product,int num,boolean flag) {
		int currantlyPresent=0;
		
		if(products.containsKey(product))
		{
			currantlyPresent=products.get(product);
		}
		
		
		if(flag)
		{
			currantlyPresent+=num;
			products.put(product,currantlyPresent);
		}
		else
		{
			currantlyPresent-=num;
			products.put(product,currantlyPresent);
		}
		
		return currantlyPresent;
	}
	
	public void ShowProducts() {
		System.out.println(products);
	}
	
	public void ShowCastomers() {
		System.out.println(actorsInMarket);
	}

	
}
