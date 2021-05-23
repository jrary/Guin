/*import java.util.*;
import java.io.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader inputStream1 = null; //for Consumer.dat
		PrintWriter outputStream1 = null;
		BufferedReader inputStream2 = null; //for Producer.dat
		PrintWriter outputStream2 = null;

        HashMap<String, ArrayList<Producer>> producer_map = Producer.producer_map;
        ArrayList<Consumer> consumer_list                 = Consumer.consumer_list;

        //set the file data in the ArrayList
        String l;
        //Consumer
        inputStream1 = new BufferedReader(new FileReader("Consumer.dat"));
        while((l = inputStream1.readLine()) != null) {
        	String[] arr;
        	arr=l.split("/");
        	new Consumer(arr[0], arr[1], arr[2], arr[3], arr[4]);
		}
        if(inputStream1 != null)
			inputStream1.close();
        //Producer
        inputStream2 = new BufferedReader(new FileReader("Producer.dat"));
        while((l = inputStream2.readLine()) != null) {
        	String[] arr;
        	arr=l.split("/");
        	new Producer(arr[0], arr[1], arr[2], arr[3], arr[4]);
		}
        if(inputStream2 != null)
			inputStream2.close();
        
        
        while (true) {
            System.out.println("----------------Guin----------------");
            System.out.println("1. 소비자 등록");
            System.out.println("2. 생산자 등록");
            System.out.println("3. 사용하기");
            System.out.println("4. 종료");
            System.out.println("------------------------------------");
            System.out.print(": ");

            int switchCase = sc.nextInt();
            sc.nextLine(); // 버퍼

            if (switchCase == 1) {
                String name, number, email, region, job;
                System.out.print("이름: ");
                name = sc.nextLine();

                System.out.print("핸드폰 번호: ");
                number = sc.nextLine();

                System.out.print("이메일: ");
                email = sc.nextLine();

                System.out.print("사는 지역: ");
                region = sc.nextLine();

                System.out.print("직업: ");
                job = sc.nextLine();

                new Consumer(name, number, email, region, job);
                outputStream1 = new PrintWriter(new FileWriter("Consumer.dat", true));
                outputStream1.println(name+"/"+number+"/"+email+"/"+region+"/"+job);
                System.out.println("소비자 등록 완료\n");
                if(outputStream1 != null)
        			outputStream1.close();
                
            } else if (switchCase == 2) {
                String name, number, email, region, job;
                System.out.print("이름: ");
                name = sc.nextLine();

                System.out.print("핸드폰 번호: ");
                number = sc.nextLine();

                System.out.print("이메일: ");
                email = sc.nextLine();

                System.out.print("사는 지역: ");
                region = sc.nextLine();

                System.out.print("직업: ");
                job = sc.nextLine();

                new Producer(name, number, email, region, job);
                outputStream2 = new PrintWriter(new FileWriter("Producer.dat", true));
                outputStream2.println(name+"/"+number+"/"+email+"/"+region+"/"+job);
                System.out.println("생산자 등록 완료\n");
                if(outputStream2 != null)
        			outputStream2.close();
                
            } else if (switchCase == 3) {
                boolean is_registered = false;

                String name, email;
                System.out.print("이름을 입력하세요: ");
                name = sc.nextLine();
                System.out.print("이메일을 입력하세요: ");
                email = sc.nextLine();

                // 해당 소비자가 등록되었는지 찾는다.
                for (Consumer c : consumer_list) {

                    // 이름과 이메일이 같다면
                    if (c.getName().equals(name) && c.getEmail().equals(email)) {
                        is_registered = true;
                        // 폰 번호 확인하고
                        System.out.print("당신의 핸드폰 번호가 " + c.getPhoneNumber() + "가 맞습니까? (y/n)\n: ");
                        String isMyNumber = sc.nextLine();

                        // 폰 번호 맞으면
                        if (isMyNumber.equals("y") || isMyNumber.equals("Y")) {

                            System.out.print("도움을 받고자 한다면 y, 도움을 끝내고자 한다면 n 을 입력하세요: ");
                            String want = sc.nextLine();
                            // 도움 받고자 한다면,
                            if (want.equals("y") || want.equals("Y")) {

                                System.out.print("어떤 직업군에 도움받고 싶습니까?\n: ");
                                String job_that_i_wanted = sc.nextLine();
                                c.setUserPreferJob(job_that_i_wanted);
                                c.getSupport(producer_map); // 도움 받음.

                                System.out.println("초기 화면으로 되돌아갑니다. ");
                                break;
                            }
                            // 도움을 끝내고자 한다면,
                            else {
                                System.out.print("현재 받고 있는 도움이 완료되었습니까? (y/n)\n: ");
                                String isFinished = sc.nextLine();

                                if (isFinished.equals("y") || isFinished.equals("Y")) {
                                    c.finish_support("w"); // 우선은 해당 생산자를 wait 로 둔다.
                                    break;
                                } else {
                                    System.out.println("더 이상 해줄 수 있는 것이 없습니다. ");
                                    System.out.println("초기화면으로 되돌아갑니다. ");
                                    break;
                                }
                            }
                        }
                        // 폰 번호 다르다면,
                        else {
                            System.out.println("등록되지 않은 사용자입니다.");
                            System.out.println("초기 화면으로 되돌아갑니다. ");
                            break;
                        }
                    }
                }
                // 만약, consumer list 에서 찾지 못했다면,
                if (!is_registered) {
                    System.out.println("등록되지 않은 사용자입니다. ");
                    System.out.println("등록부터 하세요");
                }
            } else if (switchCase == 4) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. ");
            }
        }
    }
}
*/
