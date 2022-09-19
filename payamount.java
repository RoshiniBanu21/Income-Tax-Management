package IncomeTax;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class payamount {

	private JFrame frame;
	private JTextField bank;
	private JTextField ifsc;
	private JTextField amt;
	private JTextField textField_3;
	private JTextField accno;

	/**
	 * Launch the application.
	 */
	public static void Newscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payamount window = new payamount();
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
	public payamount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 191, 255));
		frame.setBounds(100, 100, 693, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(20, 21, 631, 360);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ELCOT\\Pictures\\logo45.png"));
		lblNewLabel.setBounds(0, 0, 621, 120);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BankName");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(66, 141, 126, 26);
		panel.add(lblNewLabel_1);
		
		bank = new JTextField();
		bank.setColumns(10);
		bank.setBounds(225, 149, 249, 20);
		panel.add(bank);
		
		JLabel lblNewLabel_1_1 = new JLabel("IfscCode");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(66, 213, 144, 26);
		panel.add(lblNewLabel_1_1);
		
		ifsc = new JTextField();
		ifsc.setColumns(10);
		ifsc.setBounds(225, 221, 249, 20);
		panel.add(ifsc);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Amount");
		lblNewLabel_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_1.setBounds(66, 252, 144, 26);
		panel.add(lblNewLabel_1_1_1);
		
		amt = new JTextField();
		amt.setBounds(225, 259, 249, 19);
		panel.add(amt);
		amt.setColumns(10);
		
		JButton btnNewButton = new JButton("Pay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
           try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/incometax","root","");
				    Statement stmt = con.createStatement();
				    String IfscCode  = String.valueOf(ifsc.getText().trim());
				    String AccountNo = String.valueOf(accno.getText());
				    String sql="SELECT * FROM payment where IfscCode=(IfscCode) and AccountNo=(AccountNo)";
				    ResultSet rs= stmt.executeQuery(sql);
				    int flag =0;
				    while(rs.next()) {
				    	if(rs.getString(3).equals(IfscCode) && rs.getString(2).equals(AccountNo) ) {
				    		flag++;
				    		JOptionPane.showMessageDialog(null,"payment successfull!");
							receiptit nw=new receiptit();
							nw.Newscreen();
				    		}
				    	else
				    		continue;
				    }
				    if(flag==0) {
				    	JOptionPane.showMessageDialog(null,"payment failed");
				    	}}
				catch(Exception e1) {
					System.out.println(e1);
				}
				}
				
		});
				
				  
		btnNewButton.setBackground(new Color(255, 228, 196));
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton.setBounds(348, 300, 126, 35);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("AccountNo");
		lblNewLabel_1_2.setForeground(Color.GRAY);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_2.setBackground(Color.BLACK);
		lblNewLabel_1_2.setBounds(66, 176, 132, 26);
		panel.add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(257, 190, 0, -6);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		accno = new JTextField();
		accno.setColumns(10);
		accno.setBounds(225, 180, 249, 20);
		panel.add(accno);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setForeground(Color.GRAY);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton_1.setBackground(new Color(255, 228, 196));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[]args= {};
				frontpage nw=new frontpage();
				nw.main(args);
			}
		});
		btnNewButton_1.setBounds(66, 300, 97, 35);
		panel.add(btnNewButton_1);
	}
}
