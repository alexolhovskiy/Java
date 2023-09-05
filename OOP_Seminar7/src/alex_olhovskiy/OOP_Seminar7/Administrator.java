package alex_olhovskiy.OOP_Seminar7;

public class Administrator extends Vacancy {
	private static final int salaryMin=100000;
	private static final int salaryMax=150000;
	
	public Administrator(int necessaryExperience,String companyName) {
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
