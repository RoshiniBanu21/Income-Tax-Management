package IncomeTax;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.SystemColor;

public class frontpage {

	private JFrame frmWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frontpage window = new frontpage();
					window.frmWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frontpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcome = new JFrame();
		frmWelcome.setTitle("Welcome");
		frmWelcome.getContentPane().setBackground(new Color(135, 206, 250));
		frmWelcome.setBounds(100, 100, 716, 461);
		frmWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcome.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME!!!");
		lblNewLabel_1.setBounds(225, 162, 236, 82);
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		frmWelcome.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PAY TAX ANYWHERE,ANYTIME!!!");
		lblNewLabel_2.setBounds(104, 227, 483, 53);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 27));
		frmWelcome.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		panel.setForeground(SystemColor.textHighlightText);
		panel.setBounds(34, 11, 625, 374);
		frmWelcome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Continue>>");
		btnNewButton.setBackground(new Color(255, 228, 196));
		btnNewButton.setBounds(410, 268, 149, 35);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Signin nw=new Signin();
				nw.Newscreen();
			} 
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ELCOT\\Pictures\\logo45.png"));
		lblNewLabel.setBounds(0, 0, 615, 127);
		panel.add(lblNewLabel);
	}
}