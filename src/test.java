import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        HashMap<String, ArrayList<Producer>> producer_map = Producer.producer_map;
        ArrayList<Consumer> consumer_list                 = Consumer.consumer_list;

        // prosducer 1 등록 (의사)
        Producer p1 = new Producer("Lee", "010-0000-0000", "email0.com", "seoul", "Doctor");
      
        // producer 2 등록 (의사)
        Producer p2 = new Producer("Kim", "010-0000-0000", "email0.com", "seoul", "Doctor");

        // consumer 등록 (c1)
        Consumer c1 = new Consumer("Kim", "010-0000-0000", "email1.com", "seoul", "professor");
        c1.setUserPreferJob("Doctor"); // c1 이 필요로 하느 직업: 의사
        c1.getSupport(producer_map);   // producer_map 에서 producer 를 뽑아서 도움받음
      
        c1.finish_support("w");        // 도움 다 받고 나서 도와준 사람의 상태를 wait 으로 설정
        System.out.println("\n");      
      
        // 현재 도울 수 있는 사람은 Kim 한명(Lee 는 wait)


        // consumer 등록 (c2)
        Consumer c2 = new Consumer("Lim", "01-", "em", "seoul", "t");
        c2.setUserPreferJob("Doctor"); // 의사 원함
        c2.getSupport(producer_map);   // Kim 이 도와줌
        
        // 현재 도울 ㅅ 있는 사람은 없음 (Lee 느 wait Kim 은 바쁨)

        System.out.println("\n");

        p1.ready(); // 다시 p1(Lee) 을 ready 로 바꿈(도움을 줄 수 있는 상태)
        
        // 현재 도울 수 있는 사람은 p1(Lee)
        
        c1.setUserPreferJob("Doctor"); // c1 이 의사를 원함
        c1.getSupport(producer_map);   // Lee 가 도와줌

        System.out.println("\n");
        
        // 현재 도울 ㅅ 있는 사람은 없음

        // Consumer c3 등록
        Consumer c3 = new Consumer("Lim", "01-", "em", "seoul", "t");
        c3.setUserPreferJob("Doctor"); // 의사 원함
        c3.getSupport(producer_map);   // 도움 못받음 -> Kim, Lee 둘ㄷ 바쁨

        System.out.println("\n");
        c2.finish_support("r");  // c2 를 돕고있는 Kim 의 상태를 ready 로 바꿈. 
        System.out.println("\n");

        c3.getSupport(producer_map); // 그럼이제 c3 는 도움을 받을 수 있ㅇ(Kim이 도와줌)
    }
}
