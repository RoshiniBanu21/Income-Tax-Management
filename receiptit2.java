package IncomeTax;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class receiptit2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l;
    
    // add this line to set it global. 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				 receiptit2 frame = new receiptit2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void my_update(String str) {
		l1.setText(str);
		
	}
	public void my_update1(String str1) {
		l2.setText(str1);
		
	}
	public void my_update2(String str2) {
		l3.setText(str2);
		
	}
	public void my_update3(String str3) {
		l4.setText(str3);
		
	}
	public void my_update4(String str4) {
		l5.setText(str4);
		
	}
	
	public receiptit2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 463);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		l = new JLabel("             RECEIPT           "); 
		l.setBounds(140, 0, 249, 40);
		l.setForeground(Color.BLACK);
		l.setBackground(new Color(240, 240, 240));
		l.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(l);
		l1 = new JLabel("UserName"); 
		l1.setBounds(250, 106, 86, 40);
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(l1);
		l2= new JLabel("EmailId");
		l2.setBounds(250, 144, 291, 45);
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(l2);
		l3= new JLabel("PANNo");
		l3.setBounds(250, 187, 89, 57);
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(l3);
		l4= new JLabel("AccountNo");
		l4.setBounds(250, 232, 95, 57);
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(l4);
		l5= new JLabel("Amount");
		l5.setBounds(255, 276, 260, 78);
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(l5);
		
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.setBounds(194, 353, 125, 40);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[]args= {};
				frontpage nw = new frontpage();
			    nw.main(args);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(170, 51, 27, -4);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PAYMENT SUCCESSFULL...!!!");
		lblNewLabel_1.setBounds(99, 53, 324, 26);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblNewLabel_1);
		
		JLabel l1_1 = new JLabel("UserName");
		l1_1.setBounds(84, 106, 86, 40);
		l1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(l1_1);
		
		JLabel l2_1 = new JLabel("EmailId");
		l2_1.setBounds(84, 144, 101, 45);
		l2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(l2_1);
		
		JLabel l3_1 = new JLabel("PANNo");
		l3_1.setBounds(85, 187, 89, 57);
		l3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(l3_1);
		
		JLabel l4_1 = new JLabel("AccountNo");
		l4_1.setBounds(85, 232, 95, 57);
		l4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(l4_1);
		
		JLabel l5_1 = new JLabel("Amount");
		l5_1.setBounds(88, 276, 260, 78);
		l5_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(l5_1);
		
	}
}
