package alex_olhovskiy.Seminar_Java2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Seminar_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//#1
		
		String j_str="{\"name\":\"Ivanov\",\"country\":\"Russia\","
					+ "\"city\":\"Moscow\",\"age\":\"null\"}";
		
		System.out.println(j_str);
		
		System.out.println(RequestForm(j_str));
		
		
		
		//#2
		try {
			BufferedReader br=new BufferedReader(new FileReader("test.txt"));
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(StringForm(str));
			}
			br.close();
		}catch(Exception ex){
			System.out.println("File does not exist");
		}

	}
	
	public static String StringForm(String str)
	{
		String name=str.substring(str.indexOf("фамилия")+10,
				str.indexOf('"',str.indexOf("фамилия")+10));

		String mark=str.substring(str.indexOf("оценка")+9,
				str.indexOf('"',str.indexOf("оценка")+9));

		String subject=str.substring(str.indexOf("предмет")+10,
				str.indexOf('"',str.indexOf("предмет")+10));

		StringBuilder sb=new StringBuilder();
		
		sb.append("Студент ");
		sb.append(name);
		sb.append(" получил ");
		sb.append(mark);
		sb.append(" по предмету ");
		sb.append(subject);
		
		return sb.toString();
	}
	
	public static String RequestForm(String str)
	{
		String name=str.substring(str.indexOf("name")+7,
				str.indexOf('"',str.indexOf("name")+7));

		String country=str.substring(str.indexOf("country")+10,
				str.indexOf('"',str.indexOf("country")+10));

		String city=str.substring(str.indexOf("city")+7,
				str.indexOf('"',str.indexOf("city")+7));

		String age=str.substring(str.indexOf("age")+6,
				str.indexOf('"',str.indexOf("age")+6));
		
		StringBuilder sb=new StringBuilder();
		
		sb.append("SELECT*FROM students WHERE name='");
		sb.append(name);
		sb.append("' AND country='");
		sb.append(country);
		sb.append("' AND city='");
		sb.append(city);
		sb.append("' AND age IS NOT NULL");

		return sb.toString();
		
	}
	
}
