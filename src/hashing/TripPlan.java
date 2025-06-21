package hashing;
import java.util.*;
public class TripPlan {
    public static String printTrip(HashMap<String,String> ticket){
        HashMap<String,String> revMap= new HashMap<>();

        for(String key: ticket.keySet()){
            revMap.put(ticket.get(key),key);
            if(!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> ticket= new HashMap<>();
        ticket.put("chennai", "bengaluru");
        ticket.put("mumbai", "delhi");
        ticket.put("goa", "chennai");
        ticket.put("delhi", "goa");
        String start= printTrip(ticket);

        while(ticket.containsKey(start)){
            System.out.print(start+"->");
            start=ticket.get(start);
        }
        System.out.println(start);
    }
}
