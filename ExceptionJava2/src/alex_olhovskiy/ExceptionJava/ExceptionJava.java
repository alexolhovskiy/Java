package alex_olhovskiy.ExceptionJava;

import java.util.Scanner;

public class ExceptionJava {
	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number");
		int num=input.nextInt();
		try {
			if(num<=0)
			{
				throw new InvalidNumberException("num is incorrect");
			}
			else
			{
				System.out.println("num is correct");
			}
		}catch(InvalidNumberException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
