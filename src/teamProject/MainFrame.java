package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends JFrame  {

	public static void main(String[] args) {
		
		MainFrame window = new MainFrame();
		
	}

	public MainFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		이미지
		Panel panel = new Panel(new ImageIcon(".\\src\\images\\main.png").getImage());
		setSize(new Dimension(panel.getDim()));
		setPreferredSize(new Dimension(panel.getDim()));
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		
//		문제풀기
		JButton prbS = new JButton("문제풀기");
		prbS.setForeground(new Color(15248986));
		prbS.setFont(new Font("굴림", Font.BOLD, 15));
		prbS.setBorder(null);
		prbS.setBackground(new Color(9803));
		prbS.setBounds(499, 436, 72, 44);
		panel.add(prbS);
		
//		문제입력
		JButton prbE = new JButton("문제입력");
		prbE.setForeground(new Color(15248986));
		prbE.setFont(new Font("굴림", Font.BOLD, 15));
		prbE.setBorder(null);
		prbE.setBackground(new Color(9803));
		prbE.setBounds(583, 436, 72, 44);
		panel.add(prbE);
		
//		문제수정
		JButton prbC = new JButton("문제수정");
		prbC.setForeground(new Color(15248986));
		prbC.setFont(new Font("굴림", Font.BOLD, 15));
		prbC.setBorder(null);
		prbC.setBackground(new Color(9803));
		prbC.setBounds(667, 436, 72, 44);
		panel.add(prbC);
		
//		문제삭제
		JButton button = new JButton("문제삭제");
		button.setForeground(new Color(232, 174, 90));
		button.setFont(new Font("굴림", Font.BOLD, 15));
		button.setBorder(null);
		button.setBackground(new Color(0, 38, 75));
		button.setBounds(752, 436, 72, 44);
		panel.add(button);
		
//		채팅창 버튼
		JButton chatBtn = new JButton("채팅창");
		chatBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		chatBtn.setBorder(null);
		chatBtn.setBounds(457, 537, 146, 88);
		chatBtn.setBackground(new Color(15248986));
		chatBtn.setForeground(new Color(9803));
		chatBtn.setFont(new Font("굴림", Font.BOLD, 30));
		
		panel.add(chatBtn);
		
//		로그인
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginBtn.setBorder(null);
		loginBtn.setBounds(458, 540, 146, 88);
		loginBtn.setBackground(new Color(15248986));
		loginBtn.setForeground(new Color(9803));
		loginBtn.setBounds(627, 537, 146, 88);
		loginBtn.setFont(new Font("굴림", Font.BOLD, 30));
		panel.add(loginBtn);
		
//		회원가입
		JButton signUpBtn = new JButton("회원가입");
		signUpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		signUpBtn.setBorder(null);
		signUpBtn.setBounds(795, 537, 146, 88);
		signUpBtn.setBackground(new Color(15248986));
		signUpBtn.setForeground(new Color(9803));
		signUpBtn.setFont(new Font("굴림", Font.BOLD, 30));
		panel.add(signUpBtn);
		
//		크기조정
		setSize(panel.getDim());
		setPreferredSize(panel.getDim()); 
		
		pack();
		setVisible(true);
	}
}
