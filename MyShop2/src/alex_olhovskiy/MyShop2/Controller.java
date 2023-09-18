package alex_olhovskiy.MyShop2;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller implements ControllerInterface{
	private MyStore store;
	ArrayList<Provider>providers;
	ArrayList<Castomer>castomers;
	View view;
	
	public Controller(ArrayList<Provider>providers,ArrayList<Castomer>castomers){
		this.providers=providers;
		this.castomers=castomers;
		store=new MyStore("Store",1000);
		view=new View(this);
	}
	
	public void nextCircle(){
		for(Provider provider:providers)
		{
			HashMap<Product,Integer>map=provider.randomPurchase();
			System.out.println(map);
			provider.formVerificationMap(map);
			System.out.println(provider);
			
			System.out.println(store.getOrder());
			System.out.println(store.getProducts());
			System.out.println(store.mapUpdate());
			HashMap<Product,Integer>map3=provider.formPossibleMap(store.mapUpdate());
			System.out.println(map3);
			HashMap<Product,Integer>map4=store.formVerificationMap(map3);
			System.out.println(map4);
			provider.saleProducts(map4);
			System.out.println(store);
		}
		System.out.println(store);
		
		for(Provider provider:providers)
		{
			System.out.println(provider);
		}
		
		for(Castomer castomer:castomers)
		{
			HashMap<Product,Integer>map=castomer.randomPurchase();
			System.out.println(map);
			HashMap<Product,Integer>map2=store.formPossibleMap(map);
			store.saleProducts(castomer.formVerificationMap(map2));
			System.out.println(castomer);
		}
		
		System.out.println(store);
	}
	
	public void mainProgram(){
		view.action();
	}
}
