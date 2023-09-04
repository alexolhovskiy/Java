package alex_olhovskiy.Bank;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BancAccount extends JFrame{
	JButton loadButton=new JButton("Load Money");
	JButton getButton=new JButton("Get Money");
	JTextField textField=new JTextField("",5);
	
	private String userName;
	private double balance;
	private final double maxRange=1000;
	public BancAccount(String userName,double balance) {
		super("Bank account "+userName);
		
		this.userName=userName;
		this.balance=balance;
		
		
		this.setBounds(100,100,200,200);
		
		Container container=this.getContentPane();
		container.setLayout(new GridLayout(3,2,2,3));
		container.add(loadButton);
		loadButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loadMoney(Double.parseDouble(textField.getText()));
			}
			
		});
		
		container.add(getButton);
		getButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getMoney(Double.parseDouble(textField.getText()));
			}
			
		});
		container.add(textField);
		textField.setText("Current balance is "+balance);
		this.setVisible(true);
	}
	
	public void getMoney(double money) {
		try {
			if(balance<money) {
				throw new InsufficientFundsException("There are not enough money on that account");
			}
			balance-=money;
			System.out.println("New balance of "+userName+" account is "+balance );
			textField.setText("Current balance is "+balance);
		}catch(InsufficientFundsException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	public void loadMoney(double money) {
		try {
			if(maxRange<(balance+money)) {
				throw new MaxBalanceExceededException("There is too much load");
			}
			balance+=money;
			System.out.println("New balance of "+userName+" account is "+balance );
			textField.setText("Current balance is "+balance);
		}catch(MaxBalanceExceededException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.PLAIN_MESSAGE);
		}
	}
	
}
