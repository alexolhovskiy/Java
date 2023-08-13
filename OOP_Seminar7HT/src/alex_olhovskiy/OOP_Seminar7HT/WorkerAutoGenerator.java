package alex_olhovskiy.OOP_Seminar7HT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WorkerAutoGenerator {
		
	private Random rand=new Random();
	private ArrayList<String>names=new ArrayList<>(Arrays.asList(
			"Sasha","Misha","Vasia","Grisha","Stepa","Abdulla","Ravshan","Moisey","Gennadiy"));
	private ArrayList<String>secondNames=new ArrayList<>(Arrays.asList(
			"Ivanov","Petrov","Sidorov","Pushkin","Mikulich","Rabinovich","Balbatian","Zamkov"));

		
	public Worker getRandomWorker() {
		String name=names.get(rand.nextInt(names.size()-1));
		String secondName=secondNames.get(rand.nextInt(secondNames.size()-1));
		int experience=rand.nextInt(10);
		JobType jobType=JobType.values()[(rand.nextInt(9))];
		int expectedSalary=experience>5 ? jobType.getMaxSalary():jobType.getMinSalary();
		return new Worker(name,secondName,jobType,expectedSalary,experience);
	}

}
