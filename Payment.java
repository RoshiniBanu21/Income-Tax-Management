package IncomeTax;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Payment {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void Newscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment window = new Payment();
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
	public Payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setForeground(Color.GRAY);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.setBounds(100, 100, 640, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 23, 592, 344);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Debit Card");
		rdbtnNewRadioButton_1.setBounds(61, 237, 161, 23);
		rdbtnNewRadioButton_1.setForeground(Color.GRAY);
		panel.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		textField = new JTextField();
		textField.setBounds(305, 243, 159, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Net Banking");
		rdbtnNewRadioButton.setBounds(61, 193, 166, 31);
		rdbtnNewRadioButton.setForeground(Color.GRAY);
		panel.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		textField_1 = new JTextField();
		textField_1.setBounds(303, 190, 161, 23);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Mode of Payment");
		lblNewLabel.setBounds(10, 138, 223, 37);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(-12, 0, 601, 128);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ELCOT\\Pictures\\logo45.png"));
		panel.add(lblNewLabel_1);
	}
}
