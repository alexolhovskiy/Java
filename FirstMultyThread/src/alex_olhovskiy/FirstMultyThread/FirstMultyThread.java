package alex_olhovskiy.FirstMultyThread;

public class FirstMultyThread {
	
	public static void main(String[] args) {
		CommonResource commonResourse=new CommonResource(0);
		Thread myThread=new Thread(new MyThread(commonResourse));
		Thread secondThread=new Thread(new SecondThread(commonResourse));
		myThread.start();
		secondThread.start();
		
		try {
			myThread.join();
			secondThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("OK");

	}

}
