package alex_olhovskiy.seminar3;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner input=new Scanner(System.in);
	public static Random rand=new Random();
	public static Node mylist=new Node();
	public static void main(String[] args) {
		MyMenu();
	}
	
	public static void MyMenu()
	{
		String str="";
		while(!str.equals("q"))
		{
			System.out.println("Main menu");
			System.out.println("Make your choice");
			System.out.println("Make random list    -> m");
			System.out.println("Print list          -> p");
			System.out.println("Check list is empty -> c");
			System.out.println("Find index on value -> f");
			System.out.println("Add element in head -> a");
			System.out.println("Return head element -> r");
			System.out.println("Return tail element -> rr");
			System.out.println("Add element in tail -> t");
			System.out.println("List length         -> l");
			System.out.println("Revers              -> v");
			System.out.println("Revert              -> vv");
			System.out.println("Exit                -> q");
			System.out.println("Take from put to    -> w");
			str=input.next();
			MenuItems(str);
		}
	}
	
	public static void MenuItems(String str)
	{
		int num=0;
		int num2=0;
		long start=0;
		switch(str)
		{
			case "m":
				System.out.println("Enter list size");
				num=input.nextInt();
				for(int i=0;i<num;i++)
				{
					mylist.Add(rand.nextInt(num));
				}
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "a":
				System.out.println("Enter element value");
				num=input.nextInt();
				mylist.Add(num);
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "r":
				System.out.println(mylist.Pop().value);
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "rr":
				System.out.println(mylist.BackDel().value);
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "s":
				mylist.Sort();
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "c":
				System.out.println(mylist.IsEmpty());
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "p":
				mylist.Print();
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "l":
				System.out.println("List length is "+mylist.length);
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "f":
				System.out.println("Enter element value");
				num=input.nextInt();
				if(mylist.Find(num)!=null)
				{
					System.out.println(mylist.Find(num).value);
				}
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "t":
				System.out.println("Enter element value");
				num=input.nextInt();
				mylist.Push(num);
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "v":
				start=System.nanoTime();
				mylist.Reverse();
				System.out.println(System.nanoTime()-start);
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "w":
				System.out.println("Enter from index");
				num=input.nextInt();
				System.out.println("Enter to index");
				num2=input.nextInt();
				mylist.PushInIndex(num2,mylist.PopFromIndex(num));
				System.out.println("Enter eny key for backup");
				input.next();
			case "vv":
				start=System.nanoTime();
				mylist.Revert();
				System.out.println(System.nanoTime()-start);
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "q":
				break;
			default: break;
		}
	}

}
