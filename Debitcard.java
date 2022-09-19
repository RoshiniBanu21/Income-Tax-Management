package IncomeTax;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Debitcard {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Debitcard window = new Debitcard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Debitcard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 639, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.GRAY);
		panel.setBackground(Color.WHITE);
		panel.setBounds(23, 21, 574, 337);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCardNo = new JLabel("Card No");
		lblCardNo.setForeground(Color.DARK_GRAY);
		lblCardNo.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCardNo.setBackground(Color.WHITE);
		lblCardNo.setBounds(35, 85, 110, 31);
		panel.add(lblCardNo);
		
		JLabel lblExpiryDate = new JLabel("Expiry date");
		lblExpiryDate.setForeground(Color.DARK_GRAY);
		lblExpiryDate.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblExpiryDate.setBackground(Color.WHITE);
		lblExpiryDate.setBounds(35, 129, 126, 31);
		panel.add(lblExpiryDate);
		
		JLabel lblCardHoldersName = new JLabel("Card Holder's Name");
		lblCardHoldersName.setForeground(Color.DARK_GRAY);
		lblCardHoldersName.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCardHoldersName.setBackground(Color.WHITE);
		lblCardHoldersName.setBounds(35, 176, 220, 31);
		panel.add(lblCardHoldersName);
		
		JLabel lblCvv = new JLabel("Cvv");
		lblCvv.setForeground(Color.DARK_GRAY);
		lblCvv.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCvv.setBackground(Color.WHITE);
		lblCvv.setBounds(35, 218, 126, 31);
		panel.add(lblCvv);
		
		JButton btnNewButton = new JButton("Pay");
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setBackground(new Color(255, 228, 196));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.setBounds(400, 273, 89, 23);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(275, 95, 268, 21);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(275, 139, 268, 21);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(275, 228, 268, 21);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(275, 186, 268, 21);
		panel.add(textField_3);
	}

}
