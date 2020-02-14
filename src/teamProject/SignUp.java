package signUp;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.peer.ButtonPeer;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class SignUp extends JFrame implements ActionListener, ItemListener{

	SignUpVO vo = new SignUpVO();
	boolean gender;
	JRadioButton man, woman;
	ButtonGroup group = new ButtonGroup();
	
	
	JPanel LabelPanel = new JPanel(new GridLayout(7, 1));
	JLabel idLabel = new JLabel("아이디");
	JLabel passwordLabel = new JLabel("비밀번호");
	JLabel passwordCheckLabel = new JLabel("비밀번호 확인");
	JLabel nameLabel = new JLabel("이름");
	JLabel genderLabel = new JLabel("성별");
	JLabel nickNameLabel = new JLabel("닉네임");

	
	JPanel TextPanel = new JPanel(new GridLayout(11, 1));
	JTextField idText = new JTextField();
	JTextField passwordText = new JTextField();
	JTextField passwordCheckText = new JTextField();
	JTextField nameText = new JTextField();
	JTextField nickNameText = new JTextField();

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();
	JPanel panel7 = new JPanel();
	
	JPanel genderPanel = new JPanel();

	JPanel ButtonPanel = new JPanel(new FlowLayout());
	JButton insertButton = new JButton("제출");
	JButton resetButton = new JButton("초기화");
	JButton cancelButton3 = new JButton("취소");
	
	public SignUp() {
		setTitle("SingUp");
		setBounds(900, 100, 600, 400);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		LabelPanel.add(idLabel);
		LabelPanel.add(passwordLabel);
		LabelPanel.add(passwordCheckLabel);
		LabelPanel.add(nameLabel);
		LabelPanel.add(genderLabel);
		LabelPanel.add(nickNameLabel);
		idLabel.setHorizontalAlignment(JLabel.CENTER);
		passwordLabel.setHorizontalAlignment(JLabel.CENTER);
		passwordCheckLabel.setHorizontalAlignment(JLabel.CENTER);
		nameLabel.setHorizontalAlignment(JLabel.CENTER);
		nickNameLabel.setHorizontalAlignment(JLabel.CENTER);
		genderLabel.setHorizontalAlignment(JLabel.CENTER);
		add(LabelPanel, BorderLayout.WEST);
		
		
		TextPanel.add(idText);
		TextPanel.add(panel3);
		TextPanel.add(passwordText);
		TextPanel.add(panel4);
		TextPanel.add(passwordCheckText);
		TextPanel.add(panel5);
		TextPanel.add(nameText);
		TextPanel.add(panel6);
		man = new JRadioButton("남자");
		woman = new JRadioButton("여자", true);
		man.addItemListener(this);
		woman.addItemListener(this);
		genderPanel.add(man);
		genderPanel.add(woman);
		group.add(man);
		group.add(woman);
		TextPanel.add(genderPanel, BorderLayout.EAST);
		TextPanel.add(panel7);
		TextPanel.add(nickNameText);
		add(TextPanel, BorderLayout.CENTER);
		
		ButtonPanel.add(insertButton);
		ButtonPanel.add(resetButton);
		ButtonPanel.add(cancelButton3);
		add(ButtonPanel, BorderLayout.SOUTH);
		
		add(panel1, BorderLayout.EAST);
		add(panel2, BorderLayout.NORTH);
		
		insertButton.addActionListener(this);
		resetButton.addActionListener(this);
		cancelButton3.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		SignUp sign = new SignUp();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object object = e.getSource();
		JRadioButton radio = (JRadioButton) object;
		
		if(radio == man) {
			gender = true;
		}else if(radio == woman) {
			gender = false;
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String userID = "", userPW = "", userPWCheck = "", userName = "", nickname = "";
		userID = idText.getText().trim();
		userPW = passwordText.getText().trim();
		userPWCheck = passwordCheckText.getText().trim();
		userName = nameText.getText().trim();
		nickname = nickNameText.getText().trim();
		
		switch (e.getActionCommand()) {
			case "제출":
				vo.setUserID(userID);
				vo.setUserPW(userPW);
				vo.setUserPWCheck(userPWCheck);
				vo.setUserName(userName);
				vo.setGender(gender);
				vo.setNickname(nickname);
				
				SignUpDAO.insert(vo);
				break;
			case "초기화":
				reset();
				break;
			case "취소":
				setVisible(false);
				break;
		}
		
	}

	private void reset() {
		idText.setText("");
		passwordText.setText("");
		passwordCheckText.setText("");
		nameText.setText("");
		nickNameText.setText("");
	}

}

















