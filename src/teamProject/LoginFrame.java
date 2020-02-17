package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginFrame {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton CancleBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		LoginFrame window = new LoginFrame();
		
				
	}

	/**
	 * Create the application.
	 */
	public LoginFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LoginPanel login = new LoginPanel(new ImageIcon("C:\\project_CYJ\\teamproject\\workspace\\Frame\\src\\images\\login.png").getImage());
		frame.setSize(new Dimension(922, 530));
		frame.setPreferredSize(new Dimension(login.getDim()));
		
		frame.getContentPane().add(login, BorderLayout.SOUTH);
		
		textField = new JTextField();
		textField.setBounds(575, 171, 246, 44);
		textField.setBorder(null);
		login.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(575, 247, 246, 49);
		passwordField.setBorder(null);
		login.add(passwordField);
		
		JButton LoginBtn = new JButton("로그인");
		LoginBtn.setBounds(451, 329, 149, 72);
		LoginBtn.setFont(new Font("D2Coding", Font.BOLD, 30));
		LoginBtn.setBackground(new Color(15844367));
		login.add(LoginBtn);
		
		CancleBtn = new JButton("취소");
		CancleBtn.setFont(new Font("D2Coding", Font.BOLD, 30));
		CancleBtn.setBackground(new Color(241, 196, 15));
		CancleBtn.setBounds(656, 329, 149, 72);
		login.add(CancleBtn);
	
		frame.setSize(LoginPanel.getDim());
		frame.setPreferredSize(LoginPanel.getDim()); 
		
		frame.pack();
	
		frame.setVisible(true);
	}
}