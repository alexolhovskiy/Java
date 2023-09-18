package alex_olhovskiy.MyShop2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Castomer extends Actor{
	
	private Random rand=new Random();
	
	public Castomer(String name, int cashBox){
		super(name,cashBox);
	}
	
	public HashMap<Product,Integer>randomPurchase(){
		HashMap<Product,Integer>lproducts=new HashMap<>();
		int circles=1+rand.nextInt(3);
		for(int i=0;i<circles;i++)
		{
			ProductType pType=ProductType.values()[rand.nextInt(ProductType.values().length)];
			lproducts.put(new Product(pType.getName(),pType.getMarketPrice()),1+rand.nextInt(5));
		}
		return lproducts;
	}
	
	public String productsToString(){
		StringBuilder sb=new StringBuilder();
		for(Map.Entry<Product,Integer>productSet:products.entrySet())
		{
			sb.append(productSet.getKey().toString());
			sb.append(" amount is ");
			sb.append(""+productSet.getValue());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public String toString(){
		return name+" "+cashBox+"\n"+productsToString();
	}
}
