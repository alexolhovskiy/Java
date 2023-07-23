package alex_olhovskiy.OOP_Seminar2;

public class Product {
	private int price;
	private String name;
	
	public Product(String name,int price) {
		this.name=name;
		this.price=price;
	}
	
	public String GetName() {
		return this.name;
	}
	
	public int GetPrice() {
		return this.price;
	}
	
	public boolean equals(Object O) {
		return this.name==((Product)O).name;
	}
	
	public int hashCode()
    {
        return name.hashCode();
    }
	
	
	public String toString() {
		return this.name;
	}
}
