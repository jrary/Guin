package GUIN;
/*
수정할 부분 : 전체적인 UI (text 크기 맞추기)
*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.*;
import java.awt.*;

// 회원가입 화면
public class register extends JFrame {
	public register() {
		JPanel p = new JPanel();
		
		Label l1 = new Label("ID");
		Label l2 = new Label("Password");
		Label l3 = new Label("이름");
		Label l4 = new Label("e-mail");
		Label l5 = new Label("phone number");
		Label l6 = new Label("address");
		Label l7 = new Label("job");
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		
		TextField t1 = new TextField(); // ID
		TextField t2 = new TextField(); // pw
		TextField t3 = new TextField(); // 이름
		TextField t4 = new TextField(); // email
		TextField t5 = new TextField(); // phone
		TextField t6 = new TextField(); // address
		TextField t7 = new TextField(); // job
		add(t1);
		add(t2);
		add(t3);
		t2.setEchoChar('*'); // pw 암호화
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		
		JButton j1 = new JButton("consumer 가입하기");
		JButton j2 = new JButton("producer 가입하기");
		add(j1);
		add(j2);
		
		l1.setBounds(40, 10, 70, 40);
		l2.setBounds(40, 50, 70, 40);
		l3.setBounds(40, 90, 70, 40);
		l4.setBounds(40, 130, 70, 40);
		l5.setBounds(40, 170, 70, 40);
		l6.setBounds(40, 210, 70, 40);
		l7.setBounds(40, 250, 70, 40);
		t1.setBounds(120, 10, 300, 40);
		t2.setBounds(120, 50, 300, 40);
		t3.setBounds(120, 90, 300, 40);
		t4.setBounds(120, 130, 300, 40);
		t5.setBounds(120, 170, 300, 40);
		t6.setBounds(120, 210, 300, 40);
		t7.setBounds(120, 250, 300, 40);
		j1.setBounds(120, 300, 140, 30);
		j2.setBounds(270, 300, 140, 30);
		
		add(p);
		setSize(500,500);
		setTitle("GUIN - 회원가입");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// consumer register
		j1.addActionListener(new ActionListener( ) {
			@Override
			public void actionPerformed(ActionEvent consumerRegister) {
				try {
					PrintWriter outputStream1 = null;
					ArrayList<Consumer> consumer_list= Consumer.consumer_list;
					
					outputStream1 = new PrintWriter(new FileWriter("Consumer.dat", true));
					
					outputStream1.write(t1.getText()+"/"); // id
					outputStream1.write(t2.getText()+"/"); // pw
					outputStream1.write(t3.getText()+"/"); // name
					outputStream1.write(t4.getText()+"/"); // email
					outputStream1.write(t5.getText()+"/"); // phone
					outputStream1.write(t6.getText()+"/"); // address
					outputStream1.write(t7.getText()+"\r\n"); // job
					outputStream1.close();
					
					JOptionPane.showMessageDialog(null, "consumer 회원가입을 축하합니다 ! ");
					dispose();
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "consumer 회원가입에 실패하였습니다!");
				}
			}
		});
		
		// producer register
		j2.addActionListener(new ActionListener( ) {
			@Override
			public void actionPerformed(ActionEvent consumerRegister) {
				try {
					PrintWriter outputStream2 = null;
			        HashMap<String, ArrayList<Producer>> producer_map = Producer.producer_map;
			        
					outputStream2 = new PrintWriter(new FileWriter("Consumer.dat", true));
						
					outputStream2.write(t1.getText()+"/"); // name
					outputStream2.write(t2.getText()+"/"); // id
					outputStream2.write(t3.getText()+"/"); // pw
					outputStream2.write(t4.getText()+"/"); // email
					outputStream2.write(t5.getText()+"/"); // phone
					outputStream2.write(t6.getText()+"/"); // address
					outputStream2.write(t7.getText()+"\r\n"); // job
					outputStream2.close();
							
					JOptionPane.showMessageDialog(null, "producer 회원가입을 축하합니다 ! ");
					dispose();
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "producer 회원가입에 실패하였습니다!");
				}
			}
		});
		
	}
	
	public static void main(String args[]) {
		Login start = new Login();
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
