package GUIN;
import java.util.ArrayList;
import java.util.HashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;
import java.awt.*;

// 소비자가 원하는 producer 를 선택!
public class main2Activity extends JFrame{
	JTable table;
	JScrollPane scroll;
	String[][] data;
	String[][] producer;
	String[][] producerData;
	String[] title = {"이름", "메일", "지역", "직업"};
	public main2Activity() {
		int count = 0;
		try {
			BufferedReader inputStream = null;
			inputStream = new BufferedReader(new FileReader("Producer.dat"));

			String l;
			while ((l = inputStream.readLine()) != null) {
				data = new String[100][4];
				String[] producer;
				producer = l.split("/");
				data[count][0] = producer[2]; // 이름
				data[count][1] = producer[4]; // 메일
				data[count][2] = producer[5]; // 지역
				data[count][3] = producer[6]; // 직업
				count++;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		producerData = new String[count][4];
		for (int i = 0; i < count; i++) {
			producerData[i][0] = data[i][0]; // 이름
			producerData[i][1] = data[i][1]; // 메일
			producerData[i][2] = data[i][2]; // 지역
			producerData[i][3] = data[i][3]; // 직업
		}
		
		table = new JTable(producerData, title);
		scroll = new JScrollPane(table);
		add(scroll);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setSize(700, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new main2Activity();
	}

}
