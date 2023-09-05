package alex_olhovskiy.JavaJSON;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ReservationDate{
	private Date date;
	private Table[]tables=new Table[4];
	
	public ReservationDate(String date){
		SimpleDateFormat format = new SimpleDateFormat();
		format.applyPattern("yyyy-MM-dd");
		try {
			this.date= format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(String.format("%tF",this.date));
	}
	
	public void tablesAdd(int tableNo,String[]hours) {
		tables[tableNo]=new Table(tableNo,hours);
	}
	
	public String tablesToString() {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<tables.length;i++)
		{
			sb.append(tables[i]);
			sb.append(" ");
		}
		return sb.toString();
	}

	
	public String toString() {
		return "Date "+String.format("%tF",date)+" Tables: "+tablesToString();
	}
	
}
