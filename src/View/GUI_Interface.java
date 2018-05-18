package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI_Interface {
	private static JFrame MyJFrame = new JFrame("ATM Machine");
	private static JButton Withdraw = new JButton("Withdraw");
	private static JButton Deposit = new JButton("Deposit");
	private static JButton Remittance = new JButton("Remittance");
	private static JButton View_account_detail = new JButton("View_account_detail");
	private static JTextField MyJTextField = new JTextField();
	
	public GUI_Interface() {
		MyJFrame.setLayout(null);
		MyJFrame.setBounds(200,100,300,200);
		MyJFrame.setVisible(true);
		MyJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Withdraw.setBounds(40, 10, 100, 30);
		Deposit.setBounds(150, 10, 100, 30);
		Remittance.setBounds(40, 50, 100, 30);
		View_account_detail.setBounds(150, 50, 100, 30);
		
		MyJTextField.setBounds(40, 120, 210, 30);
		MyJFrame.add(Withdraw);
		MyJFrame.add(Deposit);
		MyJFrame.add(Remittance);
		MyJFrame.add(View_account_detail);
		MyJFrame.add(MyJTextField);
	}
	public JButton getWithdraw(){
		return Withdraw;
	}
	public JButton getDeposit(){
		return Deposit;
	}
	public JButton getRemittance(){
		return Remittance;
	}
	public JButton getView_account_detail(){
		return View_account_detail;
	}
	
}
