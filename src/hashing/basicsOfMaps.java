package hashing;
import java.util.*;
public class basicsOfMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        //insert
        map.put("us",30);
        map.put("India",120);
        map.put("china", 40);

        System.out.println(map);

        //searching key
        if(map.containsKey("china")){
            System.out.println("available");
        }
        if(!map.containsKey("Indonesia")){
            System.out.println("not available");
        }

        //getting values
        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia"));
        System.out.println(map.get("china"));

        //remove
//        map.remove("china");
//        System.out.println(map);

        //iterate-first way
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()); //key
            System.out.println(e.getValue()); //values
        }

        //second way
        Set<String> key1= map.keySet(); //only keys!!

        for(String key: key1){
            System.out.println(key+" "+map.get(key));
        }
    }
}
