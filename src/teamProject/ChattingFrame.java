package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ChattingFrame extends JFrame{
	private JTextField textField;

	public static void main(String[] args) {
		
		ChattingFrame window = new ChattingFrame();
		
	}

	public ChattingFrame() {
		Panel panel = new Panel(new ImageIcon("C:\\project_CYJ\\teamproject\\workspace\\Frame\\src\\images\\chatting.png").getImage());
		getContentPane().add(panel, BorderLayout.NORTH);	
		
		JButton sendBtn = new JButton("전송");
		sendBtn.setBounds(440, 715, 63, 41);
		sendBtn.setFont(new Font("D2Coding", Font.BOLD, 20));
		sendBtn.setBackground(new Color(15248986));
		sendBtn.setForeground(new Color(9803));
		sendBtn.setBorder(null);
		panel.add(sendBtn);
		
		textField = new JTextField();
		textField.setBounds(3, 715, 438, 41);
		textField.setBorder(null);
		textField.setFont(new Font("D2Coding", Font.PLAIN, 20));
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 503, 709);
		panel.add(lblNewLabel);
		setLocation(550, 100);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(panel.getDim());
		setPreferredSize(panel.getDim()); 
		pack();
		setVisible(true);
		
	}
}
