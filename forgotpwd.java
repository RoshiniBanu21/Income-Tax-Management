package IncomeTax;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class forgotpwd {

	private JFrame frame;
	private JTextField userid;
	private JTextField mailid;
	private JTextField conpwd;
	private JTextField newpwd;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void Newscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgotpwd window = new forgotpwd();
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
	public forgotpwd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 191, 255));
		frame.setBounds(100, 100, 690, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(25, 23, 619, 368);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ELCOT\\Pictures\\logo45.png"));
		lblNewLabel.setBounds(0, 0, 608, 131);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(69, 142, 141, 27);
		panel.add(lblNewLabel_1);
		
		userid = new JTextField();
		userid.setColumns(10);
		userid.setBounds(301, 150, 191, 20);
		panel.add(userid);
		
		mailid = new JTextField();
		mailid.setColumns(10);
		mailid.setBounds(301, 181, 191, 20);
		panel.add(mailid);
		
		conpwd = new JTextField();
		conpwd.setColumns(10);
		conpwd.setBounds(301, 251, 191, 20);
		panel.add(conpwd);
		
		newpwd = new JTextField();
		newpwd.setColumns(10);
		newpwd.setBounds(301, 212, 191, 20);
		panel.add(newpwd);
		
		lblNewLabel_1_1 = new JLabel("EmailId");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(69, 173, 136, 28);
		panel.add(lblNewLabel_1_1);
		
		lblNewLabel_1_1_1 = new JLabel("NewPassword");
		lblNewLabel_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_1.setBounds(69, 214, 170, 18);
		panel.add(lblNewLabel_1_1_1);
		
		lblNewLabel_1_1_2 = new JLabel("ConfirmPassword");
		lblNewLabel_1_1_2.setForeground(Color.GRAY);
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1_2.setBackground(Color.BLACK);
		lblNewLabel_1_1_2.setBounds(69, 251, 202, 18);
		panel.add(lblNewLabel_1_1_2);
		
		btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/incometax","root","");
					Statement stmt=(Statement) con1.createStatement();
					PreparedStatement pst = null;

					String UserName = String.valueOf(userid.getText().trim());
					String NewPassword =String.valueOf(newpwd.getText());
					

					String Username= "SELECT Username,Password  FROM signin";
					ResultSet rs=stmt.executeQuery(Username);
		
					while(rs.next()) {
						if(rs.getString(1).equals(Username) && rs.getString(2).equals(NewPassword)) {
							String pass= "UPDATE signin SET Password=('"+NewPassword+"') where Username=('"+UserName+"')";
							pst=con1.prepareStatement(pass);
							pst.executeUpdate(pass);
					JOptionPane.showMessageDialog(null, "Password changed  Sucessfully...");
					Signin nw = new Signin();
					nw.Newscreen();
					break;
					}
					}
					con1.close();

					}catch(Exception ex)
				{System.out.println(ex);}
					}
					});
			
	
		btnNewButton_1.setBackground(new Color(255, 228, 196));
		btnNewButton_1.setForeground(new Color(128, 128, 128));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton_1.setBounds(336, 308, 156, 23);
		panel.add(btnNewButton_1);
		
		btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[]args= {};
				frontpage nw=new frontpage();
				nw.main(args);
			}
		});
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton.setBackground(new Color(255, 228, 196));
		btnNewButton.setBounds(69, 307, 113, 27);
		panel.add(btnNewButton);
	}
}
