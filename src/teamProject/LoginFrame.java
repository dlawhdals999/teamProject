package teamProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener{
	
	JPanel labelPanel = new JPanel(new GridLayout(4,1));
	JPanel textFieldPanel = new JPanel(new GridLayout(4,1));
	JPanel buttonPanel = new JPanel();
	JPanel restPanel1 = new JPanel();
	JPanel restPanel2 = new JPanel();
	JPanel restPanel3 = new JPanel();
	JPanel restPanel4 = new JPanel();
	JPanel restPanel5 = new JPanel();
	JPanel restPanel6 = new JPanel();
	
	JLabel IDLabel = new JLabel("ID");
	JLabel PWLabel = new JLabel("PW");
	
	JTextField IDField = new JTextField(20);
	JPasswordField PWField = new JPasswordField(10);
	
	JButton loginButton = new JButton("로그인");
	JButton cancelButton = new JButton("취소");
	
	
	public LoginFrame() {

		setTitle("로그인");
		setBounds(300, 300, 300, 200);
		
//		공백판넬
		add(restPanel1, BorderLayout.NORTH);
		add(restPanel2, BorderLayout.EAST);
		restPanel1.setPreferredSize(new Dimension(300,30));
		restPanel2.setPreferredSize(new Dimension(30,200));
		
		
//		라벨
		IDLabel.setHorizontalAlignment(JLabel.CENTER);
		PWLabel.setHorizontalAlignment(JLabel.CENTER);
		
		labelPanel.add(IDLabel);
		labelPanel.add(restPanel3);
		labelPanel.add(PWLabel);
		labelPanel.add(restPanel5);
		
		
		labelPanel.setPreferredSize(new Dimension(70,200));
		add(labelPanel, BorderLayout.WEST);
		
		
//		텍스트 필드
		textFieldPanel.add(IDField);
		textFieldPanel.add(restPanel4);
		textFieldPanel.add(PWField);
		textFieldPanel.add(restPanel6);
		add(textFieldPanel, BorderLayout.CENTER);
		
//		버튼
		buttonPanel.add(loginButton);
		buttonPanel.add(cancelButton);
		add(buttonPanel, BorderLayout.SOUTH);
		buttonPanel.setPreferredSize(new Dimension(300,40));
		
//		버튼 액션리스너
		loginButton.addActionListener(this);
		cancelButton.addActionListener(this);
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String userID = null;
		String userPW= null;
		
		switch (e.getActionCommand()) {
		case "로그인":
			IDField.requestFocus();
			userID = IDField.getText().trim();
			userPW = PWField.getText().trim();
			
			if(userID.equals("")) {
				JOptionPane.showMessageDialog(loginButton, "아이디를 입력해주세요");
			}else if(userPW.equals("")){
				JOptionPane.showMessageDialog(loginButton, "비밀번호를 입력해주세요");
			}else{
				MemberInfoVO vo = LoginDAO.login(userID,userPW);
				if(vo == null) {
					IDField.setText("");
					PWField.setText("");
					IDField.requestFocus();
				}else {
					
					this.setVisible(false);
					BoardMain.inputButton.setEnabled(true);
					BoardMain.updateButton.setEnabled(true);
					BoardMain.deleteButton.setEnabled(true);
					BoardMain.loginButton.setText("로그아웃");
				}
				
			}
			
			
			break;

		case "취소":
			this.setVisible(false);
			break;
			
		}
		
	}
	

}
