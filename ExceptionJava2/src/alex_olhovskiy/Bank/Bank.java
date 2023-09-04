package alex_olhovskiy.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	public static ArrayList<BancAccount>accounts=new ArrayList<>();
	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		String str="";
		while(!str.equals("q"))
		{
			System.out.println("Create new account? y/n");
			if(input.next().equals("y"))
			{
				String name=message("Name");
				double balance=Double.parseDouble(message("Load"));
				accounts.add(new BancAccount(name,balance));
				//accounts.get(accounts.size()-1).start();
			}
		}
	}
	
	public static String message(String str) {
		System.out.println("Enter "+str);//name+load+withdrow money
		return input.next();
	}
}
