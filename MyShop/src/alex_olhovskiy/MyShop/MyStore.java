package alex_olhovskiy.MyShop;

import java.util.HashMap;
import java.util.Map;

public class MyStore extends Actor {
	
	
	
	
	public MyStore(String name, int cashBox){
		super(name,cashBox);
		order.put(new Product("Milk",ProductType.valueOf("Milk").marketPrice),10);
		order.put(new Product("Meet",ProductType.valueOf("Meet").marketPrice),10);
		order.put(new Product("Bread",ProductType.valueOf("Bread").marketPrice),10);
		order.put(new Product("Vodka",ProductType.valueOf("Vodka").marketPrice),10);
		order.put(new Product("Apple",ProductType.valueOf("Apple").marketPrice),10);
		order.put(new Product("Banana",ProductType.valueOf("Banana").marketPrice),10);
		order.put(new Product("Cheburec",ProductType.valueOf("Cheburec").marketPrice),10);
	}
	
	
	
//	public HashMap<Product,Integer>selectProduct(HashMap<Product,Integer>map){
//		int lPrice=0;
//		for(Map.Entry<Product,Integer>mapSet:map.entrySet())
//		{
//			Product product=mapSet.getKey();
//			int value=mapSet.getValue();
//			lPrice=value*product.getPrice();
//			if(lPrice<cashBox)
//			{
//				
//			}
//		}
//	}

}
