import java.util.ArrayList;
import java.util.HashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;
import java.awt.*;

public class mainActivity extends JFrame {
	
	public mainActivity(ArrayList<Consumer> consumer_list) {
		JPanel p = new JPanel();
		p.setLayout(null);
		
		Label l1 = new Label("Consumer : ");
		Label l2 = new Label(consumer_list.get(0).toString()); // consumer list 에서 로그인 한 고객 이름(ID)이 담겨짐
		Label l3 = new Label(consumer_list.get(2).toString());
		
		JLabel draw1 = new JLabel(); // 직업 아이콘 법조인
		JLabel draw2 = new JLabel(); // 직업 아이콘 의사
		JLabel draw3 = new JLabel(); // 직업 아이콘 공무원
		JLabel draw4 = new JLabel(); // 직업 아이콘 교통
		JLabel draw5 = new JLabel(); // 직업 아이콘 생산직
		JLabel draw6 = new JLabel(); // 직업 아이콘 강사
		JLabel draw7 = new JLabel(); // 직업 아이콘 기타
		
		JButton legalProfession = new JButton();
		JButton Doctor = new JButton();
		JButton Police = new JButton();
		JButton Traffic = new JButton();
		JButton Worker = new JButton();
		JButton teacher = new JButton();
		JButton etc = new JButton();

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
