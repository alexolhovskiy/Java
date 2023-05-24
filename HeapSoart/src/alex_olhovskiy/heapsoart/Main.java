package alex_olhovskiy.heapsoart;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static Scanner input =new Scanner(System.in);
	public static Random rand =new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter arr length");
		int num=input.nextInt();
		int[]arr=ArrMaker(num);
		Print(arr);
		HeapSort(arr);
		Print(arr);

	}
	public static void HeapSort(int[]arr)
	{
		for(int i=arr.length/2-1;i>=0;i--)
		{
			heapify(arr,arr.length,i);
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	
	public static void heapify(int[]arr,int heapSize,int rootIndex)
	{
		int largest=rootIndex;
		int leftChild=2*rootIndex+1;
		int rightChild=2*rootIndex+2;
		if((leftChild<heapSize)&&(arr[leftChild]>arr[largest]))
		{
			largest=leftChild;
		}
		if((rightChild<heapSize)&&(arr[rightChild]>arr[largest]))
		{
			largest=rightChild;
		}
		if(largest!=rootIndex)
		{
			int temp=arr[rootIndex];
			arr[rootIndex]=arr[largest];
			arr[largest]=temp;
			heapify(arr,heapSize,largest);
		}
	}
	
	public static int[] ArrMaker(int n)
	{
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=rand.nextInt(1000);
		}
		return arr;
	}
	
	public static void Print(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			if(i<arr.length-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println();
	}

}
