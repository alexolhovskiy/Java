package sasha.ru;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static String[]letterArr= {" ","a","b","c","d","e","f","g","h","j","i","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};//26
	public static Random rand=new Random();
	public static Scanner input =new Scanner(System.in);
	static ArrayList <Integer> mylist=new ArrayList <>();
	static ArrayList <String> mystrlist=new ArrayList<>();
	public static int count=0;
	public static ArrayList<Integer> fibarr=new ArrayList<>(); 
	public static ArrayList<Integer> fibarr2=new ArrayList<>();
	public static void main(String[] args) {
		long start=0;
		int n=0;
		/*System.out.println("Enter n");
		n=input.nextInt();
		start=System.nanoTime();//System.currentTimeMillis();
		System.out.println(SumNum(n));
		System.out.println(System.nanoTime()-start);//System.out.println(System.currentTimeMillis()-start);
		
		System.out.println("Enter n");
		n=input.nextInt();
		start=System.nanoTime();//System.currentTimeMillis();
		mylist=SimpleNumbers(n);
		System.out.println(System.nanoTime()-start);//System.out.println(System.currentTimeMillis()-start);
		System.out.println(mylist);
		
		*/
		/*start=System.nanoTime();//System.currentTimeMillis();
		int sum=FourKubs();
		System.out.println(System.nanoTime()-start);//System.out.println(System.currentTimeMillis()-start);
		System.out.println("Combination number is: "+sum);
		
		System.out.println("Enter n");
		n=input.nextInt();
		start=System.nanoTime();//System.currentTimeMillis();
		n=AnyKubRec(n,0);
		System.out.println(System.nanoTime()-start);//System.out.println(System.currentTimeMillis()-start);
		System.out.println("Combination number is: "+n);
		*//*
		System.out.println("Enter n");
		n=input.nextInt();
		if(n>2)
		{
			start=System.nanoTime();//System.currentTimeMillis();
			FibbonachiArray(1,1,2,n);
			System.out.println(System.nanoTime()-start);//System.out.println(System.currentTimeMillis()-start);
		}
		System.out.println(fibarr);
		
		
		System.out.println("Enter n");
		n=input.nextInt();
		if(n>2)
		{
			start=System.nanoTime();//System.currentTimeMillis();
			fibarr2=FibbonachiArray(n);
			System.out.println(System.nanoTime()-start);//System.out.println(System.currentTimeMillis()-start);
		}
		System.out.println(fibarr2);
		*/
		
		System.out.println("Enter your frase");
		String str=input.next();
		int[]arr=new int[str.length()];
		long nn=0;
		System.out.println(Gear(str,str.length(),arr,nn));
	}
	
	public static Boolean Check(String str,int[]arr)
	{
		String str2=MakeStr(arr);
		if(str.equals(str2))
		{
			System.out.println("Our frase is: "+str2);
			return true;
		}
		return false;
	}
	
	public static String MakeStr(int[]arr)
	{
		String str="";
		for(int i=0;i<arr.length;i++)
		{
			str+=letterArr[arr[i]];
		}
		//System.out.println(str);
		return str;
	}
	
	
	public static long Gear(String str,int n,int[]arr,long mycount)
	{
		for(int i=0;i<=26;i++)
		{
			arr[n-1]=i;
			
			if((n-1)>0)
			{
				mycount=Gear(str,n-1,arr,mycount);
			}
			else
			{
				mycount++;
				if(Check(str,arr))
				{
					System.out.println(str);
					System.out.println(mycount);
				}
			}
		}
		return mycount;
	}
	
	public static ArrayList<Integer> FibbonachiArray(int num)
	{
		ArrayList<Integer> fibarr2=new ArrayList<>();
		int n1=1;
		int n2=1;
		int nn1=1;
		for(int i=2;i<num;i++)
		{
			fibarr2.add(n1+n2);
			nn1=n1;
			n1=n2;
			n2=nn1+n2;
		}
		return fibarr2;
	}
	
	public static void FibbonachiArray(int n1,int n2,int m,int num)
	{
		if(m<num)
		{
			fibarr.add(n1+n2);
			m++;
			FibbonachiArray(n2,n2+n1,m,num);
		}
	}
	
	public static int AnyKubRec(int n,int mycount)
	{
		for(int i=1;i<=6;i++)
		{
			if((n-1)>0)
			{
				mycount=AnyKubRec(n-1,mycount);
			}
			else
			{
				mycount++;
			}
		}
		return mycount;
	}
	
	
	public static int FourKubs()
	{
		int count=0;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				for(int l=1;l<=6;l++)
				{
					for(int k=1;k<=6;k++)
					{
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static int SumNum(int num)
	{
		int sum=0;
		for(int i=0;i<num;i++,sum+=i) {}
		return sum;
	}
	
	
	public static ArrayList<Integer> SimpleNumbers(int num)
	{
		ArrayList<Integer> mylist=new ArrayList<>();
		boolean simple=true;
		for(int i=1;i<num;i++)
		{
			simple=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					simple=false;
					break;
				}
			}
			if(simple)
			{
				mylist.add(i);
			}
		}
		return mylist;
	}
	
	
	

}
