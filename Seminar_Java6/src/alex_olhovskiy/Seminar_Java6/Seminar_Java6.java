package alex_olhovskiy.Seminar_Java6;

import java.util.Iterator;

public class Seminar_Java6 {

	public static void main(String[] args) {
		MySet<String> ms=new MySet();
		ms.add("Sasha");
		ms.add("Masha");
		ms.add("Dasha");
		ms.add("Pasha");
		ms.add("Nasha");
		
		System.out.println(ms);
		Sep();
		
		Iterator<String>iter=ms.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		Sep();
		for(int i=0;i<ms.length;i++)
		{
			System.out.println(ms.get(i));
		}

	}
	public static void Sep()
	{
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}

}
