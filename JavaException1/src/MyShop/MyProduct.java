package MyShop;

public class MyProduct {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public MyProduct(String name,int price) {
		this.name=name;
		this.price=price;
	}
	
	public boolean equals(Object product) {
		MyProduct t=(MyProduct)product;
		return name.equals(t.getName())&&price==t.getPrice();
	}
	
	public int hashCode(){
		return price;
	}
	
	public String toString() {
		return ""+name+" "+price;
	}

}
