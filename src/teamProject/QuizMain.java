package teamProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class QuizMain extends JFrame implements ActionListener{

//윈도우 화면을 띄울 객체 선언
	JPanel panelTitle;						// 가장 상단에 로고, 또는 디자인적 텍스트가 들어갈 라벨을 올릴 패널
	JPanel panelQuiz;						// 문제가 들어간 라벨을 올릴 패널
	JPanel panelanswer;						// 4개의 보기 버튼과 문제의 보기들이 올라갈 패널
	JPanel btn;
	JPanel field;
	JPanel test;
	
	JLabel titleLabel;						// 상단의 텍스트가 들어갈 라벨
	JLabel quizeLabel;						// 문제가 올라갈 라벨
	
	JLabel field1,field2,field3,field4;		// 문제의 보기 
	JButton btn1,btn2,btn3,btn4;			// 보기 버튼 , 클릭 시 정답 또는 오답 페이지 이동
	JButton okBtn;							// 제출버튼
	
	static int count;
	QuizVO vo;
	
	public QuizMain() {
		setTitle("정보처리기사 문제풀기");
		setBounds(300,100,500,550);
		
		//상단에 라벨 추가
		panelTitle = new JPanel();
		titleLabel = new JLabel("정보처리기사");
		titleLabel.setPreferredSize(new Dimension(300,100));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("Dialog",Font.BOLD,25));
		panelTitle.add(titleLabel);
		add(panelTitle, BorderLayout.NORTH);

		//중단에 문제가 표시되는 라벨을 추가한다.
		panelQuiz = new JPanel();
		quizeLabel = new JLabel("문제 : ");
		quizeLabel.setPreferredSize(new Dimension(400,150));;
		quizeLabel.setHorizontalAlignment(JLabel.CENTER);
		quizeLabel.setFont(new Font("Dialog",Font.BOLD,18));
		quizeLabel.setOpaque(true);
		quizeLabel.setBackground(new Color(0xffb5b5));
		panelQuiz.add(quizeLabel);
		add(panelQuiz);
	
		//하단에 버튼과 텍스트 필드 추가
		panelanswer = new JPanel();
		btn1 = new JButton("1");
		btn1.setBackground(Color.cyan);
		btn1.setPreferredSize(new Dimension(25,25));
		field1 = new JLabel();
		field1.setPreferredSize(new Dimension(200,20));
		
		btn2 = new JButton("2");
		btn2.setBackground(Color.cyan);
		field2 = new JLabel();
		
		field2.setPreferredSize(new Dimension(200,20));
		btn3 = new JButton("3");
		btn3.setBackground(Color.cyan);
		field3 = new JLabel();
	
		field3.setPreferredSize(new Dimension(200,20));
		btn4 = new JButton("4");
		btn4.setBackground(Color.cyan);
		field4 = new JLabel();
		
		field4.setPreferredSize(new Dimension(200,20));
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		btn = new JPanel(new GridLayout(4,1,1,20));
		btn.add(btn1);
		btn.add(btn2);
		btn.add(btn3);
		btn.add(btn4);
		
		field = new JPanel(new GridLayout(4,1,1,20));
		field.add(field1);
		field.add(field2);
		field.add(field3);
		field.add(field4);
		
		//제출버튼
		okBtn = new JButton("제출");
		okBtn.setPreferredSize(new Dimension(70,30));
		okBtn.setBackground(new Color(0xffb5b5));
		
		//제출 버튼을 위한 패널(test 패널)
		test = new JPanel();
		test.add(okBtn);	
		
		panelanswer.setLayout(new BorderLayout());
		panelanswer.add(btn, BorderLayout.WEST);
		panelanswer.add(field, BorderLayout.CENTER);
		panelanswer.add(test, BorderLayout.SOUTH);
		add(panelanswer, BorderLayout.SOUTH);
		

	}	
	                                                                                                    

	static void mixQuiz(QuizMain window) {
		//문제의 idx를 얻어와서 리스트에 저장하는 메소드로 리스트에 idx를 저장한다.
		ArrayList<Integer> list = QuizDAO.readIdx();
		
		//idx의 순서를 섞어준다.
		for(int i=0; i<1000; i++) {
			int ran = new Random().nextInt(list.size()-1)+1;
			int temp = list.get(0);
			list.set(0,list.get(ran));
			list.set(ran,temp);
		}
		
		
		//문제를 읽어오는 메소드를 랜덤한 idx를 던져줘서 quizeLabel에 SetText한다.
		window.vo = QuizDAO.readQuiz(list.get(count));
		
		ArrayList<String> list2 = new ArrayList<String>();
		int arr[]= {0,1,2,3};
		list2.add(window.vo.getAnswer());
		list2.add(window.vo.getwrong1());
		list2.add(window.vo.getwrong2());
		list2.add(window.vo.getwrong3());
		
		for(int i=0; i<1000; i++) {
			int ran = new Random().nextInt(4);
			int temp = arr[0];
			arr[0] = arr[ran];
			arr[ran] = temp;
		}
		for(int i=0; i<4; i++) {
			System.out.println(arr[i]);
		}
	
		window.field1.setText(list2.get(arr[0]));
		window.field2.setText(list2.get(arr[1]));
		window.field3.setText(list2.get(arr[2]));
		window.field4.setText(list2.get(arr[3]));
		
		window.quizeLabel.setText(window.vo.getQuiz());
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		case "1":
			if(vo.getAnswer().equals(field1.getText())) {
				answerMSG();
			}else {
				noAnswerMSG();
			}
			break;
		case "2":
			if(vo.getAnswer().equals(field2.getText())) {
				answerMSG();
			}else {
				noAnswerMSG();
			}
			break;
		case "3":
			if(vo.getAnswer().equals(field3.getText())) {
				answerMSG();
			}else {
				noAnswerMSG();
			}
			break;
		case "4":
			if(vo.getAnswer().equals(field4.getText())) {
				answerMSG();
			}else {
				noAnswerMSG();
			}
			break;
		case "제출":
			
			break;
		
		}
	}


	private void noAnswerMSG() {
		String[]  btnString = {"채점하기","다음문제"};
		int result = JOptionPane.showOptionDialog(null, "오답입니다 ㅠㅠ", "오답", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
				null, btnString, btnString[0]);
		System.out.println(result);
	}


	private void answerMSG() {
		String[]  btnString = {"채점하기","다음문제"};
		int result = JOptionPane.showOptionDialog(null, "정답입니다!!!", "정답", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
				null, btnString, btnString[0]);
		System.out.println(result);
	}


}
