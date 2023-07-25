package alex_olhovskiy.OOP_Seminar3;

import java.util.ArrayList;
import java.util.Random;

public class StudyGroup {
	
	private int id;
	private ArrayList<String>students=new ArrayList<>();
	
	public StudyGroup() {
		id=(new Random()).nextInt(10);
		for(int i=0;i<10;i++)
		{
			students.add("Students"+(i+1));
		}
	}
	
	public String toString() {
		return "Group id: "+id+" Student list: "+students;
	}

}
