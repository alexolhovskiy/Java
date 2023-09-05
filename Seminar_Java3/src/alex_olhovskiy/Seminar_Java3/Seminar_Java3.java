package alex_olhovskiy.Seminar_Java3;

import java.util.ArrayList;
import java.util.Random;

public class Seminar_Java3 {
	
	public static Random rand=new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> list=new ArrayList<>();
		ArrayList <Integer> list2=new ArrayList<>();
		ArrayList <Integer> list3=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			list.add(rand.nextInt(10));
			list2.add(rand.nextInt(10));
		}
		System.out.println("");
		System.out.print(list);
		System.out.println("");
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
		System.out.print(list2);
		System.out.println("");
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		
		for(int i=0;i<10;i++)
		{
			if(list.get(i)!=0)
			{
				if(list2.get(i)%list.get(i)==0)
				{
					
				}
				else
				{
					list3.add(list.get(i));
				}
			}
			else
			{
				list3.add(list.get(i));
			}
		}
		System.out.println("");
		System.out.print(list3);
		System.out.println("");
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}

	}

}
