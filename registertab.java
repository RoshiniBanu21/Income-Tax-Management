package IncomeTax;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

import java.sql.Connection;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class registertab {

	private JFrame frmRegister;
	private JTextField user;
	private JTextField panno;
	private JTextField pwds;
	private JTextField cpwds;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void Newscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registertab window = new registertab();
					window.frmRegister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registertab() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegister = new JFrame();
		frmRegister.setTitle("Register");
		frmRegister.getContentPane().setBackground(new Color(0, 191, 255));
		frmRegister.setBounds(100, 100, 710, 490);
		frmRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegister.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(22, 21, 637, 404);
		frmRegister.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 619, 128);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ELCOT\\Pictures\\logo45.png"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Name");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(49, 179, 126, 20);
		panel.add(lblNewLabel_1);
		
		user = new JTextField();
		user.setColumns(10);
		user.setBounds(243, 182, 251, 20);
		panel.add(user);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_1.setBounds(49, 210, 136, 20);
		panel.add(lblNewLabel_1_1_1);
		
		panno = new JTextField();
		panno.setColumns(10);
		panno.setBounds(243, 302, 251, 20);
		panel.add(panno);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("ConfirmPassword");
		lblNewLabel_1_1_1_2.setForeground(Color.GRAY);
		lblNewLabel_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_1_1_1_2.setBackground(Color.BLACK);
		lblNewLabel_1_1_1_2.setBounds(48, 236, 192, 20);
		panel.add(lblNewLabel_1_1_1_2);
		
		pwds = new JTextField();
		pwds.setColumns(10);
		pwds.setBounds(243, 210, 251, 20);
		panel.add(pwds);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email id");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(49, 269, 111, 18);
		panel.add(lblNewLabel_1_1);
		
		cpwds = new JTextField();
		cpwds.setColumns(10);
		cpwds.setBounds(243, 239, 251, 20);
		panel.add(cpwds);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("PANNo");
		lblNewLabel_1_1_2.setForeground(Color.GRAY);
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_1_1_2.setBackground(Color.BLACK);
		lblNewLabel_1_1_2.setBounds(48, 302, 126, 20);
		panel.add(lblNewLabel_1_1_2);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(243, 271, 251, 20);
		panel.add(email);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setBackground(new Color(255, 228, 196));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[]args= {};
				frontpage nw=new frontpage();
				nw.main(args);
			}
		});
		btnNewButton.setBounds(124, 355, 111, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBackground(new Color(255, 228, 196));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/incometax","root","");
			         	PreparedStatement pst=null;
			         	String Username = String.valueOf(user.getText().trim());
				        String Password = String.valueOf(pwds.getText().trim());
				        String ConfirmPassword = String.valueOf(cpwds.getText().trim());
				        String Emailid = String.valueOf(email.getText().trim());
				        String PANNo = String.valueOf(panno.getText().trim());
				        String qString = String.format("INSERT INTO `register`(`Username`, `Password`, `ConfirmPassword`,`Emailid`, `PANNo`) VALUES ('%s','%s','%s','%s','%s')", 
					    		Username, Password, ConfirmPassword, Emailid, PANNo
					    		);
	                    pst=con1.prepareStatement(qString);
	                    pst.executeUpdate();
	                    JOptionPane.showMessageDialog(null, "REGISTERED SUCCESSFULLY");
						payamount nw=new payamount();
						nw.Newscreen();
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,ex);
				System.out.println(ex);
				}
		}
});
			
			
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton_1.setBounds(368, 355, 126, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Create New Account");
		lblNewLabel_2.setForeground(new Color(65, 105, 225));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setBounds(169, 139, 251, 20);
		panel.add(lblNewLabel_2);
}	
}
