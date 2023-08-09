package alex_olhovskiy.OOP_Seminar6HT;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface FileWorkerInterface {
	void saveToJson(Order order);
	ArrayList<Order> loadFromJson() throws FileNotFoundException, IOException;
	void clearFile();
}
