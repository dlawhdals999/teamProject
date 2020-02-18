package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class SignUpFrame {

	private JFrame frame;
	private JTextField idField;
	private JTextField passwordField;
	private JTextField passwordCheckField;
	private JTextField nameField;
	private JTextField nickNameField;
	private JRadioButton radioButton;
	private JButton CompleteBtn;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpFrame window = new SignUpFrame();
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
	public SignUpFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel panel = new Panel(new ImageIcon(".\\src\\images\\signup.png").getImage());
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		idField = new JTextField();
		idField.setBounds(474, 162, 237, 28);
		idField.setFont(new Font("D2Coding", Font.PLAIN, 15));
		idField.setBorder(null);
		panel.add(idField);
		idField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setFont(new Font("D2Coding", Font.PLAIN, 15));
		passwordField.setBorder(null);
		passwordField.setBounds(474, 223, 237, 28);
		panel.add(passwordField);
		
		passwordCheckField = new JPasswordField();
		passwordCheckField.setColumns(10);
		passwordCheckField.setFont(new Font("D2Coding", Font.PLAIN, 15));
		passwordCheckField.setBorder(null);
		passwordCheckField.setBounds(474, 280, 237, 28);
		panel.add(passwordCheckField);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setFont(new Font("D2Coding", Font.PLAIN, 15));
		nameField.setBorder(null);
		nameField.setBounds(474, 339, 237, 28);
		panel.add(nameField);
		
		nickNameField = new JTextField();
		nickNameField.setColumns(10);
		nickNameField.setFont(new Font("D2Coding", Font.PLAIN, 15));
		nickNameField.setBorder(null);
		nickNameField.setBounds(474, 400, 237, 28);
		panel.add(nickNameField);
		
		JRadioButton manBtn = new JRadioButton("");
		manBtn.setBounds(505, 453, 20, 23);
		manBtn.setBackground(new Color(9803));
		panel.add(manBtn);
		
		radioButton = new JRadioButton("");
		radioButton.setBackground(new Color(0, 38, 75));
		radioButton.setBounds(605, 453, 20, 23);
		panel.add(radioButton);
		
		CompleteBtn = new JButton("가입완료");
		CompleteBtn.setBounds(451, 516, 109, 50);
		CompleteBtn.setFont(new Font("D2Coding", Font.BOLD, 15));
		CompleteBtn.setBackground(new Color(15844367));
		panel.add(CompleteBtn);
		
		button = new JButton("취소");
		button.setFont(new Font("D2Coding", Font.BOLD, 15));
		button.setBackground(new Color(241, 196, 15));
		button.setBounds(584, 516, 93, 50);
		panel.add(button);
		
		frame.setSize(panel.getDim());
		frame.setPreferredSize(panel.getDim()); 
		
		
		frame.pack();
	}
}
