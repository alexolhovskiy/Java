package alex_olhovskiy.OOP_Seminar5;

import java.util.ArrayList;
import java.util.Date;

public class TableModel implements Model{
	private ArrayList<Table>tables;
	
	public TableModel() {
		loadTable();
	}
	
	public ArrayList<Table>loadTable(){
		if(tables==null)
		{
			tables=new ArrayList();
			tables.add(new Table());
			tables.add(new Table());
			tables.add(new Table());
			tables.add(new Table());
		}
		return tables;
	}
	
	public int reservationTable(Date date,int tableNo,String name) {
		for(Table table:loadTable())
		{
			if(table.getNo()==tableNo)
			{
				table.getReservation().add(new Reservation(date,tableNo,name));
			}
		}
		return tableNo;
	}
	
	public ArrayList<Table>getTables(){
		return tables;
	}

}
