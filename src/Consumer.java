import java.util.*;

public class Consumer extends Info {
    private final Scanner sc = new Scanner(System.in);
    private final String userPreferRegion;     // 사용자가 선호하는 지역
    private String userPreferJob;        // 사용자가 도움받고 싶어하는 직업
    private int use_cnt;                 // 사용자가 이 서비스를 사용한 횟수

    private Producer supporter;          // 나를 도와주는 사람

    // 따로 선호하는 직업 및 지역을 선택하지 않는다면,
    public Consumer(String name, String number, String email, String region, String job) {
        this.name = name;
        this.phoneNumber = number;
        this.email = email;
        this.region = region;
        this.job = job;


        userPreferRegion = getRegion(); // 지역은 사용자가 살고있는 지역으로 초기화하고,
        userPreferJob = "NULL";         // 도움받길 원하는 직업군은 NULL
        use_cnt = 0;                    // 사용횟수는 0으로 초기화한다.
        supporter = null;               // 일단, 나의 supporter 는 없다.

        consumer_list.add(this);         // 이후, consumer_list 에 consumer 를 등록한다.
    }

    /*
    ---------------- Public Method Area ----------------
     */

    // 도움받길 원하는 직업 설정
    public void setUserPreferJob(String job) {
        this.userPreferJob = job;
    }

    // 도움을 받는다.
    public void getSupport(HashMap<String, ArrayList<Producer>> map) {
        supporter = getSupporter(map); // 내의 supporter 를 제공받는다. 없으면 null 반환
        // 도움받을 수 있는 상황이라면, 즉 supporter 가 존재한다면,
        if (supporter != null) {
            System.out.println("Name: " + supporter.name + " job: " + supporter.job);
            System.out.println("Can help you");
            use_cnt += 1;                   // 도움받은 횟수를 1 증가시킨다.
            supporter.running();          // working state 로 만든다.
        } else { // 도움받을 수 없는 상황이라면,
            System.out.println("Unavailable to support you");
        }
    }

    // 현재 도움 받는 것을 중지한다.
    public void finish_support(String state) {
        // 현재, supporter 가 없다면,
        if (supporter == null) {
            System.out.println("You don't get any support");
            return;
        }

        // supporter 가 있다면,
        System.out.println("Name: " + supporter.name + " job: " + supporter.job);
        System.out.println("Successfully helped you");

        if (state.equals("r")) {
            supporter.ready();
        } else {
            supporter.waiting();
        }
    }





    /*
    ---------------- Private Method Area ----------------
     */

    // 해당 직업군을 가진 producer 가 있는지 확인한다.
    private boolean isJobExist(HashMap<String, ArrayList<Producer>> map) {
        // 내가 선호하는 직업군을 설정해두지 않았다면,
        if (userPreferJob.equals("NULL")) {
            System.out.println("Enter the job that you want to be helped");
            return false;
        } else { // 내가 선호하는 직업군을 설정해 두었다면,

            // 해당 직업군이 hashmap 에 존재하는 지 확인한다.
            return producer_map.containsKey(userPreferJob);
        }
    }

    // 일할 수 았는 producer 가 존재하면, 해당 producer 을 반환한다.
    private Producer getSupporter(HashMap<String, ArrayList<Producer>> map) {
        // 해당하는 직업이 존재한다면,
        if (isJobExist(map)) {
            ArrayList<Producer> infoArr = map.get(userPreferJob);
            for (Producer producer_info : infoArr) {
                // producer 의 지역을 확인한다.
                if (userPreferRegion.equals(producer_info.getRegion())) {
                    // 그리고 그 producer 가 일할 수 있다면, --> 나는 그 사람에게 도움을 받을 수 있는 것이다.
                    if (producer_info.getWorkable()) {
                        // 그 producer 를 맨 뒤로 보내고(다양한 사람이 도울 수 있도록)
                        infoArr.add(producer_info);
                        infoArr.remove(0);

                        // producer 를 반환한다.
                        return producer_info;
                    }
                }
            }
        }
        return null;
    }
}
