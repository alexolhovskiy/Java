package alex_olhovskiy.OOP_Seminar6HT;


public class OOP_Seminar6HT {

	public static void main(String[] args) {
		View view=new View();
		Model model=new Model();
		Presenter presenter=new Presenter(model,view);
		presenter.Controller();

	}

}
