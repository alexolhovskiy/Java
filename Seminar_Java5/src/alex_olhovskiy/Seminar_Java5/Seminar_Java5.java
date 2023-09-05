package alex_olhovskiy.Seminar_Java5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Seminar_Java5 {
	public static Map<String,String>db=new LinkedHashMap<String,String>();
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		AddNoteFromFile();
		System.out.println(db);
		
		Comparator<String>comp=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.length()-o1.length();
			}
			
		};
		
		Sep();
		
		db.entrySet()
			.stream()
			.sorted(Map
					.Entry
					.comparingByValue(comp)).forEach(System.out::println);
	}
	
	public static void Sep()
	{
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}
	
	
	public static void AddNoteFromFile() throws FileNotFoundException
	{
		BufferedReader br=new BufferedReader(new FileReader("text.txt"));
		String str="";
		String key="";
		String value="";
		try {
			while(!(str=br.readLine()).equals("n"))
			{
					//System.out.println(str);
					key=br.readLine();
					value=br.readLine();
					if(db.containsKey(key))
					{
						db.put(key,db.get(key)+" "+value);
					}
					else
					{
						db.put(key,value);
					}
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
