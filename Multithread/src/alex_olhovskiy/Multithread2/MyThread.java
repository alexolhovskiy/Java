package alex_olhovskiy.Multithread2;

public class MyThread implements Runnable {
	private int n=0;
	
	public MyThread(String name){

	}
	
	
	@Override
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

}
