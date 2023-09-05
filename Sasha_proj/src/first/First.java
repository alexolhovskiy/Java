package first;


import java.util.Random;
import java.util.Scanner;



public class First {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=80;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row");
		int row=sc.nextInt();
		System.out.print("Enter column");
		int column=sc.nextInt();
		Print(Sum(row,column));
		System.out.print("Υΰ, Βϋ βρε υσθ!");
	}

	public static int[][]Sum(int row,int column)
	{
		int[][] arr=new int[row][column];
		Random rand=new Random();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=rand.nextInt(10);
			}
		}
		return arr;
	}
	
	public static void Print(int [][]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	
}
