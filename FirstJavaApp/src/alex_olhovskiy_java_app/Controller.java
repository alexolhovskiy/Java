package alex_olhovskiy_java_app;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Controller extends JFrame {
	JButton button=new JButton("press me");
	JTextField textField=new JTextField("",5);
	JLabel label=new JLabel("input");
	JRadioButton radioButton=new JRadioButton("select");
	JCheckBox checkBox=new JCheckBox("check",false);
	
	public Controller() {
		super("Simple window");
		this.setBounds(200,200,200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=this.getContentPane();
		container.setLayout(new GridLayout(3,2,2,3));
		container.add(label);
		container.add(textField);
		ButtonGroup group=new ButtonGroup();
		group.add(radioButton);
		container.add(radioButton);
		radioButton.setSelected(true);
		button.addActionListener(new ButtonEvent());
		container.add(button);
	}
	
	class ButtonEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			String message="Button press!";
			JOptionPane.showMessageDialog(null,message,"Output",JOptionPane.PLAIN_MESSAGE);
		}
		
	}
}
