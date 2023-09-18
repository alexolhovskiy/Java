package alex_olhovskiy.MyShop2;

import java.util.HashMap;
import java.util.Random;

public class Provider extends Actor {
	
	private Random rand=new Random();
	
	public Provider(String name, int cashBox){
		super(name,cashBox);
	}
	
	public HashMap<Product,Integer>randomPurchase(){
		HashMap<Product,Integer>lproducts=new HashMap<>();
		int circles=1+rand.nextInt(7);
		for(int i=0;i<circles;i++)
		{
			ProductType pType=ProductType.values()[rand.nextInt(ProductType.values().length)];
			lproducts.put(new Product(pType.getName(),pType.getMarketPrice()),1+rand.nextInt(10));
		}
		return lproducts;
	}
	
	
}
