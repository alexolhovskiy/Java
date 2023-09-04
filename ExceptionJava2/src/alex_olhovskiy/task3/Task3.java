package alex_olhovskiy.task3;

import java.util.Scanner;

import alex_olhovskiy.Exception3.DivisionByZerroException;

public class Task3 {

	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter num1");
		int num1=input.nextInt();
		System.out.println("Enter num2");
		int num2=input.nextInt();
		System.out.println("Enter num3");
		int num3=input.nextInt();
		try {
			if(num1>100)
			{
				throw new NumberOutOfRangeException("num out of range");
			}
			if(num2<0)
			{
				throw new NumberOutOfRangeException("num out of range");
			}
			if(num1+num2<10)
			{
				throw new NumberSumException("sum of first and second is too small");
			}
			if(num3==0)
			{
				throw new DivisionByZeroException("Division by zero is not allowed");
			}
			
			System.out.println("Verification passed successfully");
			
		}catch(NumberOutOfRangeException ex) {
			System.out.println(ex.getMessage());
		}catch(NumberSumException ex) {
			System.out.println(ex.getMessage());
		}catch(DivisionByZeroException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
