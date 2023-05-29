package alex_olhovskiy.seminar3_ht;

import java.util.Random;
import java.util.Scanner;


public class Main {
	
	public static Scanner input=new Scanner(System.in);
	public static Random rand=new Random();
	public static OneWayNode oneWayList=new OneWayNode();
	public static DoubleWayNode doubleWayList=new DoubleWayNode();
	
	public static void main(String[] args) {
		System.out.println("Enter list size");
		int num=input.nextInt();
		for(int i=0;i<num;i++)
		{
			oneWayList.Add(oneWayList.Set(rand.nextInt(num)));
			doubleWayList.Add(doubleWayList.Set(rand.nextInt(num)));
		}
		
		System.out.println("Direct One way list");
		doubleWayList.Print();
		doubleWayList.Revert();
		System.out.println("Revert One way list");
		doubleWayList.Print();
		
		System.out.println("Direct Double way list");
		oneWayList.Print();
		oneWayList.Revert();
		System.out.println("Revert Double way list");
		oneWayList.Print();
		oneWayList.Revert_2();
		System.out.println("Revert Double way list by second way");
		oneWayList.Print();
	}

}
