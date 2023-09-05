package MyShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Castomer {
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
	
	public Castomer(String name) {
		this.name=name;
	}
	
	public HashMap<MyProduct,Integer> makeOrderList() {
		int temp=rand.nextInt(5);
		HashMap<MyProduct,Integer>products=new HashMap<>();
		for(int i=0;i<temp;i++)
		{
			products.put(productsList.get(rand.nextInt(8)),rand.nextInt(5));
		}
		return products;
	}

}
