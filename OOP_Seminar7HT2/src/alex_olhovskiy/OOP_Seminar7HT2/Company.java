package alex_olhovskiy.OOP_Seminar7HT2;

import java.util.Random;


public class Company {
	private Random rand=new Random();
	private String companyName;
	private Publisher jobAgency;
	
	public Company(String companyName,Publisher jobAgency) {
		this.companyName=companyName;
		this.jobAgency=jobAgency;
	}
	
	public void jobPosting() {
		jobAgency.addVacancies(vacancyGenerator());
	}
	
	private Vacancy vacancyGenerator() {
		
		int necessaryExperience=rand.nextInt(10);
		JobType jobType=JobType.values()[(rand.nextInt(9))];
		
		return new Vacancy(jobType,necessaryExperience,companyName);
	}
	
}
