package GUIN;
/*
수정할 부분 3 : 전체적인 UI 틀 맞추기
*/
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.*;

public class Login extends JFrame{
	Image img = null;
	public Login() {
		JPanel p = new JPanel();
		p.setLayout(null);
		
		JLabel label = new JLabel(new ImageIcon("D:\\학교\\2021년\\객체지향프로그래밍\\GUIN"));
		add(label);
		
		Label t1 = new Label("GUIN - 구인구직 프로그램");
		Label t2 = new Label("Consumer 로그인");
		Label t3 = new Label("Producer 로그인");
		Label t4 = new Label("ID 입력후 로그인 버튼을 클릭하세요.");
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		
		Label b1 = new Label("아이디 : ");
		Label b2 = new Label("비밀번호 : ");
		add(b1);
		add(b2);
		
		TextField b3 = new TextField(); // ID 입력
		TextField b4 = new TextField(); // Password 입력
		add(b3);
		add(b4);
		b4.setEchoChar('*'); // password 별표 처리
		
		JButton b5 = new JButton("Consumer 로그인");
		JButton b6 = new JButton("Producer 로그인");
		JButton b7 = new JButton("회원가입하기");
		add(b5);
		add(b6);
		add(b7);
		
		label.setBounds(0, 5, 350, 255);
		
		t1.setBounds(350,5,250,40);
		t2.setBounds(350,35,250,40);
		t3.setBounds(350,65,250,40);
		t4.setBounds(350,95,250,40);
		
		b1.setBounds(40, 265, 40, 40);
		b2.setBounds(40, 305, 60, 40);
		
		b3.setBounds(150, 265, 200, 30); // ID 입력
		b4.setBounds(150, 305, 200, 30); // Password 입력
		
		b5.setBounds(380, 265, 80, 30); // Consumer 로그인
		b6.setBounds(380, 305, 90, 30); // Producer 로그인
		b7.setBounds(460, 285, 80, 30); // 회원가입
		
		add(p);
		setSize(700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUIN - 구인구직 프로그램");
		setVisible(true);
		
		// Consumer 로그인
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent consumerLogin) {
				 try {
					BufferedReader inputStream1 = null; //for Consumer.dat					
					ArrayList<Consumer> consumer_list= Consumer.consumer_list;
					
					int check = 0;
					//set the file data in the ArrayList
				    String l;
				    //Consumer
				    inputStream1 = new BufferedReader(new FileReader("Consumer.dat"));
				    while((l = inputStream1.readLine()) != null) {
				      	String[] arr;
				       	arr=l.split("/");
				       	// [0] : ID
				       	// [1] : PW
				       	// [2] : name
				        // [3] : phone
				       	// [4] : email
				       	// [5] : region
				       	// [6] : job
				       	// new Consumer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
				       	if(b3.getText().equals(arr[0]) && b4.getText().equals(arr[1])) {
				       		new Consumer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
				       		JOptionPane.showMessageDialog(null, "로그인이 되었습니다!");
				       		// consumer UI 나오도록 설정 ex3 f3 = new ex3();
				       		check++;
				       		mainActivity goMain = new mainActivity(arr);
				       		break;
				       	}
				       	else {
				       		continue;
				       	}
				    }
				   	inputStream1.close();
				   	if (check != 1) {
			       		JOptionPane.showMessageDialog(null, "로그인에 실패했습니다!");
				   	}
				   	dispose();
				 }catch (IOException E10) {
					 E10.printStackTrace();
				 }
			}
		});
		
		// Producer 로그인
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent producerLogin) {
				 try {
					BufferedReader inputStream2 = null; //for Producer.dat
					
			        HashMap<String, ArrayList<Producer>> producer_map = Producer.producer_map;
			        
			        int check = 0;
					//set the file data in the ArrayList
				    String l;
			        //Producer
			        inputStream2 = new BufferedReader(new FileReader("Producer.dat"));
			        while((l = inputStream2.readLine()) != null) {
			        	String[] arr;
			        	arr=l.split("/");
			        	new Producer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
			        	if (b3.getText().equals(arr[0])&&b4.getText().equals(arr[1])) {
				       		JOptionPane.showMessageDialog(null, "로그인이 되었습니다!");
				       		check++;
				       		new ProduceAct(arr[6], arr[2], arr[3], arr[4], arr[5]);
				       		// producer UI 나오도록 설정
				       		break;
			        	}
			        	else {
			        		continue;
			        	}
					}
			     	inputStream2.close();
			     	if (check != 1) {
			       		JOptionPane.showMessageDialog(null, "로그인에 실패했습니다!");
			     	}
			     	dispose();
				 }catch (IOException E10) {
					 E10.printStackTrace();
				 }
			}
		});
		
		// 회원가입하기
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent register) {
				register f2 = new register();
			}
		});
	}
}
