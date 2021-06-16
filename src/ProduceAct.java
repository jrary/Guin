package GUIN;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ProduceAct extends JFrame implements ActionListener{
	
	public ProduceAct(String job, String name, String number, String email, String region) {
		
		JPanel pa = new JPanel();
		pa.setLayout(null);
		
		Label a1 = new Label("job : "+job);
		Label a2 = new Label("name : "+name);
		Label a3 = new Label("e-mail : "+email);
		Label a4 = new Label("phone number : "+number);
		Label a5 = new Label("address : "+region);
		add(a1);
		add(a2);
		add(a3);
		add(a4);
		add(a5);
		
		a1.setBounds(40, 5, 300, 40);
		a2.setBounds(40, 45, 300, 40);
		a3.setBounds(40, 85, 300, 40);
		a4.setBounds(40, 125, 300, 40);
		a5.setBounds(40, 165, 300, 40);
		
		Label a6 = new Label("나의 선택 >>> ");
		add(a6);
		a6.setBounds(40, 280, 150, 40);
		
		JButton readyButton = new JButton ("수락");	// 일 할 수 있는 상태
		JButton runningButton = new JButton ("거절"); // 일 X
		// JButton waitingButton = new JButton ("Waiting!");	// 일 X
		
		readyButton.addActionListener(this);
		runningButton.addActionListener(this);
		// waitingButton.addActionListener(this);
		
		add(readyButton);
		add(runningButton);
		// add(waitingButton);
		
		readyButton.setBounds(200, 280, 100, 40);
		runningButton.setBounds(310, 280, 100, 40);
		// waitingButton.setBounds(420, 280, 100, 40);
		
		
		add(pa);
		setSize(700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUIN - Producer");
		setVisible(true);
		
	}
		
	public void actionPerformed (ActionEvent e) {
		if(e.getActionCommand().equals("수락")) {
			JOptionPane.showMessageDialog(null, "요청이 수락되었습니다!");
		}
		else if(e.getActionCommand().equals("거절")) {
			JOptionPane.showMessageDialog(null, "요청이 거절되었습니다!");
		}
	}
	
	public static void main(String[] args) {
		/*
		 * String job = "11"; String name= "11"; String number= "11"; String email=
		 * "11"; String region= "11";
		 * 
		 * ProduceAct guiWithPanel = new ProduceAct (job,name,number,email,region);
		 * guiWithPanel.setVisible (true);
		 */
	}



	

}
