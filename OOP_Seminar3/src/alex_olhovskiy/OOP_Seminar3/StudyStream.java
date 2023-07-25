package alex_olhovskiy.OOP_Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class StudyStream implements Iterable<StudyGroup> {
	
	private int groupNum;
	private ArrayList<StudyGroup>groups=new ArrayList<>(); 
	private int id;
	
	public int getGroupNum() {
		return groupNum;
	}
	
	public StudyStream() {
		groupNum=(new Random()).nextInt(10);
		id=(new Random()).nextInt(100);
		for(int i=0;i<groupNum;i++)
		{
			groups.add(new StudyGroup());
		}
	}
	
	@Override
	public Iterator<StudyGroup> iterator() {
		Iterator<StudyGroup>it=new Iterator<StudyGroup>() {
			private int index=0;
			
			public boolean hasNext() {
				return index<groups.size();
			}
			@Override
			public StudyGroup next() {
				return groups.get(index++);
			}
		};
		return it;
	}
	
	public String toString() {
		return "Stream id: "+id+"; Number of groups: "+groupNum;
	}
}
