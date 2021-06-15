import java.util.ArrayList;
import java.util.HashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;
import java.awt.*;

// 소비자가 원하는 producer 를 선택!
public class main2Activity extends JFrame{
	public main2Activity() {
		JPanel p = new JPanel();
		p.setLayout(null);
		
		try {
			BufferedReader inputStream = null;
			inputStream = new BufferedReader(new FileReader("Producer.dat"));

			String l;
			while ((l = inputStream.readLine()) != null) {
				String[] arr;
				arr = l.split("/");
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader inputStream = new BufferedReader(new FileReader("Producer.dat"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
