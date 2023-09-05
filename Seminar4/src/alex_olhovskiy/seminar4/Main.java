package alex_olhovskiy.seminar4;

public class Main {

	public static void main(String[] args) {
		Mapa my_mapa=new Mapa();
		
		my_mapa.Init();
		for(int i=0;i<20;i++)
		{
			my_mapa.Add((""+(i+10)),(""+(i*10)));
		}
		
		for(int i=0;i<20;i++)
		{
			System.out.println(my_mapa.Get(""+(i+10)));
		}
		
//		String str="12";
//		String str2="12";
//		System.out.println(str.hashCode());
//		System.out.println(str2.hashCode());
	}

}
