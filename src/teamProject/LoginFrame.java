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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame{
	private JPasswordField passwordField;
	private JButton CancleBtn;
	private JTextField idField;
	private JTextField passwordField_1;
	private JButton btnNewButton;
	private JButton CancleBtn2;

	public static void main(String[] args) {
		
		LoginFrame window = new LoginFrame();
	}


	public LoginFrame() {

		setLocation(600, 300);;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		이미지 삽입
		Panel panel = new Panel(new ImageIcon("C:\\project_CYJ\\teamproject\\workspace\\Frame\\images\\login.png").getImage());
		setSize(new Dimension(panel.getDim()));
		setPreferredSize(new Dimension(panel.getDim()));
		
		getContentPane().add(panel, BorderLayout.SOUTH);
		
//		아이디
		idField = new JTextField();
		idField.setBounds(304, 106, 187, 31);
		idField.setFont(new Font("D2Coding", Font.PLAIN, 15));
		idField.setColumns(10);
		idField.setBorder(null);
		panel.add(idField);
		
//		패스워드
		passwordField = new JPasswordField();
		passwordField.setBounds(304, 157, 187, 31);
		passwordField.setFont(new Font("D2Coding", Font.PLAIN, 15));
		passwordField.setColumns(10);
		passwordField.setBorder(null);
		panel.add(passwordField);
		
//		로그인버튼
		JButton LoginBtn = new JButton("로그인");
		LoginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		LoginBtn.setBounds(245, 208, 90, 39);
		LoginBtn.setFont(new Font("D2Coding", Font.BOLD, 15));
		LoginBtn.setBackground(new Color(15844367));
		LoginBtn.setBorder(null);
		panel.add(LoginBtn);
		
//		취소버튼
		JButton CancleBtn2 = new JButton("취소");
		CancleBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CancleBtn2.setBounds(374, 208, 90, 39);
		CancleBtn2.setFont(new Font("D2Coding", Font.BOLD, 15));
		CancleBtn2.setBackground(new Color(15844367));
		CancleBtn2.setBorder(null);
		panel.add(CancleBtn2);
	
//		크기조정
		setSize(panel.getDim());
		setPreferredSize(panel.getDim()); 
		
		pack();
	
		setVisible(true);
	}
}