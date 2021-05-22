import java.util.*;

public class Info {
    protected String name;
    protected String phoneNumber;
    protected String email;
    protected String region;
    protected String job;

    // producer 를 등록하는 map
    // String type: Job name
    // ArrayList<Producer>: 해당 직업을 가진 producer 들을 저장하는 list
    protected static HashMap<String, ArrayList<Producer>> producer_map = new HashMap<>();

    // consumer 를 등록하는 list
    protected static ArrayList<Consumer> consumer_list = new ArrayList<>();
    
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getRegion() {
        return region;
    }
    public String getJob() {
        return job;
    }

    public ArrayList<Consumer> getConsumer_list() {
        return consumer_list;
    }
    public HashMap<String, ArrayList<Producer>> getProducer_map() {
        return producer_map;
    }
}
