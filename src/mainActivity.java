package GUIN;
import java.util.ArrayList;
import java.util.HashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainActivity extends JFrame {
	private JLabel l1, l2, l3;
	private JLabel draw1, draw2, draw3, draw4, draw5, draw6, draw7;
	private JButton legalProfession, Doctor, Police, Traffic, Worker, Teacher, etc;
	
	public mainActivity(String[] consumerArr) {
		JPanel p = new JPanel();
		p.setLayout(null);
		
		l1 = new JLabel("Consumer : ");
		l2 = new JLabel(consumerArr[0]); // consumer list 에서 로그인 한 고객 이름(ID)이 담겨짐
		l3 = new JLabel(consumerArr[2]); // 						  고객 이름(Name)이 담겨짐
		add(l1);
		add(l2);
		add(l3);
		l1.setBounds(10, 5, 100, 10);
		l2.setBounds(30, 5, 100, 10);
		l3.setBounds(50, 5, 100, 10);
		
		draw1 = new JLabel("법조인"); // 직업 아이콘 법조인
		draw2 = new JLabel("의사"); // 직업 아이콘 의사
		draw3 = new JLabel("전문직"); // 직업 아이콘 공무원
		draw4 = new JLabel("교통"); // 직업 아이콘 교통
		draw5 = new JLabel("생산직"); // 직업 아이콘 생산직
		draw6 = new JLabel("강사, 교육"); // 직업 아이콘 강사
		draw7 = new JLabel("기타"); // 직업 아이콘 기타
		add(draw1);
		add(draw2);
		add(draw3);
		add(draw4);
		add(draw5);
		add(draw6);
		add(draw7);
		draw1.setBounds(10, 250, 220, 10);
		draw2.setBounds(240, 250, 220, 10);
		draw3.setBounds(470, 250, 220, 10);
		draw4.setBounds(10, 490, 220, 10);
		draw5.setBounds(240, 490, 220, 10);
		draw6.setBounds(470, 490, 220, 10);
		draw7.setBounds(10, 720, 220, 10);
		
		
		
		legalProfession = new JButton(new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/auction.png"));
		Doctor = new JButton(new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/doctor.png"));
		Police = new JButton(new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/etc.png"));
		Traffic = new JButton(new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/police.png"));
		Worker = new JButton(new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/teaher.png"));
		Teacher = new JButton(new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/traffic.png"));
		etc = new JButton(new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/worker.png"));
		add(legalProfession);
		add(Doctor);
		add(Police);
		add(Traffic);
		add(Worker);
		add(Teacher);
		add(etc);
		legalProfession.setBounds(10, 30, 220, 220);
		Doctor.setBounds(240, 30, 220, 220);
		Police.setBounds(470, 30, 220, 220);
		Traffic.setBounds(10, 260, 220, 220);
		Worker.setBounds(240, 260, 220, 220);
		Teacher.setBounds(470, 260, 220, 220);
		etc.setBounds(10, 490, 220, 220);
		
		
		this.buttonClick(legalProfession);
		this.buttonClick(Doctor);
		this.buttonClick(Police);
		this.buttonClick(Traffic);
		this.buttonClick(Worker);
		this.buttonClick(Teacher);
		this.buttonClick(etc);

		add(p);
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUIN - 구인구직 프로그램");
		setVisible(true);
	}
	
	public void buttonClick(JButton button) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent consumerGetProducer) {
				main2Activity goMain2 = new main2Activity();
			} 
		});
	}
}
