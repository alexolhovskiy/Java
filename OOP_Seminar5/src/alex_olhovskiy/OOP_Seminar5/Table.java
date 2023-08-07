package alex_olhovskiy.OOP_Seminar5;

import java.util.ArrayList;

public class Table {

	private int tableNo;
	private String[]hours=new String[4];
	
	public Table(int tableNo,String[]hours) {
		this.tableNo=tableNo;
		this.hours=hours;
	}
	
	public String hoursToString() {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<hours.length;i++)
		{
			sb.append(i+20);
			sb.append(":00-");
			sb.append(i+21);
			sb.append(":00 ");
			sb.append(hours[i]);
			sb.append("; ");
		}
		return sb.toString();
	}
	
	public String toString() {
		return "Table#"+tableNo+" Reservations: "+hoursToString();
	}
	
	public String getHours(int index) {
		return hours[index];
	}
	
	public void setHours(int index,String name) {
		hours[index]=name;
	}
}
