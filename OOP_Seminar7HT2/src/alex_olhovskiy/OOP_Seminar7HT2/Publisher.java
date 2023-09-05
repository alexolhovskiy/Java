package alex_olhovskiy.OOP_Seminar7HT2;

import java.util.ArrayList;

public interface Publisher {
	void addVacancies(Vacancy vacancy);
	void workerRegistrator(Worker worker);
	void vacancyMailing();
	void print();
	ArrayList<Vacancy> getVacancies();
}
