package alex_olhovskiy.OOP_Seminar7;

public class Courier extends Vacancy {
	private static final int salaryMin=20000;
	private static final int salaryMax=30000;
	
	public Courier(int necessaryExperience,String companyName) {
		super(necessaryExperience,companyName);
		wages=((salaryMax-salaryMin)/10)*necessaryExperience;
	}
	
	public static int getSalaryMin() {
		return salaryMin;
	}


	public static int getSalaryMax() {
		return salaryMax;
	}
}
