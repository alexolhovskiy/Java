package alex_olhovskiy.Seminar_Java1;

import java.util.Random;
import java.util.Scanner;

public class Seminar_Java1 {
	public static Scanner input=new Scanner(System.in);
	public static Random rand=new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//#1
		System.out.println("Введите число");//
		System.out.println(Sum(input.nextInt()));
		
		System.out.println("Введите число");//
		System.out.println(Product(input.nextInt()));
		
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
		//#2
		SimpleNum(1000);
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
		
		//#3
		CalculatorSuorce();
		
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
		
		//#4
		String str=TaskForm(1000);
		//System.out.print(str);
		TaskSolve(str);
		
	}
	
	public static boolean Check(char[]third,char[]num3)
	{
		if(third.length!=num3.length)
		{
			return false;
		}

		for(int i=0;i<num3.length;i++)
		{
			if((third[i]==num3[i])||(num3[i]=='?'))
			{
				//System.out.println(third[i]);
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
	
	public static void Func(int cnt,int depth,char[]arr,char[]num1,char[]num2,char[]num3)
	{
		String str="";
		for(int i=0;i<10;i++)
		{
			arr[cnt]=(char)(i+48);
			if(cnt<depth)
			{
				Func(cnt+1,depth,arr,num1,num2,num3);
			}
			else
			{
				int counter=0;

				char[]t_num1=new char[num1.length];

				for(int l=0;l<num1.length;l++)
				{
					if(num1[l]=='?')
					{
						t_num1[l]=arr[counter];
						counter++;
					}
					else
					{
						t_num1[l]=num1[l];
					}
				}
				String f_str=new String(t_num1);
				int first=Integer.parseInt(f_str);
				
				char[]t_num2=new char[num2.length];
				
				for(int l=0;l<num2.length;l++)
				{
					if(num2[l]=='?')
					{
						t_num2[l]=arr[counter];
						counter++;
					}
					else
					{
						t_num2[l]=num2[l];
					}
				}
				String s_str=new String(t_num2);
				int second=Integer.parseInt(s_str);
				
				char[]third=(""+(first+second)).toCharArray();

				if(Check(third,num3))
				{
					str=f_str+"+"+s_str+"="+new String(third);
					System.out.println(str);
				}
			}
		}
	}
	
	
	public static void TaskSolve(String str)
	{
		String[]arr1=str.split(" ");
		String[]arr2=arr1[1].split("=");
		char[]first=arr1[0].toCharArray();
		char[]second=arr2[0].toCharArray();
		char[]third=arr2[1].toCharArray();

		int num=0;
		for(int i=0;i<first.length;i++)
		{
			if(first[i]=='?')
			{
				num++;
			}
		}
		for(int i=0;i<second.length;i++)
		{
			if(second[i]=='?')
			{
				num++;
			}
		}
		char[]arr=new char[num];
		
		Func(0,num-1,arr,first,second,third);
	}
	

	
	public static String MakeStr(int n)
	{
		String str=""+n;
		char[]arr=str.toCharArray();
		int m=arr.length/2;
		for(int i=0;i<m;i++)
		{
			arr[rand.nextInt(arr.length-1)]='?';
		}
		return new String(arr);
	}
	
	
	public static String TaskForm(int range)
	{
		int[]num=new int[3];
		int first=rand.nextInt(range);
		int second=rand.nextInt(range);
		int third=first+second;
		String s_first=MakeStr(first);
		String s_second=MakeStr(second);
		String s_third=MakeStr(third);
		System.out.println(s_first+"+"+s_second+"="+s_third);
		return s_first+" "+s_second+"="+s_third;
	}
	

	
	public static void CalculatorSuorce()
	{
		double first=0,second=0,res=0;
		String c="";
		while(!c.equals("q"))
		{
			CalculatorMenu();
			System.out.println("Делайте выбор");
			c=input.next();
			switch(c)
			{
				case "+":
					System.out.println("Введите 1-ое число");
					first=input.nextInt();
					System.out.println("Введите 2-ое число");
					second=input.nextInt();
					res=first+second;
					System.out.println(first+"+"+second+"="+res);
					break;
				case "-":
					System.out.println("Введите 1-ое число");
					first=input.nextInt();
					System.out.println("Введите 2-ое число");
					second=input.nextInt();
					res=first-second;
					System.out.println(first+"-"+second+"="+res);
					break;
				case "*":
					System.out.println("Введите 1-ое число");
					first=input.nextInt();
					System.out.println("Введите 2-ое число");
					second=input.nextInt();
					res=first*second;
					System.out.println(first+"*"+second+"="+res);
					break;
				case "/":
					System.out.println("Введите 1-ое число");
					first=input.nextInt();
					System.out.println("Введите 2-ое число");
					second=input.nextInt();
					res=first/second;
					System.out.println(first+"/"+second+"="+res);
					break;
				case "pow":
					System.out.println("Введите 1-ое число");
					first=input.nextInt();
					System.out.println("Введите 2-ое число");
					second=input.nextInt();
					res=Math.pow(first,second);
					System.out.println(first+" pow "+second+"="+res);
					break;
				case "sqrt":
					System.out.println("Введите 1-ое число");
					first=input.nextInt();
					res=Math.sqrt(first);
					System.out.println("sqrt("+first+")"+"="+res);
					break;
			}
		}
	}
	
	public static void CalculatorMenu()
	{
		System.out.println("+     Введите '+'");
		System.out.println("-     Введите '-'");
		System.out.println("*     Введите '*'");
		System.out.println("/     Введите '/'");
		System.out.println("pow   Введите 'pow'");
		System.out.println("sqrt  Введите 'sqrt'");
		System.out.println("Выход Введите 'q'");
		
	}
	
	public static void SimpleNum(int n)
	{
		for(int i=1;i<n;i++)
		{
			boolean flag=true;
			for(int j=2;j<=Math.round(Math.sqrt(i))&&flag;j++)
			{
				if(i%j==0)
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.println(i);
			}
		}
	}
	
	public static int Sum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	public static int Product(int n)
	{
		int product=1;
		for(int i=2;i<=n;i++)
		{
			product*=i;
		}
		return product;
	}

}
