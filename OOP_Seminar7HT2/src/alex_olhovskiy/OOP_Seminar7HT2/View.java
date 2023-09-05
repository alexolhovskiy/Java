package alex_olhovskiy.OOP_Seminar7HT2;

public class View {
	private WorkersWindow ww;
	private VacancyWindow vw;
	
	public View() {
		ww=new WorkersWindow();
		vw=new VacancyWindow();
		
		ww.setVisible(true);
		vw.setVisible(true);
	}
	
	public void addVacancy(String str) {
		vw.addVacancies(str);
	}
	public void listClear() {
		vw.listClear();
	}
}
