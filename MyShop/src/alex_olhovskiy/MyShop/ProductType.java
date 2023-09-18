package alex_olhovskiy.MyShop;

public enum ProductType {
	Milk("Milk",2),
	Meet("Meet",5),
	Bread("Bread",1),
	Vodka("Vodka",5),
	Apple("Apple",1),
	Banana("Banana",1),
	Cheburec("Cheburec",3);
	
	int marketPrice;
	String name;
	
	ProductType(String name,int marketPrice){
		this.name=name;
		this.marketPrice=marketPrice;
	}
	
	public int getMarketPrice(){
		return marketPrice;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return name+" "+marketPrice;
	}
}
