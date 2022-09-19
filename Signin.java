package IncomeTax;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Signin {

	private JFrame frmLogin;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public void Newscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signin window = new Signin();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Signin() {
		initialize();
		}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBackground(new Color(255, 228, 196));
		frmLogin.getContentPane().setBackground(new Color(135, 206, 250));
		frmLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(22, 11, 669, 433);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(56, 152, 143, 24);
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(59, 198, 140, 24);
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel.add(lblNewLabel_1);
		
		user = new JTextField();
		user.setBounds(225, 152, 237, 25);
		panel.add(user);
		user.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBounds(219, 327, 128, 33);
		btnNewButton_1.setBackground(new Color(255, 228, 196));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registertab nw=new registertab();
				nw.Newscreen();
			}
			
				
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton_1.setForeground(Color.GRAY);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[]args= {};
				frontpage nw=new frontpage();
				nw.main(args);
			}
		});
		btnNewButton_2.setBounds(354, 248, 125, 33);
		btnNewButton_2.setBackground(new Color(255, 228, 196));
		btnNewButton_2.setForeground(Color.GRAY);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel.add(btnNewButton_2);
		
		pass = new JPasswordField();
		pass.setBounds(225, 197, 237, 25);
		panel.add(pass);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, 0, 616, 126);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ELCOT\\Pictures\\logo45.png"));
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Signin");
		btnNewButton.setBounds(71, 247, 128, 34);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton.setBackground(new Color(255, 228, 196));
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/incometax","root","");
				    Statement stmt = con.createStatement();
				    System.out.println("yes");
				    String username = String.valueOf(user.getText().trim());
				    String password = String.valueOf(pass.getText());
				    System.out.println("yes");
				    String sql="SELECT * FROM signin  Where Username = (username) and Password = (password)";
				    ResultSet rs= stmt.executeQuery(sql);
				    int flag =0;
				    while(rs.next()) {
				    	if(rs.getString(1).equals(username) && rs.getString(2).equals(password) ) {
				    		flag++;
				    		JOptionPane.showMessageDialog(null,"Login successfull!");
				    		payamount nw= new payamount();
							nw.Newscreen();
				    		break;
				    		
				    		}
				    	else
				    		continue;
				    
				    }
				    if(flag==0)
				    	{
				    	JOptionPane.showMessageDialog(null,"incorrect username or password");
				    	}
				    	}catch(Exception e1) {
				    		System.out.println(e1);
				    	}
				}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Forgot Password?");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				forgotpwd nw= new forgotpwd();
				nw.Newscreen();
			}
		});
	
		btnNewButton_3.setForeground(Color.GRAY);
		btnNewButton_3.setBackground(new Color(255, 228, 196));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_3.setBounds(173, 384, 237, 24);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("Don't have an account?");
		lblNewLabel_3.setForeground(new Color(65, 105, 225));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3.setBounds(173, 292, 264, 24);
		panel.add(lblNewLabel_3);
		frmLogin.setBounds(100, 100, 717, 506);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}