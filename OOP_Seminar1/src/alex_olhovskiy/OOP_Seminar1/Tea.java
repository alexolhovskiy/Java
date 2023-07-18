package alex_olhovskiy.OOP_Seminar1;

public class Tea extends HotDrink {
	private final double price=1;
	
	public Tea(int temperature,int volume)
	{
		super("tea",temperature,volume);
		total_price=Price(volume,price);
	}
}
