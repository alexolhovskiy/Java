package alex_olhovskiy.OOP_Seminar1;

public class HotDrinksVendingMachine implements VendingMachine {

	@Override
	public HotDrink getProduct(String name, int volume, int temperature) {
		switch(name) {
			case "tea":
				return new Tea(temperature,volume);
			case "coffee":
				return new Coffee(temperature,volume);
			case "chocolate":
				return new Chocolate(temperature,volume);
		}
		return null;
	}
	
}
