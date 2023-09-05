package alex_olhovskiy.OOP_Seminar7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WorkerAutoGenerator {
	
	private Random rand=new Random();
	private ArrayList<String>names=new ArrayList<>(Arrays.asList(
			"Sasha","Misha","Vasia","Grisha","Stepa","Abdulla","Ravshan","Moisey","Gennadiy"));
	private ArrayList<String>secondNames=new ArrayList<>(Arrays.asList(
			"Ivanov","Petrov","Sidorov","Pushkin","Mikulich","Rabinovich","Balbatian","Zamkov"));

	
	public JobType getJobType(int index) {
		switch(index)
		{
			case 0:return JobType.Manager;
			case 1:return JobType.Administrator;
			case 2:return JobType.Developer;
			case 3:return JobType.Tester;
			case 4:return JobType.Analist;
			case 5:return JobType.Plumber;
			case 6:return JobType.Electrician;
			case 7:return JobType.Driver;
			case 8:return JobType.Courier;
			case 9:return JobType.Cleaner;
			default: return null;
		}
	}
	
	public int getExpectedSalary(JobType jobType,int exp) {
		int wages=0;
		switch(jobType)
		{
			case Manager:
				wages= exp>5 ? Manager.getSalaryMax():Manager.getSalaryMin();
				break;
			case Administrator:
				wages= exp>5 ? Administrator.getSalaryMax():Administrator.getSalaryMin();
				break;
			case Developer:
				wages= exp>5 ? Developer.getSalaryMax():Developer.getSalaryMin();
				break;
			case Tester:
				wages= exp>5 ? Tester.getSalaryMax():Tester.getSalaryMin();
				break;
			case Analist:
				wages= exp>5 ? Analist.getSalaryMax():Analist.getSalaryMin();
				break;
			case Plumber:
				wages= exp>5 ? Plumber.getSalaryMax():Plumber.getSalaryMin();
				break;
			case Electrician:
				wages= exp>5 ? Electrician.getSalaryMax():Electrician.getSalaryMin();
				break;
			case Driver:
				wages= exp>5 ? Driver.getSalaryMax():Driver.getSalaryMin();
				break;
			case Courier:
				wages= exp>5 ? Courier.getSalaryMax():Courier.getSalaryMin();
				break;
			case Cleaner:
				wages= exp>5 ? Cleaner.getSalaryMax():Cleaner.getSalaryMin();
				break;
		}
		return wages;
	}
	
	
	public Worker getRandomWorker() {
		String name=names.get(rand.nextInt(names.size()-1));
		String secondName=secondNames.get(rand.nextInt(secondNames.size()-1));
		int experience=rand.nextInt(10);
		JobType jobType=getJobType(rand.nextInt(9));
		int salary=getExpectedSalary(jobType,experience);
		return new Worker(name,secondName,jobType,salary,experience);
	}
}
