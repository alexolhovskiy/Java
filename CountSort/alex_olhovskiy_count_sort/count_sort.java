package alex_olhovskiy_count_sort;

import java.util.Random;

public class count_sort {
	
	Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		int[]arr=MakeArr();
		Print(arr);

	}
	
	public static int[]MakeArr()
	{
		Random rand=new Random();
		System.out.println("¬ведите размер массива");
		num=input.nextInt();
		int[]arr=new arr[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=rand.nextInt(100);
		}
	}
	
	public static void Print(int[]arr)
	{
		string str="";
		for(int i=0;i<arr.length;i++)
		{
			//System.out.print(arr[i]);
			str.join(",",str,""+arr[i]);
		}
		System.out.print(str);
	}
	
	public static void Sort(int[]arr)
	{
		
	}

}
