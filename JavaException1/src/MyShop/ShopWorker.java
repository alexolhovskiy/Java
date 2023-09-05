package MyShop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Timer;

public class ShopWorker implements ActionListener {
	public ArrayList<Castomer>castomers=new ArrayList<>();
	public ArrayList<Provider>providers=new ArrayList<>();
	
	private Timer timer;
	private MyStore store=new MyStore();
	
	public ShopWorker() {
		castomers.add(new Castomer("Sasha"));
		castomers.add(new Castomer("Masha"));
		castomers.add(new Castomer("Misha"));
		castomers.add(new Castomer("Sisa"));
		castomers.add(new Castomer("Pisa"));
		castomers.add(new Castomer("Popa"));
		
		
		providers.add(new Provider("Kamilot"));
		providers.add(new Provider("CHP Popkin"));
		providers.add(new Provider("Tagil"));
	
		timer = new Timer(10000, this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hello");
		
		for(Provider provider:providers)
		{
			provider.makeProducts();
			System.out.println(provider);
			for(Map.Entry<MyProduct,Integer>product:provider.getProducts().entrySet())
			{
				store.add(product.getKey(), product.getValue());
			}
			System.out.println(provider);
		}
		
		System.out.println(store.toString());
	}

    
	
}
