package alex_olhovskiy.OOP_Seminar3;

import java.util.ArrayList;

public class StreamService {

	private ArrayList<StudyStream> streams=new ArrayList<>();
	
	public void streamAdd(StudyStream st_s) {
		streams.add(st_s);
	}
	
	public void streamSort() {
		streams.sort(new StreamComparator());
	}
	
	public void streamPrint() {
		if(streams.isEmpty())
		{
			System.out.println("No Streams");
		}
		else
		{
			for(StudyStream stream:streams)
			{
				System.out.println(stream);
				for(StudyGroup group:stream)
				{
					System.out.println(group);
				}
			}	
		}
		Sep();
	}
	
	public static void Sep()
	{
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}
}
