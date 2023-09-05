package alex_olhovskiy.OOP_Seminar7HT2;

import java.util.ArrayList;
import java.util.Arrays;

public class Presenter implements Runnable{
	
	private VacancyWindow vw=new VacancyWindow();
	private ArrayList<Company>companies;
	private Publisher jobAgency;
	
	public Presenter(ArrayList<Company>companies,Publisher jobAgency) {
		//this.vw=vw;
		this.companies=companies;
		this.jobAgency=jobAgency;
		//this.vw.setVisible(true);
	}
	
	
	public void makeNewVacancy() {
	
		for(Company company:companies)
		{
			company.jobPosting();
		}
		
		ArrayList<Vacancy>vacancies=jobAgency.getVacancies();
		vw.listClear();
		for(Vacancy vacancy:vacancies)
		{
			vw.addVacancies(vacancy.toString());
			System.out.println(vacancy);
		}
		vw.createWindow();
		//jobAgency.print();
		jobAgency.vacancyMailing();
	}
	
	
	
	public void run() {
		while(true) {
			synchronized(jobAgency) {
				makeNewVacancy();
			}
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
