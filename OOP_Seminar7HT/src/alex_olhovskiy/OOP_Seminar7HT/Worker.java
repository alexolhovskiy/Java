package alex_olhovskiy.OOP_Seminar7HT;

import java.util.ArrayList;

public class Worker implements Observer {
	private String name;
	private String secondName;
	private int expectedSalary;
	private JobType jobType;
	private int experience;
	private ArrayList<Vacancy>vacancies=new ArrayList<>();   
	
	public Worker(String name,String secondName,JobType jobType,int expectedSalary,int experience) {
		this.name=name;
		this.secondName=secondName;
		this.expectedSalary=expectedSalary;
		this.jobType=jobType;
		this.experience=experience;
	}
	
	public void addVacancy(Vacancy vacancy) {
		//if(vacancy.getWages()>expectedSalary)
		//{
			boolean flag=true;
			for(Vacancy curVacancy:vacancies)
			{
				if(curVacancy==vacancy)
				{
					flag=false;
				}
			}
			if(flag)
			{
				vacancies.add(vacancy);
			}
		//}
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
	
	
	public String toString() {
		return ""+name+" "+secondName+" "+jobType+" whit "+experience+" year(s) experience. Expected Salary is "+expectedSalary+
				" Vacancies: "+vacancies;
	}
	
}

