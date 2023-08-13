package alex_olhovskiy.OOP_Seminar7HT;

public interface Observer {
	String getName();

	String getSecondName();

	int getExpectedSalary();

	JobType getJobType();

	int getExperience();
	
	void addVacancy(Vacancy vacancy);
	
}
