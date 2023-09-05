package alex_olhovskiy.JavaJSON;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class JavaJSON {
	public static ArrayList<ReservationDate>tempDateList=new ArrayList<>();
	
	public static void main(String[] args) {
		
		
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
		
		
		for(ReservationDate date:tempDateList)
		{
			System.out.println(date);
		}

	}
	

	public static void createReservation(StringBuilder buf) {
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
		
		tempDateList.add(new ReservationDate(date));
		
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
			
			tempDateList.get(tempDateList.size()-1).tablesAdd(tempTableNo, hours);
		
		}
	}
}
