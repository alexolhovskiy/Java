package alex_olhovskiy.OOP_Seminar1;

public class Chocolate extends HotDrink {
	private final double price=3;
	public Chocolate(int temperature,int volume)
	{
		super("chocolate",temperature,volume);
		total_price=Price(volume,price);
	}

}
