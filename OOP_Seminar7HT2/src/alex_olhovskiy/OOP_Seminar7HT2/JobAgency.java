package alex_olhovskiy.OOP_Seminar7HT2;

import java.util.ArrayList;


public class JobAgency implements Publisher{
	private ArrayList<Observer>observers=new ArrayList<>();
	private ArrayList<Vacancy>vacancies=new ArrayList<>();                                                                                                                                                                                                                                            
	
	
	public void addVacancies(Vacancy vacancy) {
		vacancies.add(vacancy);
	}
	
	public void workerRegistrator(Worker worker) {
		observers.add(worker);
	}
	
	public void vacancyMailing() {
		for(Observer observer:observers)
		{
			for(Vacancy vacancy:vacancies)
			{
				if((observer.getJobType()==vacancy.getJobType())&&
				   (observer.getExperience()>vacancy.getNecessaryExperience()))
				   {
						observer.addVacancy(vacancy);
				   }
			}
		}
	}
	
	public ArrayList<Vacancy> getVacancies() {
		return vacancies;
	}
	
	
	public void print() {
		for(Observer observer:observers)
		{
			System.out.println(observer);
		}
		Sep();
		for(Vacancy vacancy:vacancies)
		{
			System.out.println(vacancy);
		}
		Sep();
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
