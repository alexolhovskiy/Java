package alex_olhovskiy.OOP_Seminar1;

public class OOP_Seminar1 {

	public static void main(String[] args) {
		
		HotDrinksVendingMachine hdvm=new HotDrinksVendingMachine();
		HotDrink hd=hdvm.getProduct("tea",200,40);
		System.out.println(hd);
		hd=hdvm.getProduct("coffee",250,50);
		System.out.println(hd);
		hd=hdvm.getProduct("tea",400,50);
		System.out.println(hd);
		hd=hdvm.getProduct("chocolate",200,55);
		System.out.println(hd);
		hd=hdvm.getProduct("tea",206,46);
		System.out.println(hd);
		
	}

}
