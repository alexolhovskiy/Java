package alex_olhovskiy.mymatrix;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner input=new Scanner(System.in);
	public static Random rand =new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]matrix1=MakeMatrix();//take row
		System.out.print("Take row from here\n");
		PrintMatrix(matrix1);
		int[][]matrix2=MakeMatrix();//take column
		System.out.print("Take column from here\n");
		PrintMatrix(matrix2);
		
		int[][]arr=MatrixProduct(matrix1,matrix2);
		PrintMatrix(arr);
	}
	
	public static void PrintMatrix(int[][]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	public static int[][]MakeMatrix()
	{
		System.out.println("Enter matrix rows");
		int row=input.nextInt();
		System.out.println("Enter matrix columns");
		int column=input.nextInt();
		System.out.println("Enter matrix interval");
		int n=input.nextInt();
		int [][]arr=new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=rand.nextInt(n);
			}
		}
		return arr;
	}
	
	public static int[][]MatrixProduct(int[][]matrix1,int[][]matrix2)
	  {
	      int[][]arr=new int[matrix1.length][matrix2[0].length];
	      if(matrix1[0].length!=matrix2.length)
	      {
	          System.out.println("Matrixes are not compatible");
	          return arr;
	      }

	      for(int k=0;k<arr.length;k++)
	      {
	          for(int i=0;i<arr[0].length;i++)
	          {
	              for(int j=0;j<matrix1[0].length;j++)
	              {
	                  arr[k][i]+=matrix1[k][j]*matrix2[j][i];
	              }
	          }
	      }
	      return arr;
	  }

}
