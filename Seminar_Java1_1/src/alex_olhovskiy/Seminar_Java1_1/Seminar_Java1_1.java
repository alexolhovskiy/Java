package alex_olhovskiy.Seminar_Java1_1;

import java.util.Random;
import java.util.Scanner;

public class Seminar_Java1_1 {

	public static Random rand=new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1
		int i=GetNumber();
		System.out.println(i);
		Delimiter();
		//#2
		int n=GetRange(i);
		System.out.println(n);
		Delimiter();
		//#3
		int[]m1=GetMultipleArr(i,n);
		for(int j=0;j<m1.length;j++)
		{
			System.out.println(m1[j]);
		}
		Delimiter();
		System.out.println(n);
		//#4
		int[]m2=GetNotMultipleArr(i,n);
		for(int j=0;j<m2.length;j++)
		{
			System.out.println(m2[j]);
		}
		Delimiter();
		System.out.println(n);
	}
	
	public static void Delimiter()
	{
		for(int j=0;j<80;j++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}
	
	public static int GetNumber()
	{
		return rand.nextInt(2000);
	}
	
	public static int GetRange(int i)
	{
		return Integer.toBinaryString(i).length()-1;
	}
	

	public static int[]GetMultipleArr(int min_v,int value)
	{
		int counter=0;
		for(int j=min_v;j<Short.MAX_VALUE;j++)
		{
			if((j%value)==0)
			{
				counter++;
			}
		}
		int[]arr=new int[counter];
		counter=0;
		for(int j=min_v;j<Short.MAX_VALUE;j++)
		{
			if((j%value)==0)
			{
				arr[counter]=j;
				counter++;
			}
		}

		return arr;
	}
	
	public static int[]GetNotMultipleArr(int max_v,int value)
	{
		int counter=0;
		for(int j=Short.MIN_VALUE;j<max_v;j++)
		{
			if((j%value)!=0)
			{
				counter++;
			}
		}
		int[]arr=new int[counter];
		counter=0;
		for(int j=Short.MIN_VALUE;j<max_v;j++)
		{
			if((j%value)!=0)
			{
				arr[counter]=j;
				counter++;
			}
		}

		return arr;
	}

}
