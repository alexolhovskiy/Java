package alexolhovskiy_quicksort;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
	static Scanner input=new Scanner(System.in);
	static Random rand=new Random();
	static int[]arr;
	public static void main(String[] args) {
		arr=ArrMaker();
		Print(arr);
		//System.out.println(FindMin(arr));
		long time = System.currentTimeMillis();
		//ElectSort(arr);
		Q_Sort(0,arr.length-1,arr);
		System.out.println(System.currentTimeMillis() - time);
		Print(arr);
	}
	
	public static int[]ArrMaker()
	{
		System.out.println("Enter arr length");
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
			System.out.print(arr[i]+"\t");		
		}
		System.out.println();	
	}
	
	public static void Q_Sort(int start,int end,int[]arr)
	{
		int temp=0;
		int s=start;
		int e=end;
		int base_el=arr[(start+end)/2];
		while(s<e)//while(s<=e)
		{
			while(arr[s]<base_el)
			{
				s++;
			}
			while(arr[e]>base_el)
			{
				e--;
			}
			if(s<=e)
			{
				temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
		}
		if(e>start)
		{
			Q_Sort(start,e,arr);
		}
		if(s<end)
		{
			Q_Sort(s,end,arr);
		}
	}
	
	
	
	
	public static int FindMin(int[]arr)
	{
		int mymin=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<arr[mymin])
			{
				mymin=i;
			}
		}
		return mymin;
	}
	public static void ElectSort(int[]arr)
	{
		int temp=0;
		int mymin=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[mymin])
				{
					mymin=j;
				}
			}
			if(arr[i]>arr[mymin])
			{
				temp=arr[i];
				arr[i]=arr[mymin];
				arr[mymin]=temp;
			}
		}
		
		
	}

}
