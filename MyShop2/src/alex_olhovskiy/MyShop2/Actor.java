package alex_olhovskiy.MyShop2;

import java.util.HashMap;
import java.util.Map;

public class Actor {
	protected String name;
	protected double cashBox;
	protected HashMap<Product,Integer>products=new HashMap<>();
	protected HashMap<Product,Integer>order=new HashMap<>();
	
	
	public Actor(String name,int cashBox){
		this.name=name;
		this.cashBox=cashBox;
	}	

	public HashMap<Product,Integer>formPossibleMap(HashMap<Product,Integer>lWantedProducts){
		HashMap<Product,Integer>map=new HashMap<>();
		Product product;
		int value=0;
		int temp=0;
		double tempPrice=0;
		for(Map.Entry<Product,Integer>lWantedProduct:lWantedProducts.entrySet())
		{
			product=lWantedProduct.getKey();
			value=lWantedProduct.getValue();
			if(products.containsKey(product))
			{
				temp=products.get(product);
				if((temp-value)>=0)
				{
					map.put(product,value);
				}
				else
				{
					map.put(product,temp);
				}
			}
		}
		return map;
	}
	
	public HashMap<Product,Integer>formVerificationMap(HashMap<Product,Integer>possibleMap){
		HashMap<Product,Integer>verificationMap=new HashMap<>();
		//Product product=null;
		int value=0;
		int temp=0;
		double tempPrice=0;
		double tempTotalPrice=0;
		for(Map.Entry<Product,Integer>possibleProduct:possibleMap.entrySet())
		{
			Product product=possibleProduct.getKey();
			value=possibleProduct.getValue();
			tempPrice=product.getPrice();
			tempTotalPrice=tempPrice*value;
			int amount=0;
			if(products.containsKey(product))
			{
				amount=products.get(product);
			}
			
			if(tempTotalPrice<cashBox)
			{
				verificationMap.put(product,value);
				products.put(product,amount+value);
				cashBox-=tempTotalPrice;
			}
			else
			{
				value=(int)(cashBox/tempPrice);
				verificationMap.put(product,value);
				products.put(product,amount+value);
				cashBox-=(tempPrice*value);
			}		
		}
		return verificationMap;
	}
	
	public HashMap<Product,Integer> mapUpdate(){
		HashMap<Product,Integer>map=new HashMap<>();
		for(Map.Entry<Product,Integer>mapSet:order.entrySet())
		{
			Product product=mapSet.getKey();
			int value=mapSet.getValue();
			int amount=0;
			if(products.containsKey(product))
			{
				amount=value-products.get(product);
			}
			else
			{
				amount=value;
			}
			if(amount>=0)
			{
				map.put(product,amount);
			}
		}
		return map;
	}
	
	public void saleProducts(HashMap<Product,Integer>verificationMap){
		Product product;
		int value=0;
		int temp=0;
		double tempPrice=0;
		for(Map.Entry<Product,Integer>verificationProduct:verificationMap.entrySet())
		{
			product=verificationProduct.getKey();
			value=verificationProduct.getValue();
			tempPrice=product.getPrice();
			if(products.containsKey(product))
			{
				temp=products.get(product);
				if((temp-value)>=0)
				{
					products.put(product,temp-value);
					cashBox+=tempPrice*value;
				}
				else
				{
					products.remove(product);
					cashBox+=tempPrice*temp;
				}
			}
		}
	}
	
	public HashMap<Product,Integer>getProduct(Product product,int num){
		HashMap<Product,Integer>lproducts=new HashMap<>();
		lproducts.put(product,products.get(product));
		return lproducts;
	}
	
	public HashMap<Product,Integer>getOrder(){
		return order;
	}
	
	public HashMap<Product,Integer>getProducts(){
		return products;
	}
	
	public String productToString(){
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
		return name+" "+cashBox+"\n"+productToString();
	}
}
