package alex_olhovskiy.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class first {
	public static void main(String[] args) {
		System.out.println("Sasha loh");
		ArrayList<Worker>list=new ArrayList<>();
		Random rand=new Random();
		
		for(int i=0;i<10;i++)
		{
			list.add(workerProducer(rand));
		}
		
		System.out.println(list);
		
		Iterator<Worker>it=list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Sort");
		//Collections.sort(list);

		list.sort(new Comparator<Worker>(){
			@Override
			public int compare(Worker arg0, Worker arg1) {
				return Double.compare(arg0.getSalary(),arg1.getSalary());
			}
		});
		System.out.println(list);
		it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
	public static Worker workerProducer(Random rand){
		ArrayList<String>names=new ArrayList<>(Arrays.asList("Sasha","Misha","Kolia","Ania","Pisa","Sisa","Popa"));
		double salary=rand.nextDouble()*100;
		int temp=rand.nextInt(7);
		return new Worker(names.get(temp),salary);
	}

}
