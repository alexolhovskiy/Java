package alex_olhovskiy.OOP_Seminar7HT;

import java.util.ArrayList;

public class OOP_Seminar7HT {

	public static void main(String[] args) {
		
		Publisher jobAgency=new JobAgency();
		
		ArrayList<Company>companies=new ArrayList<>();
		
		companies.add(new Company("Google",jobAgency));
		companies.add(new Company("Microsofr",jobAgency));
		companies.add(new Company("Yandex",jobAgency));
		
		WorkerAutoGenerator wag=new WorkerAutoGenerator();
		
		for(int i=0;i<10;i++)
		{
			jobAgency.workerRegistrator(wag.getRandomWorker());
		}
		
		for(Company company:companies)
		{
			company.jobPosting();
		}
		jobAgency.print();
		jobAgency.vacancyMailing();
		jobAgency.print();
		
		for(Company company:companies)
		{
			company.jobPosting();
		}
		jobAgency.vacancyMailing();
		jobAgency.print();
		
		
		System.out.println("OK");

	}

}
