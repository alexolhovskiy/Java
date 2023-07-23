package alex_olhovskiy.OOP_Seminar2;

import java.util.List;

public interface MarketBehavior {
	public void acceptToMarket(Actor actor);
	public void releaseFromMarket(Actor actor);
	public int update(Product product,int num,boolean flag); 
}
