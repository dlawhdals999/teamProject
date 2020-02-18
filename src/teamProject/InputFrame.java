package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputFrame extends JFrame{

	private JTextField answer;
	private JTextField WrongA;
	private JTextField WrongA2;
	private JTextField WrongA3;
	private JTextField password;
	private JTextField passwordC;
	private JScrollPane inputscroll;
	private JTextArea input;


	public static void main(String[] args) {
		
		InputFrame window = new InputFrame();
			
	}

	public InputFrame() {
		
		setLocation(400, 100);
//		이미지
		mainPanel inputpanel = new mainPanel(new ImageIcon("C:\\project_CYJ\\teamproject\\workspace\\Frame\\src\\images\\inputquiz1.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(inputpanel, BorderLayout.NORTH);		
		
//		스크롤
		inputscroll = new JScrollPane();
		inputscroll.setBounds(338, 89, 404, 152);
		inputscroll.setBorder(null);
		inputpanel.add(inputscroll);
		
//		문제입력
		input = new JTextArea("문제를입력하세요");
		inputscroll.setViewportView(input);
		input.setFont(new Font("D2Coding", Font.PLAIN, 17));
		input.setBorder(null);
		
		
//		정답
		answer = new JTextField();
		answer.setText("정답을입력하세요");
		answer.setBounds(338, 290, 404, 39);
		answer.setFont(new Font("D2Coding", Font.PLAIN, 15));
		answer.setBorder(null);
		inputpanel.add(answer);
		answer.setColumns(10);
		
//		오답1
		WrongA = new JTextField();
		WrongA.setText("오답을입력하세요");
		WrongA.setBounds(338, 377, 404, 39);
		WrongA.setFont(new Font("D2Coding", Font.PLAIN, 15));
		WrongA.setBorder(null);
		inputpanel.add(WrongA);
		WrongA.setColumns(10);
		
//		오답2
		WrongA2 = new JTextField();
		WrongA2.setText("오답을입력하세요");
		WrongA2.setBounds(338, 426, 404, 39);
		WrongA2.setFont(new Font("D2Coding", Font.PLAIN, 15));
		WrongA2.setBorder(null);
		inputpanel.add(WrongA2);
		WrongA2.setColumns(10);
		
//		오답3
		WrongA3 = new JTextField();
		WrongA3.setText("오답을입력하세요");
		WrongA3.setBounds(338, 483, 404, 39);
		WrongA3.setFont(new Font("D2Coding", Font.PLAIN, 15));
		WrongA3.setBorder(null);
		inputpanel.add(WrongA3);
		WrongA3.setColumns(10);
		
//		비밀번호
		password = new JPasswordField();
		password.setBounds(338, 571, 168, 39);
		password.setBorder(null);
		inputpanel.add(password);
		password.setColumns(10);
		
//		비밀번호 확인
		passwordC = new JPasswordField();
		passwordC.setColumns(10);
		passwordC.setBounds(574, 571, 168, 39);
		passwordC.setBorder(null);
		inputpanel.add(passwordC);
		
//		저장 버튼
		JButton SaveBtn = new JButton("저장하기");
		SaveBtn.setBounds(383, 658, 123, 44);
		SaveBtn.setBackground(new Color(9605538));
		SaveBtn.setForeground(new Color(16777215));
		SaveBtn.setFont(new Font("D2Coding", Font.BOLD, 20));
		SaveBtn.setBorder(null);
		inputpanel.add(SaveBtn);
		
//		취소 버튼
		JButton CancleBtn = new JButton("취소");
		CancleBtn.setBounds(574, 658, 123, 44);
		CancleBtn.setBackground(new Color(9605538));
		CancleBtn.setForeground(new Color(16777215));
		CancleBtn.setFont(new Font("D2Coding", Font.BOLD, 20));
		CancleBtn.setBorder(null);
		inputpanel.add(CancleBtn);
		


//		크기조정
		setSize(inputpanel.getDim());
		setPreferredSize(inputpanel.getDim()); 
		pack();
		setVisible(true);
	}
	
}
