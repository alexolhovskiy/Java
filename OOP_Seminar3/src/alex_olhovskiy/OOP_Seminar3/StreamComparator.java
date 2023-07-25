package alex_olhovskiy.OOP_Seminar3;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudyStream>{

	@Override
	public int compare(StudyStream o1, StudyStream o2) {
		return Integer.compare(o1.getGroupNum(), o2.getGroupNum());
	}
	
}
