package string;
import java.util.*;
public class substrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String email= sc.nextLine();
//        String username="";
//
//        for(int i=0; i<email.length();i++){
//            if(email.charAt(i)=='@'){
//                break;
//            }else{
//                username+=email.charAt(i);
//            }
//        }
//        System.out.println(username);
        String username= email.substring(0,email.indexOf('@'));
        System.out.println(username);
    }
}
