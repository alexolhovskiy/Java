package alex_olhovskiy.FirstMultyThread;

public class SecondThread implements Runnable {

	private CommonResource com;
	private int num=0;
	
	public SecondThread(CommonResource com) {
		this.com=com;
	}
	
	@Override
	public void run() {
		while(num<10)
		{
			synchronized(com){
				System.out.println("Second Thread num="+num+" Com="+com.getIndex());
				num++;
				com.setIndex();
			}
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
