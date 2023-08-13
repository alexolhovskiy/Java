package alex_olhovskiy.OOP_Seminar7HT;

public enum JobType {
	
	Manager(100000,150000,"Manager"),
	Administrator(100000,150000,"Administrator"),
	Developer(90000,100000,"Developer"),
	Tester(90000,100000,"Tester"),
	Analist(90000,100000,"Analist"),
	Plumber(30000,40000,"Plumber"),
	Electrician(30000,40000,"Electrician"),
	Driver(20000,30000,"Driver"),
	Courier(20000,30000,"Courier"),
	Cleaner(20000,30000,"Cleaner");
	
	
	private int minSalary;
	private int maxSalary;
	private String name;
	
	JobType(int minSalary,int maxSalary,String name){
		this.minSalary=minSalary;
		this.maxSalary=maxSalary;
		this.name=name;
	}
	
	public int getMinSalary() {
		return minSalary; 
	}
	
	public int getMaxSalary() {
		return maxSalary; 
	}
	
	public String toString() {
		return ""+name;
	}
	
}
