package alex_olhovskiy.MyJSON;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.json.*;

public class MyJSON {

	public static void main(String[] args) {
		Map<String,ArrayList<String>>map=new HashMap<>();
		
		map.put("Sashae",new ArrayList<>(Arrays.asList("123","456")));
		map.put("Misha",new ArrayList<>(Arrays.asList("111","999")));
		map.put("Grisha",new ArrayList<>(Arrays.asList("9876565","123231231")));
		System.out.println(map);
		
//		Map<String,String>map=new HashMap<>();
//		
//		map.put("name1", "Sasha");
//		map.put("name2", "Sergey");
//		map.put("name3", "Gogywwww");
//		
//		Comparator<String>comp=new Comparator<String>(){
//			public int compare(String s1,String s2) {
//				return Integer.compare(s1.length(),s2.length());
//			}
//		};
//		
//		
//		System.out.println(map);
//		
//		List<String>arr=new ArrayList<>(map.values());
//		//arr.sort(comp);
//		Collections.sort(arr);
//		System.out.println(arr);
		
		JSONObject jo=new JSONObject(map);
		
		try(FileWriter fw=new FileWriter("test.json",false))//-true -дописывает,false - не дописывает
		{
			fw.write(jo.toString());
			fw.flush();
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		
		
		
		
		StringBuilder sb=new StringBuilder();
		
		try(BufferedReader br= new BufferedReader(new FileReader("test.json"))) {
			String str;
			while((str=br.readLine())!=null){
				sb.append(str);
			}
			br.close();
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}

		
		
		System.out.println(sb);
		
		JSONObject jo2=new JSONObject(sb.toString());
		System.out.println(jo2.get("Misha"));
		
		//String[]arr= {"Sasha","Misha","Grisha","Vasia"};
		//List<String>list=Stream.of(arr).collect(Collectors.toList());
		//List<String>list=Arrays.asList(arr);


		
		//System.out.println(list);
		
		//list.add("Masha");
		
		//System.out.println(list);

		System.out.println("Done");
	}

}
