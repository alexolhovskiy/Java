package alex_olhovskiy.OOP_Seminar7;


public class Worker implements Observer {
	private String name;
	private String secondName;
	private int expectedSalary;
	private JobType jobType;
	private int experience;
	
	public Worker(String name,String secondName,JobType jobType,int expectedSalary,int experience) {
		this.name=name;
		this.secondName=secondName;
		this.expectedSalary=expectedSalary;
		this.jobType=jobType;
		this.experience=experience;
	}

	public String getName() {
		return name;
	}

	public String getSecondName() {
		return secondName;
	}

	public int getExpectedSalary() {
		return expectedSalary;
	}

	public JobType getJobType() {
		return jobType;
	}

	public int getExperience() {
		return experience;
	}
	
	
}
