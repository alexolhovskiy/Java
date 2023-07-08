package alex_olhovskiy.Seminar_Java4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Seminar_Java4 {
	public static Scanner input=new Scanner(System.in);
	public static ArrayList<String> name=new ArrayList<>();
	public static ArrayList<String> f_name=new ArrayList<>();
	public static ArrayList<String> surname=new ArrayList<>();
	public static ArrayList<Integer> age=new ArrayList<>();
	public static ArrayList<Boolean> gender=new ArrayList<>();
	public static ArrayList<Integer> id=new ArrayList<>();
	public static void main(String[] args){
		
		//AddNote();
		try {
			AddNoteFromFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintById();
		Sep();
		SortByAge();
		PrintById();
		Sep();
		SortByGender();
		PrintById();
		Sep();
	}
	
	public static void Sep()
	{
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}
	
	public static void SortByGender()
	{
		int temp=0;
		for(int i=0;i<id.size()-1;i++)
		{
			if(age.get(id.get(i))==age.get(id.get(i+1)))
			{
				if((gender.get(id.get(i))==true)&&(gender.get(id.get(i+1))==false))
				{
					temp=id.get(i);
					id.set(i,id.get(i+1));
					id.set(i+1, temp);
					SortByGender();
				}
			}
		}
	}
	
	public static void SortByAge()
	{
		id.sort(new Comparator<Integer>() {
			public int compare(Integer o1,Integer o2) {
				return age.get(o1)-age.get(o2);
			}
		});
	}
	
	public static void AddNote()
	{
		String str="";
		System.out.println("Do you want to enter person y/n");
		str=input.nextLine();
		while(!str.equals("n"))
		{
			System.out.println("Enter first name");
			name.add(input.nextLine());
			System.out.println("Enter fathers name");
			f_name.add(input.nextLine());
			System.out.println("Enter surname");
			surname.add(input.nextLine());
			System.out.println("Enter age");
			age.add(input.nextInt());
			System.out.println("Enter gender");
			gender.add(input.nextLine().toLowerCase().contains("m"));
			
			System.out.println("Do you want to enter next person y/n");
			str=input.nextLine();
		}
	}
	
	public static void Print()
	{
		for(int i=0;i<name.size();i++)
		{
			System.out.print(id.get(i)+" "+surname.get(i)+" "+name.get(i)+" "+
			f_name.get(i)+" "+age.get(i)+" "+(gender.get(i)?"female":"male"));
			System.out.println("");
		}
	}
	
	public static void PrintById()
	{
		for(int i=0;i<id.size();i++)
		{
			System.out.print(surname.get(id.get(i))+" "+name.get(id.get(i))+" "+
			f_name.get(id.get(i))+" "+age.get(id.get(i))+" "+(gender.get(id.get(i))?"female":"male"));
			System.out.println("");
		}
	}
	
	public static void AddNoteFromFile() throws FileNotFoundException
	{
		BufferedReader br=new BufferedReader(new FileReader("text.txt"));
		String str="";
		try {
			while(!(str=br.readLine()).equals("n"))
			{
					//System.out.println(str);
					
					surname.add(br.readLine());
					name.add(br.readLine());
					f_name.add(br.readLine());
					age.add(Integer.parseInt(br.readLine()));
					gender.add(br.readLine().toLowerCase().contains("f"));
					id.add(name.size()-1);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
