package alex_olhovskiy.OOP_Seminar5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class TableModel implements Model{
	
	private ArrayList<Reservation>dateList=new ArrayList<>();
	
	
	public boolean reservationTableAdd(Date date,int hour,int tableNo,String name) {
		boolean flag=true,present=true;
		
		for(int i=0;i<dateList.size();i++)
		{
			System.out.println("Date from arr "+dateList.get(i).getDate());
			if(dateList.get(i).getDate().compareTo(date)==0)
			{
				present=false;
				System.out.println("Present "+dateList.get(i).getTable(tableNo).getHours(hour));
				if(dateList.get(i).getTable(tableNo).getHours(hour).equals(" "))
				{
					dateList.get(i).getTable(tableNo).setHours(hour,name);
				}
				else
				{
					flag=false;
				}
			}
		}
		
		if(present)
		{
			dateList.add(new Reservation(date));
			dateList.get(dateList.size()-1).getTable(tableNo).setHours(hour,name);
		}
		
		return flag;
	}
	
	public void reservationTableRemove(Date date,int hour,int tableNo,String name) {
		for(int i=0;i<dateList.size();i++)
		{
			if(dateList.get(i).getDate().compareTo(date)==0)
			{
				if(dateList.get(i).getTable(tableNo).getHours(hour).equals(name)) {
					dateList.get(i).getTable(tableNo).setHours(hour," ");
				}
			}
		}
	}

	
	public void loadReservation(){
		String[]arr;	
		
		try(BufferedReader br=new BufferedReader(new FileReader("dateList.txt"))){
			String str="";
			StringBuilder buf=new StringBuilder();
			while((str=br.readLine())!=null)
			{
				//System.out.print(str);
				buf.append(str);
				//buf.append("\n");
			}
			br.close();
			
			//System.out.print(buf);
			
			arr=buf.toString().split("Date");
			
			for(int i=1;i<arr.length;i++)
			{
				//System.out.println(arr[i]);
				createReservation(new StringBuilder(arr[i]));
			}
		}catch(IOException ex){
			System.out.println("File not exist");
		}
		
		
		/*for(Reservation date:dateList)
		{
			System.out.println(date);
		}*/
	
	}
	
	public String showReservations() {
		StringBuilder sb=new StringBuilder();
		for(Reservation note:dateList)
		{
			sb.append(note);
			sb.append("\n");
		}
		return sb.toString();
	}
	
	/*public String showReservationsPerDate(Date date) {
		String str="";
		for(int i=0;i<dateList.size();i++)
		{
			if(dateList.get(i).getDate().compareTo(date)==0)
			{
				str=dateList.get(i).toString();
			}
		}
		return str;
	}*/
	
	public Table[] showReservationsPerDate(Date date) {
		Table[]tables=null;
		for(int i=0;i<dateList.size();i++)
		{
			if(dateList.get(i).getDate().compareTo(date)==0)
			{
				tables=dateList.get(i).getTables();
			}
		}
		return tables;
	}


	public void createReservation(StringBuilder buf) {
		//System.out.println(buf.toString());
		int startIndex=buf.indexOf(":");
		//System.out.println("Start "+startIndex);
		int beginIndex=buf.indexOf(":",startIndex);
		//System.out.println("begin "+beginIndex);
		int endIndex=buf.indexOf(",",beginIndex);
		int specIndex=buf.indexOf("]",beginIndex);
		endIndex=endIndex<specIndex?endIndex:specIndex;
		//System.out.println("end "+endIndex);
		
		//System.out.println("Start "+startIndex+" begin "+beginIndex+" end "+endIndex);
		
		String date=buf.substring(beginIndex+1,endIndex);
		
		dateList.add(new Reservation(date));
		
		startIndex=buf.indexOf("tables",endIndex);
		for(int i=0;i<4;i++)
		{
			startIndex=buf.indexOf("Table",endIndex);
			beginIndex=buf.indexOf(":",startIndex);
			endIndex=buf.indexOf(",",beginIndex);
			specIndex=buf.indexOf("]",beginIndex);
			endIndex=endIndex<specIndex?endIndex:specIndex;
			
			
			int tempTableNo=Integer.parseInt(buf.substring(beginIndex+1,endIndex));
			
			String[]hours=new String[4];
			startIndex=buf.indexOf("hours",endIndex);
			for(int j=0;j<4;j++)
			{
				startIndex=buf.indexOf("name",endIndex);
				beginIndex=buf.indexOf(":",startIndex);
				endIndex=buf.indexOf(",",beginIndex);
				specIndex=buf.indexOf("]",beginIndex);
				if(endIndex>0)
				{
					endIndex=endIndex<specIndex?endIndex:specIndex;
				}
				else
				{
					endIndex=specIndex;
				}
				
				hours[j]=buf.substring(beginIndex+1,endIndex);
			}
			
			dateList.get(dateList.size()-1).tablesAdd(tempTableNo, hours);
		
		}
	}
	

}
