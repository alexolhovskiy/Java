package alex_olhovskiy.OOP_Seminar1;

public class HotDrink {
	protected String name;
	protected int temperature;
	protected int volume;
	protected double total_price=0;
	
	public HotDrink(String name,int temperature,int volume) {
		this.name=name;
		this.temperature=temperature;
		this.volume=volume;
	}
	
	public HotDrink() {
		this("water",30,250);
	}
	
	public double Price(int volume,double price) {
		return price*volume;
	}
	
	public String toString() {
		return "Drink name: "+this.name+" Temperature: "+
				this.temperature+" Volume: "+this.volume+
				" Price: "+this.total_price;
	}

}
