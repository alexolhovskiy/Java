package alex_olhovskiy.OOP_Seminar7HT2;

import java.util.ArrayList;

public class OOP_Seminar7HT2 {
	//Presenter presenter;

	public static void main(String[] args) {
		
		//View view=new View();
		
		Publisher jobAgency=new JobAgency();
		ArrayList<Company>companies=new ArrayList<>();
		companies.add(new Company("Google",jobAgency));
		companies.add(new Company("Yandex",jobAgency));
		companies.add(new Company("Microsoft",jobAgency));
		companies.add(new Company("Tesla",jobAgency));
		companies.add(new Company("Amazone",jobAgency));
		
		//new Presenter(view,companies,jobAgency).start();
		
		Thread t = new Thread(new Presenter(companies,jobAgency));
        
        t.start();
		
		//presenter.makeNewVacancy();
		//presenter.makeNewVacancy();
		//presenter.makeNewVacancy();
		//presenter.makeNewVacancy();
		//presenter.makeNewVacancy();
//		presenter.makeNewVacancy();
//		presenter.makeNewVacancy();
//		presenter.makeNewVacancy();
		
		
		
		//ArrayList<Company>companies=new ArrayList<>();
		
		//companies.add(new Company("Google",jobAgency));
		//companies.add(new Company("Microsofr",jobAgency));
		//companies.add(new Company("Yandex",jobAgency));
		
		WorkerAutoGenerator wag=new WorkerAutoGenerator();
		
		for(int i=0;i<10;i++)
		{
			jobAgency.workerRegistrator(wag.getRandomWorker());
		}
		
		/*for(Company company:companies)
		{
			company.jobPosting();
		}*/
		//jobAgency.print();
//		jobAgency.vacancyMailing();
//		jobAgency.print();
//		
//		for(Company company:companies)
//		{
//			company.jobPosting();
//		}
//		jobAgency.vacancyMailing();
//		jobAgency.print();
//		
//		
        try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OK");

	}

}
