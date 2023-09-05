package alex_olhovskiy.seminar3_2;

import java.util.Random;
import java.util.Scanner;

import alex_olhovskiy.seminar3_2.Node;

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
			System.out.println("ReversPrint list    -> pp");
			System.out.println("Check list is empty -> c");
			System.out.println("Find index on value -> f");
			System.out.println("Add element in head -> a");
			System.out.println("Return head element -> r");
			System.out.println("Return tail element -> rr");
			System.out.println("Add element in tail -> t");
			System.out.println("List length         -> l");
			System.out.println("Revert              -> o");
			System.out.println("Insert              -> i");
			System.out.println("Delete index        -> d");
			System.out.println("Exit                -> q");
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
					mylist.Add(mylist.Set(rand.nextInt(num)));
				}
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "a":
				System.out.println("Enter element value");
				num=input.nextInt();
				mylist.Add(mylist.Set(num));
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "r":
				System.out.println(mylist.Pop().value);
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "rr":
				System.out.println(mylist.PopBack().value);
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "p":
				mylist.Print();
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "pp":
				mylist.PrintPrev();
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "o":
				mylist.Revert();
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
				mylist.Push(mylist.Set(num));
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "fd":
				System.out.println("Enter element index");
				num=input.nextInt();
				System.out.println(mylist.FindDelete(num).value);
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "d":
				System.out.println("Enter element index");
				num=input.nextInt();
				mylist.Delete(num);
				System.out.println("Enter eny key for backup");
				input.next();
				break;
			case "i":
				System.out.println("Enter element value");
				num=input.nextInt();
				System.out.println("Enter element position");
				num2=input.nextInt();
				mylist.Insert(mylist.Set(num),num2);
				System.out.println("Enter eny key for backup");
				input.next();
				break;
				
			case "q":
				break;
			default: break;
		}
	}

}
