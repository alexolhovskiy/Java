package alex_olhovskiy.OOP_Seminar7;

public class Plumber extends Vacancy {
	private static final int salaryMin=30000;
	private static final int salaryMax=40000;
	
	public Plumber(int necessaryExperience,String companyName) {
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
