package alex_olhovskiy.Multithread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class MyThread extends Thread{
	private Timer t;
	private int n=0;
	
	public MyThread(String name){
		super(name);
//		t=new Timer(1000,this);
//		t.start();
	}
	public void run() {
		
		System.out.println("Start "+Thread.currentThread().getName());
		while(n<10)
		{
				n++;
				System.out.println(""+Thread.currentThread().getName()+" "+n);
				
				try {
					Thread.sleep(2000);
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			
		}
		System.out.println("Finish "+Thread.currentThread().getName());
	}
	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println(""+Thread.currentThread().getName()+" "+(n++));
//	}
}
