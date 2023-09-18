package alex_olhovskiy.MyShop2;

import java.util.Scanner;

public class View {
	private Scanner input=new Scanner(System.in);
	private Controller controller;
	
	public View(Controller controller){
		this.controller=controller;
	}
	
	public void menu(){
		System.out.println("Menu");
		System.out.println("Get a new circle    ->a");
	}
	
	public void action(){
		String str="";
		
		while(!str.equals("q"))
		{
			menu();
			str=input.next();
			switch(str)
			{
				case "a":
					controller.nextCircle();
					break;
				case "s":break;
				default:break;
			}
		}
	}
}
