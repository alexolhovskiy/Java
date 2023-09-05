package alex_olhovskiy.OOP_Seminar3_second;

import java.util.HashMap;
import java.util.Iterator;


public class Worker implements Iterator<String>{
	public static int count;
	static {
		count=0;
	}
	private int id;
	private String name;
	private String secondName;
	private int wage;
	private int jobId;
	private int index;
	
	
	
	public Worker(String name,String secondName,int jobId,int wage){
		this.name=name;
		this.secondName=secondName;
		this.jobId=jobId;
		this.wage=wage;
		this.id=count++;
		index=0;
	}
	
	public String toString() {
		return "Worker #"+id+"\nName "+name+"\nSecond Name "+secondName
				+"\nwage "+wage+"\njobId "+jobId;
				
	}

	@Override
	public boolean hasNext() {
		return index++<5;
	}

	@Override
	public String next() {
		switch(index)
		{
			case 1: return ""+id;
			case 2: return name;
			case 3: return secondName;
			case 4: return ""+wage;
			default: return ""+jobId;
		}
	}
	
	
}
