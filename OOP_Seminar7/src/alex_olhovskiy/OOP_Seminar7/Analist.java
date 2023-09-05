package alex_olhovskiy.OOP_Seminar7;

public class Analist extends Vacancy {
	private static final int salaryMin=90000;
	private static final int salaryMax=100000;
	
	public Analist(int necessaryExperience,String companyName) {
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
