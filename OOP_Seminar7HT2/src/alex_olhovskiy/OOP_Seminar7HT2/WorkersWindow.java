package alex_olhovskiy.OOP_Seminar7HT2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;


public class WorkersWindow extends JFrame{
	
	
	public WorkersWindow() {
		super("Workers Window");
		this.setBounds(100,100,300,300);
		Container container=this.getContentPane();
		container.setLayout(new GridLayout(1,1,20,20));
		
		final JList list = new JList();
        list.setSelectedIndex(0);
        list.setFocusable(false);
        container.add(new JScrollPane(list), BorderLayout.CENTER);
		
	}

}
