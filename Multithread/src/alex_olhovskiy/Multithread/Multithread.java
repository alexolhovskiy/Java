package alex_olhovskiy.Multithread;

import java.util.ArrayList;

public class Multithread {
	public static ArrayList<MyThread>threads=new ArrayList<>();
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			threads.add(new MyThread("MyThread # "+i));
			threads.get(threads.size()-1).start();
		}
		
		System.out.println("Main Thread");
		for(MyThread thread:threads)
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
