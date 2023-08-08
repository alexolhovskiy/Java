package alex_olhovskiy.OOP_Seminar5;

import java.util.ArrayList;
import java.util.Date;

public interface Model {
	
	boolean reservationTableAdd(Date date,int hour,int tableNo,String name);
}
