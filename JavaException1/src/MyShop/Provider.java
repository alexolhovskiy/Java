package MyShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Provider {
	private Random rand=new Random();
	private String name;
	private HashMap<MyProduct,Integer>products=new HashMap<>();
	private ArrayList<MyProduct>productsList=new ArrayList<>();
	{
		productsList.add(new MyProduct("Milk",2));
		productsList.add(new MyProduct("Apple juce",2));
		productsList.add(new MyProduct("Bread",1));
		productsList.add(new MyProduct("Meat",10));
		productsList.add(new MyProduct("Vodka",5));
		productsList.add(new MyProduct("Potatoes",1));
		productsList.add(new MyProduct("Cereals",1));
		productsList.add(new MyProduct("AK-74",100));
	}
	
	public Provider(String name) {
		this.name=name;
	}
	
	public void makeProducts() {
		int temp=rand.nextInt(5);
		for(int i=0;i<temp;i++)
		{
			products.putIfAbsent(productsList.get(rand.nextInt(8)),1+rand.nextInt(4));
		}
	}
	
	public HashMap<MyProduct,Integer>getProducts(){
		return products;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(name);
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
