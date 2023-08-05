package alex_olhovskiy.OOP_Seminar5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEvent implements ActionListener {
	private DialogWindow dw=new DialogWindow();
	@Override
	public void actionPerformed(ActionEvent e) {
		dw.setVisible(true);
	}

}
