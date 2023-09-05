package alex_olhovskiy.FirstMultyThread;

public class MyThread implements Runnable {

	private CommonResource com;
	private int num=0;
	
	public MyThread(CommonResource com) {
		this.com=com;
	}
	
	@Override
	public void run() {
		while(num<10)
		{
			synchronized(com){
				System.out.println("num="+num+" Com="+com.getIndex());
				num++;
				com.setIndex();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
