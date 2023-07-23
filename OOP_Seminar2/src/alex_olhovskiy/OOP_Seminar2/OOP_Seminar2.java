package alex_olhovskiy.OOP_Seminar2;

public class OOP_Seminar2 {
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		Human human=new Human();
		Human human1=new Human("Sergey");
		Human human2=new Human("Nikolay");
		Human human3=new Human("Vladimir");
//		System.out.println(human.getName());
//		System.out.println(human.isMakeOrder());
//		System.out.println(human.isTakeOrder());
		
		Sep();
//		human.setMakeOrder();
//		human.setTakeOrder();
//		
//		System.out.println(human.isMakeOrder());
//		System.out.println(human.isTakeOrder());
//		
//		Sep();
//		human.setMakeOrder();
//		human.setTakeOrder();
//		
//		System.out.println(human.isMakeOrder());
//		System.out.println(human.isTakeOrder());
//		
//		Sep();
//		human.setMakeOrder();
//		human.setTakeOrder();
//		
//		System.out.println(human.isMakeOrder());
//		System.out.println(human.isTakeOrder());
		
		Market market=new Market();
		
		market.update(new Product("Vodka",100), 32, true);
		market.update(new Product("Tank",1000), 10, true);
		market.update(new Product("Matreshka",50), 57, true);
		market.update(new Product("Medved",500), 5, true);
		market.update(new Product("Vodka",100), 45, true);
		market.update(new Product("Kalashnikov",100), 1000000, true);
		
		market.ShowProducts();
		market.ShowCastomers();
		Sep();
		
		market.acceptToMarket(human);
		market.acceptToMarket(human1);
		market.acceptToMarket(human2);
		market.acceptToMarket(human3);
		
		market.ShowProducts();
		market.ShowCastomers();
		Sep();
		
		System.out.println(human);
		System.out.println(human1);
		System.out.println(human2);
		System.out.println(human3);
		Sep();

		
		human2.makeOrder("Vodka", 10);
		human2.makeOrder("Kalashnikov", 5);
		human3.makeOrder("Vodka", 30);
		human3.makeOrder("Tank", 2);
		
		
		market.takeInQueue(human2);
		human2.buy(market.takeOrders(human2.order,human2));
		market.takeInQueue(human3);
		human3.buy(market.takeOrders(human3.order,human3));
		
		System.out.println(human);
		System.out.println(human1);
		System.out.println(human2);
		System.out.println(human3);
		Sep();
		
		human2.pay(1000);
		market.giveOrders(human2,1000);
		human3.pay(400);
		market.giveOrders(human3,400);
		
		System.out.println(human);
		System.out.println(human1);
		System.out.println(human2);
		System.out.println(human3);
		Sep();
		
		market.releaseFromMarket(human);
		market.releaseFromMarket(human1);
		market.releaseFromMarket(human2);
		market.releaseFromMarket(human3);
		
		
		market.ShowProducts();
		market.ShowCastomers();
		Sep();
		
	}
	
	public static void Sep()
	{
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}
}
