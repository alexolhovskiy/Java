package alex_olhovskiy.Exception3;

import java.util.Scanner;

import alex_olhovskiy.ExceptionJava.InvalidNumberException;

public class Exception3 {

	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter divider");
		int divider=input.nextInt();
		System.out.println("Enter divisor");
		int divisor=input.nextInt();
		try {
			if(divisor==0)
			{
				throw new DivisionByZerroException("Division by zerro is inpossible");
			}
			else
			{
				System.out.println(""+divider+":"+divisor+"="+(divider/divisor));
			}
		}catch(DivisionByZerroException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
