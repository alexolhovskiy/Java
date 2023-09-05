package alex_olhovskiy.Multithread2;

import java.util.ArrayList;

import alex_olhovskiy.Multithread2.MyThread;

public class Multithread2 {

	public static ArrayList<Thread>threads=new ArrayList<>();
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			threads.add(new Thread(new MyThread("MyThread # "+i)));
			threads.get(threads.size()-1).start();
		}
		
		System.out.println("Main Thread");
		for(Thread thread:threads)
		{
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("The End");

	}

}
