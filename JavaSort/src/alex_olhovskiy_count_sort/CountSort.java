package alex_olhovskiy_count_sort;

import java.util.Random;
import java.util.Scanner;

public class CountSort {

    static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		int[]arr=MakeArr();
		Print(arr);
		Sort(arr);
		Print(arr);
	}
	
	public static int[]MakeArr()
	{
		Random rand=new Random();
		System.out.println("¬ведите размер массива");
		int num=input.nextInt();
		int[]arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=rand.nextInt(100);
		}
		return arr;
	}
	
	public static void Print(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			if(i<(arr.length-1))
			{
				System.out.print(", ");
			}
		}
		System.out.println("");
	}
	
	public static int MyMax(int[]arr)
	{
		int my_max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>my_max)
			{
				my_max=arr[i];
			}
		}
		
		return my_max;
	}
	
	
	public static int MyMin(int[]arr)
	{
		int my_min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<my_min)
			{
				my_min=arr[i];
			}
		}
		
		return my_min;
	}
	
	public static void Sort(int[]arr)
	{
		int my_max=MyMax(arr);
		System.out.println(my_max);
		int my_min=MyMin(arr);
		System.out.println(my_min);
		int bias=-my_min;
		int[]counts=new int[my_max+bias+1];
		for(int i=0;i<counts.length;i++) 
		{
			counts[i]=0;
		}
		System.out.println(counts.length);
		for(int i=0;i<arr.length;i++)
		{
			counts[arr[i]+bias]++;
		}
		int index=0;
		for(int i=0;i<counts.length;i++) 
		{
			for(int j=0;j<counts[i];j++)
			{
				arr[index]=i-bias;
				index++;
			}
		}
	}

}

