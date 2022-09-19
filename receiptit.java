package IncomeTax;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

import IncomeTax.receiptit2;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class receiptit {

	private JFrame frame;
	private JTextField textField;
	private JTextField t1;
	private JTextField t2;
	private JTextField t4;
	private JTextField t3;
	private JTextField t5;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void Newscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					receiptit window = new receiptit();
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
	public receiptit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 191, 255));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 697, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(29, 26, 619, 375);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ELCOT\\Pictures\\logo45.png"));
		lblNewLabel.setBounds(0, 0, 619, 121);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PANNo");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setBounds(100, 207, 121, 21);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(Color.BLACK);
		textField.setBounds(176, 154, 126, -30);
		panel.add(textField);
		textField.setColumns(10);
		
		t1 = new JTextField();
		t1.setBounds(258, 132, 200, 20);
		panel.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("UserName");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(100, 132, 121, 21);
		panel.add(lblNewLabel_1_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(258, 169, 200, 20);
		panel.add(t2);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(258, 244, 200, 20);
		panel.add(t4);
		
		JLabel lblNewLabel_1_2 = new JLabel("EmailId");
		lblNewLabel_1_2.setBackground(Color.GRAY);
		lblNewLabel_1_2.setForeground(Color.GRAY);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_2.setBounds(100, 164, 121, 21);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Amount");
		lblNewLabel_1_3.setForeground(Color.GRAY);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_3.setBounds(100, 273, 121, 21);
		panel.add(lblNewLabel_1_3);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(258, 208, 200, 20);
		panel.add(t3);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(258, 278, 200, 20);
		panel.add(t5);
		
		lblNewLabel_2 = new JLabel("Account No");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setBounds(100, 243, 133, 21);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Print Receipt");
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=t1.getText();
				String str1=t2.getText();
				String str2=t3.getText();
				String str3=t4.getText();
				String str4=t5.getText();
				receiptit2 obj= new receiptit2();
				obj.my_update(str);
				obj.setVisible(true);
				obj.my_update1(str1); 
				obj.setVisible(true);
				obj.my_update2(str2);
				obj.setVisible(true);
				obj.my_update3(str3);
				obj.setVisible(true); 
				obj.my_update4(str4);
				obj.setVisible(true);
			}
		});
		btnNewButton.setBounds(337, 327, 177, 23);
		panel.add(btnNewButton);
	}
}
