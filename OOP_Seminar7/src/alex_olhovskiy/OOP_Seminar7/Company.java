package alex_olhovskiy.OOP_Seminar7;

import java.util.Random;

public class Company {
	
	private Random rand=new Random();
	private String name;
	Publisher jobAgency;
	
	public Company(String name,int maxSalary,Publisher jobAgency) {
		this.name=name;
		this.jobAgency=jobAgency;
	}
	
	public void jobPosting() {
		jobAgency.sendOffer(vacancyGenerator());
	}
	
	private Vacancy vacancyGenerator() {
		
		int experience=rand.nextInt(10);
		int index=rand.nextInt(9);
		
		Vacancy vacancy=null;
		
		switch(index)
		{
			case 0:
				vacancy=new Manager(experience,name);
				break;
			case 1:
				vacancy=new Administrator(experience,name);
				break;
			case 2:
				vacancy=new Developer(experience,name);
				break;
			case 3:
				vacancy=new Tester(experience,name);
				break;
			case 4:
				vacancy=new Analist(experience,name);
				break;
			case 5:
				vacancy=new Plumber(experience,name);
				break;
			case 6:
				vacancy=new Electrician(experience,name);
				break;
			case 7:
				vacancy=new Driver(experience,name);
				break;
			case 8:
				vacancy=new Courier(experience,name);
				break;
			case 9:
				vacancy=new Cleaner(experience,name);
				break;
		}
		return vacancy;
	}
	
}
