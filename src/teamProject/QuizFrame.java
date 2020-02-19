package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class QuizFrame extends JFrame {

	public static void main(String[] args) {
		
		QuizFrame window = new QuizFrame();
		
	}
	int choice = 0;
	public QuizFrame() {
		
//		패널에 이미지 올림
		mainPanel panel = new mainPanel(new ImageIcon("C:\\project_CYJ\\teamproject\\workspace\\Frame\\src\\images\\quiz9.png").getImage());
		getContentPane().add(panel, BorderLayout.NORTH);	
		
//		첫번째 선택지
		JLabel firstLabel = new JLabel("");
		firstLabel.setBounds(144, 244, 328, 64);
		firstLabel.setOpaque(true);
		firstLabel.setBackground(Color.BLACK);
		panel.add(firstLabel);
		
//		두번째 선택지
		JLabel secondlabel = new JLabel("");
		secondlabel.setOpaque(true);
		secondlabel.setBackground(Color.BLACK);
		secondlabel.setBounds(144, 342, 328, 64);
		panel.add(secondlabel);
		
//		세번째 선택지
		JLabel thirdlabel = new JLabel("");
		thirdlabel.setOpaque(true);
		thirdlabel.setBackground(Color.BLACK);
		thirdlabel.setBounds(144, 438, 328, 64);
		panel.add(thirdlabel);
		
//		네번째 선택지
		JLabel fourlabel = new JLabel("");
		fourlabel.setOpaque(true);
		fourlabel.setBackground(Color.BLACK);
		fourlabel.setBounds(144, 535, 328, 64);
		panel.add(fourlabel);
		
//		제출버튼
		JButton inputBtn = new JButton("제출");
		inputBtn.setBounds(563, 548, 117, 71);
		inputBtn.setBackground(new Color(15844367));
		inputBtn.setFont(new Font("D2Coding", Font.BOLD, 25));
		inputBtn.setBorder(null);
		panel.add(inputBtn);
		
//		첫번째 펭수
		JLabel iconLabel = new JLabel("");
		iconLabel.setBounds(46, 222, 71, 110);
		panel.add(iconLabel);
		
//		두번째 펭수
		JLabel siconLabel = new JLabel("");
		siconLabel.setBounds(46, 319, 71, 110);
		panel.add(siconLabel);
		
//		세번째 펭수
		JLabel ticonLabel = new JLabel("");
		ticonLabel.setBounds(46, 417, 71, 110);
		panel.add(ticonLabel);
		
//		네번째 펭수
		JLabel ficonLabel = new JLabel("");
		ficonLabel.setBounds(46, 510, 71, 110);
		panel.add(ficonLabel);
		
//		문제라벨
		JLabel quizLabel = new JLabel("");
		quizLabel.setBounds(36, 45, 495, 134);
		panel.add(quizLabel);
		
//		첫번째 선택지가 클릭되었을때 첫번째 펭수가 나옴, 나머지는 사라짐
		firstLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				iconLabel.setIcon(new ImageIcon("C:\\project_CYJ\\teamproject\\workspace\\Frame\\src\\images\\minipengsu.png"));
				siconLabel.setIcon(new ImageIcon(""));
				ticonLabel.setIcon(new ImageIcon(""));
				ficonLabel.setIcon(new ImageIcon(""));
				choice = 1;
				System.out.println(choice);

			}
			
		});
//		두번째 선택지가 클릭되었을때 두번째 펭수가 나옴, 나머지는 사라짐
		secondlabel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				iconLabel.setIcon(new ImageIcon(""));
				siconLabel.setIcon(new ImageIcon("C:\\project_CYJ\\teamproject\\workspace\\Frame\\src\\images\\minipengsu.png"));
				ticonLabel.setIcon(new ImageIcon(""));
				ficonLabel.setIcon(new ImageIcon(""));
				choice = 2;
				System.out.println(choice);
			}
			
		});
//		세번째 선택지가 클릭되었을때 세번째 펭수가 나옴, 나머지는 사라짐
		thirdlabel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				iconLabel.setIcon(new ImageIcon(""));
				siconLabel.setIcon(new ImageIcon(""));
				ticonLabel.setIcon(new ImageIcon("C:\\project_CYJ\\teamproject\\workspace\\Frame\\src\\images\\minipengsu.png"));
				ficonLabel.setIcon(new ImageIcon(""));
				choice = 3;
				System.out.println(choice);
			}
			
		});
		
//		네번째 선택지가 클릭되었을때 네번째 펭수가 나옴, 나머지는 사라짐
		fourlabel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				iconLabel.setIcon(new ImageIcon(""));
				siconLabel.setIcon(new ImageIcon(""));
				ticonLabel.setIcon(new ImageIcon(""));
				ficonLabel.setIcon(new ImageIcon("C:\\project_CYJ\\teamproject\\workspace\\Frame\\src\\images\\minipengsu.png"));
				choice = 4;
				System.out.println(choice);
			}
			
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocation(550, 100);
		setSize(panel.getDim());
		setPreferredSize(panel.getDim()); 
		pack();
		setVisible(true);
	}

}
