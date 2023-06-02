package alex_olhovskiy.seminar4_2;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Random rand=new Random();
	public static Scanner input=new Scanner(System.in);
	public static Mapa mapa=new Mapa();
	
	public static void main(String[] args) {
		
		mapa.Put(34, 45);
		mapa.Put(44, 14);
		mapa.Put(78, 34);
		mapa.Put(82, 76);
		mapa.Put(16, 56);
		
		MyMenu();
	}
	
	public static void MyMenu()
	{
		String str="";
		while(!str.equals("q"))
		{
			System.out.println("Main menu");
			System.out.println("Make your choice");
			System.out.println("Make random hash table -> m");
			System.out.println("Print whole hesh table -> p");
			System.out.println("Add element            -> a");
			System.out.println("Return element by key  -> r");
			System.out.println("Replace element value  -> rr");
			System.out.println("Is element with key    -> k");
			System.out.println("Is element with value  -> v");
			System.out.println("Hash Table size        -> s");
			System.out.println("Exit                   -> q");
			str=input.next();
			MenuItems(str);
		}
	}
	
	public static void MenuItems(String str)
	{
		Integer num=0;
		int num2=0;
		switch(str)
		{
			case "m":
				System.out.println("Enter Hash Table size");
				num=input.nextInt();
				for(int i=0;i<num;i++)
				{
					mapa.Put(i, rand.nextInt(num));
				}
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "a":
				System.out.println("Enter element key");
				num=input.nextInt();
				System.out.println("Enter element value");
				num2=input.nextInt();
				System.out.println(mapa.Put(num,num2));
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "r":
				System.out.println("Enter element key");
				num=input.nextInt();
				System.out.print(mapa.Remove(num)+" ");
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "rr":
				System.out.println("Enter element key");
				num=input.nextInt();
				System.out.println("Enter element value");
				num2=input.nextInt();
				System.out.println(mapa.Replace(num,num2));
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "p":
				mapa.Print();
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "s":
				System.out.println("Hash Table Size is "+mapa.Size());
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "v":
				System.out.println("Enter element value");
				num=input.nextInt();
				System.out.println(mapa.containsValue(num));
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "k":
				System.out.println("Enter element key");
				num=input.nextInt();
				System.out.println(mapa.containsKey(num));
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "q":
				break;
			default: break;
		}
	}

}
