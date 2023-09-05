package alex_olhovskiy.OOP_Seminar7HT2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class VacancyWindow extends JFrame{
	
	//public ArrayList<String>vacancies=new ArrayList<>();
	private final DefaultListModel listModel = new DefaultListModel();
	Container container;
	public VacancyWindow() {
		super("Vacancy Window");
		this.setBounds(400,100,300,300);
		container=this.getContentPane();
		container.setLayout(new GridLayout(1,1,20,20));
		createWindow();
	}
	
	public void createWindow() {
		final JList list = new JList(listModel);
        list.setSelectedIndex(0);
        list.setFocusable(false);
        container.add(new JScrollPane(list), BorderLayout.CENTER);
        JFrame.setDefaultLookAndFeelDecorated(true);
        setVisible(true);
	}
	
	public void listClear() {
		listModel.removeAllElements();
	}
	
	public void addVacancies(String str) {
		listModel.addElement(str);
	}
}
