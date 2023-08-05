package alex_olhovskiy.OOP_Seminar5;

import java.util.ArrayList;
import java.util.Date;

public interface Model {
	
	public ArrayList<Table> loadTable();
	int reservationTable(Date date,int tableNo,String name);

}
