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

public class SignUpFrame extends JFrame{

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
		
		SignUpFrame window = new SignUpFrame();
		
	}

	public SignUpFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		이미지
		Panel panel = new Panel(new ImageIcon(".\\src\\images\\signup.png").getImage());
		getContentPane().add(panel, BorderLayout.SOUTH);
		
//		아이디 필드
		idField = new JTextField();
		idField.setBounds(474, 162, 237, 28);
		idField.setFont(new Font("D2Coding", Font.PLAIN, 15));
		idField.setBorder(null);
		panel.add(idField);
		idField.setColumns(10);
		
//		비밀번호 필드
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setFont(new Font("D2Coding", Font.PLAIN, 15));
		passwordField.setBorder(null);
		passwordField.setBounds(474, 223, 237, 28);
		panel.add(passwordField);
		
//		비밀번호 확인 필드
		passwordCheckField = new JPasswordField();
		passwordCheckField.setColumns(10);
		passwordCheckField.setFont(new Font("D2Coding", Font.PLAIN, 15));
		passwordCheckField.setBorder(null);
		passwordCheckField.setBounds(474, 280, 237, 28);
		panel.add(passwordCheckField);
		
//		이름 필드
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setFont(new Font("D2Coding", Font.PLAIN, 15));
		nameField.setBorder(null);
		nameField.setBounds(474, 339, 237, 28);
		panel.add(nameField);
		
//		닉네임 필드
		nickNameField = new JTextField();
		nickNameField.setColumns(10);
		nickNameField.setFont(new Font("D2Coding", Font.PLAIN, 15));
		nickNameField.setBorder(null);
		nickNameField.setBounds(474, 400, 237, 28);
		panel.add(nickNameField);
		
//		라디오 버튼
		JRadioButton manBtn = new JRadioButton("");
		manBtn.setBounds(505, 453, 20, 23);
		manBtn.setBackground(new Color(9803));
		panel.add(manBtn);
		
		radioButton = new JRadioButton("");
		radioButton.setBackground(new Color(0, 38, 75));
		radioButton.setBounds(605, 453, 20, 23);
		panel.add(radioButton);
		
//		가입 완료
		CompleteBtn = new JButton("가입완료");
		CompleteBtn.setBounds(451, 516, 109, 50);
		CompleteBtn.setFont(new Font("D2Coding", Font.BOLD, 15));
		CompleteBtn.setBackground(new Color(15844367));
		panel.add(CompleteBtn);
		
//		취소버튼
		button = new JButton("취소");
		button.setFont(new Font("D2Coding", Font.BOLD, 15));
		button.setBackground(new Color(241, 196, 15));
		button.setBounds(584, 516, 93, 50);
		panel.add(button);
		
		setSize(panel.getDim());
		setPreferredSize(panel.getDim());
		
		pack();
		setVisible(true);
	}
}

