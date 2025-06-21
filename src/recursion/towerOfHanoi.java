package recursion;
import java.util.*;
public class towerOfHanoi {
    public static void printTower(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println("transfer tower "+n+"from"+source+"to"+destination);
            return;
        }
        printTower(n-1,source,destination,helper);
        System.out.println("transfer tower "+n+"from"+source+"to"+destination);
        printTower(n-1,helper,source,destination);
    }

    public static void main(String[] args) {
        int n=3;
        printTower(n, "S","H","D");
    }
}
