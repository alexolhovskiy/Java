package alex_olhovskiy.OOP_Seminar3_second;

import java.util.Iterator;

public class OOP_Seminar3_second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1=new Worker("Sasha","Petrov",34,1000);
		Worker w2=new Worker("Misha","Sedov",14,2000);
		System.out.println(w1);
		Sep();
		System.out.println(w2);
		Sep();
		
		Iterator<String>fields=w1;
		while(fields.hasNext())
		{
			System.out.println(fields.next());
		}
		
	}
	public static void Sep()
	{
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}

}
