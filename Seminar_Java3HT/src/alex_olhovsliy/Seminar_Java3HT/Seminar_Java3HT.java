package alex_olhovsliy.Seminar_Java3HT;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Seminar_Java3HT {
	public static Random rand=new Random();
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> list=new ArrayList<>();
		System.out.println("Enter list size");
		int n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			list.add(rand.nextInt(n));
		}
		
		System.out.print(list);
		Delimiter();
		
		//#1
		ArrayList<Integer>list2=EvenDel(list);
		System.out.print(list2);
		Delimiter();
		//#2
		System.out.println(MinVal(list2));
		Delimiter();
		//#3
		System.out.println(MaxVal(list2));
		Delimiter();
		//#4
		System.out.printf("%.3f\n",RelVal(list2));
		Delimiter();
	}
	
	public static double RelVal(ArrayList<Integer>list)
	{
		double sum=0;
		for(int i=0;i<list.size();i++)
		{
			sum+=list.get(i);
		}
		return sum/(double)(list.size());
	}
	
	public static int MaxVal(ArrayList<Integer>list)
	{
		int m_max=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)>list.get(m_max))
			{
				m_max=i;
			}
		}
		return list.get(m_max);
	}
	
	public static int MinVal(ArrayList<Integer>list)
	{
		int m_min=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)<list.get(m_min))
			{
				m_min=i;
			}
		}
		return list.get(m_min);
	}
	
	public static ArrayList<Integer>EvenDel(ArrayList<Integer>list)
	{
		ArrayList <Integer> list2=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2!=0)
			{
				list2.add(list.get(i));
			}
		}
		return list2;
	}
	
	
	public static void Delimiter()
	{
		System.out.println("");
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}

}
