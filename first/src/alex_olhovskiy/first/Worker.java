package alex_olhovskiy.first;

import java.util.Comparator;

public class Worker {//implements Comparator<Worker>{//Comparable<Worker>{
	public static int count;
	static{
		count=100;
	}
	private int id;
	private String name;
	private double salary;
	
	public Worker(String name, double salary){
		this.name=name;
		this.salary=salary;
		this.id=count++;
	}
	
	public String toString(){
		return "Worker # "+id+" "+name+" "+salary;
	}


	public double getSalary() {
		return salary;
	}

//	@Override
//	public int compareTo(Worker arg0) {
////		if(this.salary>arg0.getSalary())
////		{
////			return 1;
////		}
////		else
////		{
////			if(this.salary==arg0.getSalary())
////			{
////				return 0;
////			}
////			else
////			{
////				return -1;
////			}
////		}
//		return Double.compare(this.salary,arg0.getSalary());
//	}

	

//	@Override
//	public int compare(Worker arg0, Worker arg1) {
//		return Double.compare(arg0.getSalary(),arg1.getSalary());
//	}

}
