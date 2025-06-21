package recursion;
import java.util.*;
public class uniqueSubsequences {
    public static void printString(String s, int index, String newS, HashSet<String> set){
        if(s.length()==index){
            if(set.contains(newS)){
                return;
            }else{
                set.add(newS);
                System.out.println(newS);
                return;
            }
        }
        char currChar=s.charAt(index);

            printString(s,index+1,newS+currChar,set); //wants to be
            printString(s, index+1, newS, set); //do not want to be in the hashset

    }

    public static void main(String[] args) {
        String s="abc";
        HashSet<String> set= new HashSet<>();
        printString(s,0," ", set);
    }
}
