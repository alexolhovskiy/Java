package alex_olhovskiy.MyShop;

public class Product {
	private ProductType pType;
	private double price;
	
	public Product(String name,int price){
		pType=ProductType.valueOf(name);
		this.price=price;
	}
	
	public ProductType getPType(){
		return pType;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double newPrice){
		price=newPrice;
	}
	
	public int hashCode(){
		return pType.getMarketPrice();
	}
	
	public boolean equals(Object o){
		Product temp=(Product)o;
		return pType.toString().equals(temp.pType.toString())&&pType.getMarketPrice()==temp.getPType().getMarketPrice();
	}
	
	public String toString(){
		return pType.getName()+" "+price;
	}
	
}
