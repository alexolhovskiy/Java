package MyShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyStore {
	private HashMap<MyProduct,Integer>products=new HashMap<>();
	{
		products.put(new MyProduct("Milk",2),0);
		products.put(new MyProduct("Apple juce",2),0);
		products.put(new MyProduct("Bread",1),0);
		products.put(new MyProduct("Meat",10),0);
		products.put(new MyProduct("Vodka",5),0);
		products.put(new MyProduct("Potatoes",1),0);
		products.put(new MyProduct("Cereals",1),0);
	}
	
	public void add(MyProduct product,int value) {
		
		if(products.containsKey(product))
		{
			System.out.println("YES");
			int temp=products.get(product);
			int temp2=0;
			if(temp<20)
			{
				temp2=value-(20-temp);
				if(temp2>0)
				{
					temp2=value-temp2;
				}
				else
				{
					temp2=value;
				}
			}
			products.remove(product);
			products.put(product, temp2+temp);
		}
		////
	}
	
	public int get(HashMap<MyProduct,Integer>order){
		int price=0;
		for(Map.Entry<MyProduct, Integer>product:order.entrySet())
		{
			MyProduct mp=product.getKey();
			int v=product.getValue();
			int presentValue=products.get(mp);
			if(presentValue<v)
			{
				//////
			}
			price+=mp.getPrice()*v;
			products.remove(mp);
			products.put(mp,presentValue-v);
		}
		return price;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("=================================");
		sb.append('\n');
		sb.append("Store");
		sb.append('\n');
		for(Map.Entry<MyProduct,Integer>product:products.entrySet())
		{
			sb.append(product.getKey().toString());
			sb.append(" ");
			sb.append(product.getValue().toString());
			sb.append('\n');
		}
		return sb.toString();
	}
}
