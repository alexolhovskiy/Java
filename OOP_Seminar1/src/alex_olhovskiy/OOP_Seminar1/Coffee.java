package alex_olhovskiy.OOP_Seminar1;

public class Coffee extends HotDrink {
	private final double price=2;
	public Coffee(int temperature,int volume)
	{
		super("coffee",temperature,volume);
		total_price=Price(volume,price);
	}

}
