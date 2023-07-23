package alex_olhovskiy.OOP_Seminar2;

import java.util.HashMap;

public interface QueueBehavior {
	
	public void takeInQueue(Actor actor);
	public void releaseFromQueue(Actor actor);
	public void giveOrders(Actor actor,int money);
	public int takeOrders(HashMap<String,Integer>order,Actor actor);

}
