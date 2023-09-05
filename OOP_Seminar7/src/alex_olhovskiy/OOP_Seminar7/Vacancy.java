package alex_olhovskiy.OOP_Seminar7;

public abstract class Vacancy {
		
	protected int necessaryExperience;
	protected String companyName;
	
	protected int wages;
	
	public Vacancy(int necessaryExperience,String companyName) {
		this.necessaryExperience=necessaryExperience;
		this.companyName=companyName;
	}


	public int getNecessaryExperience() {
		return necessaryExperience;
	}


	public int getWages() {
		return wages;
	}

}
