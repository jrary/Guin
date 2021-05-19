import java.util.*;

public class Producer extends Info {
    private boolean amIWorking; // 내가 현재 일하고 있는지 확인하는 변수
    private boolean workable;   // 일할 수 있는지를 판단하는 변수

    public Producer(String name, String number, String email, String region, String job) {
        this.name = name;
        this.phoneNumber = number;
        this.email = email;
        this.region = region;
        this.job = job;
        ready();                    // 처음 생성 시, 우선 ready state 로 둔다.
        insertToHash(producer_map); // producer map 에 저장한다.
    }


    /*
    ---------------- Public Method Area ----------------
     */

    // 일할 수 있는 상태(ready state) 로 만든다.
    public void ready() {
        amIWorking = false; // 일하고 있지 않으며,
        workable = true;    // 일할 준비가 된 상태
    }

    // 일할 수 없는 상태(running state) 로 만든다.
    public void running() {
        amIWorking = true; // 일하고 있으며
        workable = false;  // 남을 도울 수 없는 상태
    }

    // 일할 수 없는 상태(waiting state) 로 만든다.
    public void waiting() {
        amIWorking = false; // 일하고 있지는 않지만,
        workable = false;   // 아직 일할 준비는 되지 않은 상태.
    }

    // 현재 일할 수 있는 상태인가
    public boolean getWorkable() {
        // 내가 현재 일하고 있다면, 무조건 false 를 반환한다.
        if (isAmIWorking()) return false;

        // 이후, 일할 수 있는지 여부를 반환 (true / false)
        return workable;
    }





    /*
    ---------------- Private Method Area ----------------
     */

    // 현재 일하고 있는 상태인가
    private boolean isAmIWorking() {
        return amIWorking;
    }

    private void insertToHash(HashMap<String, ArrayList<Producer>> map) {
        // 이미 해당하는 직업군이 hashmap 에 있다면,
        ArrayList<Producer> job_queue;
        if (map.containsKey(getJob())) {

            // 해당하는 job 의 list 를 가르키는 job_queue 를 만든다.
            job_queue = producer_map.get(getJob());

        } else { // 처음 들어오는 직업군이라면,

            // 새로운 ArrayList 을 만든다.
            job_queue = new ArrayList<>();

            // 새로 만든 ArrayList 을 key 에 해당하는 부분의 Hashmap 에 추가한다.
            map.put(getJob(), job_queue);
        }
        // list 에 data 을 가진 this 을 추가한다.
        job_queue.add(this);
    }

}
