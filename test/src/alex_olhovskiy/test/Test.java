package alex_olhovskiy.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	//public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a=123;
//		System.out.println(--a);
//		a=--a-a--;
//		System.out.println(a);
//		System.out.println(Integer.toBinaryString(12));
		
		
		
		Worker worker1=new Worker("Sergey");
		Worker worker2=new Worker("Nikolay");
		Worker worker3=new Worker("Sasha");
		Worker worker4=new Worker("Misha");
		Worker worker5=new Worker("Misha");
		Worker worker6=new Worker("Antuan");
		
		ArrayList<Worker>workers=new ArrayList<>();
		
		workers.add(worker1);
		workers.add(worker2);
		workers.add(worker3);
		workers.add(worker4);
		
		if(workers.contains(worker5))
		{
			System.out.println("Already exist");
		}
		else
		{
			System.out.println("new");
		}
		
		if(workers.contains(worker6))
		{
			System.out.println("Already exist");
		}
		else
		{
			System.out.println("new");
		}
		
		for(Worker w:workers)
		{
			System.out.println(w);
		}
		
		System.out.println(workers);
	}

}
