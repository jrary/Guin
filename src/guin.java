import java.io.*;
import java.util.*;
public class guin{
	public static void main(String args[]) {
		  Scanner sc = new Scanner(System.in);
		  BufferedReader inputConsumer = null;
		  PrintWriter outputConsumer = null;
		  BufferedReader inputProducer = null;
		  PrintWriter outputProducer = null;
		  HashMap<String, ArrayList<Producer>> producer_map = new HashMap<>();

		  try {
				inputConsumer = new BufferedReader(new FileReader("Consumer.txt"));
				inputProducer = new BufferedReader(new FileReader("Producer.txt"));
				outputConsumer = new PrintWriter (new FileWriter("Consumer.txt"));
				outputProducer = new PrintWriter (new FileWriter("Producer.txt"));
				inputProducer.readLine();
				String l;
				while((l = inputProducer.readLine()) != null) {
					producer_map;
				}
				
			} catch(FileNotFoundException e) {
				System.out.println(e.toString());
			}
	}
}