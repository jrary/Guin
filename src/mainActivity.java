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
		l1.setBounds(10, 10, 100, 10);
		l2.setBounds(110, 10, 100, 10);
		l3.setBounds(210, 10, 100, 10);
		
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
		draw1.setBounds(10, 190, 150, 10);
		draw2.setBounds(240, 190, 150, 10);
		draw3.setBounds(470, 190, 150, 10);
		draw4.setBounds(10, 420, 150, 10);
		draw5.setBounds(240, 420, 150, 10);
		draw6.setBounds(470, 420, 150, 10);
		draw7.setBounds(10, 650, 150, 10);
		
		
		ImageIcon imgLegal = new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/auction.png");
		ImageIcon imgDoctor = new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/doctor.png");
		ImageIcon imgPolice = new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/police.png");
		ImageIcon imgTraffic = new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/traffic.png");
		ImageIcon imgWorker = new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/worker.png");
		ImageIcon imgTeacher = new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/teahcer.png");
		ImageIcon imgEtc = new ImageIcon("C:/Users/Gihyun/eclipse-workspace/GUIN_termproject/etc.png");
		imgLegal = imageSetSize(imgLegal,150,150);
		imgDoctor = imageSetSize(imgDoctor,150,150);
		imgPolice = imageSetSize(imgPolice,150,150);
		imgTraffic = imageSetSize(imgTraffic,150,150);
		imgWorker = imageSetSize(imgWorker,150,150);
		imgTeacher = imageSetSize(imgTeacher,150,150);
		imgEtc = imageSetSize(imgEtc,150,150);

		legalProfession = new JButton(imgLegal);
		Doctor = new JButton(imgDoctor);
		Police = new JButton(imgPolice);
		Traffic = new JButton(imgTraffic);
		Worker = new JButton(imgWorker);
		Teacher = new JButton(imgTeacher);
		etc = new JButton(imgEtc);
		
		add(legalProfession);
		add(Doctor);
		add(Police);
		add(Traffic);
		add(Worker);
		add(Teacher);
		add(etc);
		legalProfession.setBounds(10, 30, 150, 150);
		Doctor.setBounds(240, 30, 150, 150);
		Police.setBounds(470, 30, 150, 150);
		Traffic.setBounds(10, 260, 150, 150);
		Worker.setBounds(240, 260, 150, 150);
		Teacher.setBounds(470, 260, 150, 150);
		etc.setBounds(10, 490, 150, 150);
		
		
		this.buttonClick(legalProfession);
		this.buttonClick(Doctor);
		this.buttonClick(Police);
		this.buttonClick(Traffic);
		this.buttonClick(Worker);
		this.buttonClick(Teacher);
		this.buttonClick(etc);

		add(p);
		setSize(800, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUIN - 구인구직 프로그램");
		setVisible(true);
	}
	
	public ImageIcon imageSetSize(ImageIcon icon, int i, int j) {
		Image ximg = icon.getImage();
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
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
