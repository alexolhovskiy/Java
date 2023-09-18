package alex_olhovskiy.MyShop;

import java.util.ArrayList;

public class MyShop {

	public static void main(String[] args) {
		MyStore store=new MyStore("Store",1000);
		ArrayList<Provider>providers=new ArrayList<>();
		ArrayList<Castomer>castomers=new ArrayList<>();
		
		providers.add(new Provider("CHP Perdak",100));
		providers.add(new Provider("CHP Bardak",200));
		providers.add(new Provider("CHP Kirdik",100));
		
		castomers.add(new Castomer("Sasha",15));
		castomers.add(new Castomer("Masha",25));
		castomers.add(new Castomer("Misha",35));
		castomers.add(new Castomer("Grisha",15));
		castomers.add(new Castomer("Pasha",115));
		
		Controller controller=new Controller(providers,castomers);
		controller.mainProgram();
	}

}
