package alex_olhovskiy.OOP_Seminar7HT2;

public class Vacancy {
	
	private int necessaryExperience;
	private String companyName;
	private JobType jobType;
	private int wages;
	
	public Vacancy(JobType jobType,int necessaryExperience,String companyName) {
		this.jobType=jobType;
		this.necessaryExperience=necessaryExperience;
		this.companyName=companyName;
		wages=jobType.getMinSalary()+((jobType.getMaxSalary()-jobType.getMinSalary())/10)*necessaryExperience;
	}

	public int getNecessaryExperience() {
		return necessaryExperience;
	}

	public String getCompanyName() {
		return companyName;
	}

	public JobType getJobType() {
		return jobType;
	}

	public int getWages() {
		return wages;
	}
	
	public String toString() {
		return "Job in "+companyName+" on "+jobType+" post, "+necessaryExperience+" year(s) experience expected, with start wages "+wages;
	}
	
	public boolean equals(Object o) {
		return toString().equals((Vacancy)o);
	}
}
