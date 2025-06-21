package recursion;

public class factorial {
    public static int calFact(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact1=calFact(n-1);
        int factn=n*fact1;
        return factn;
    }

    public static void main(String[] args) {
        int n=5;
        int ans= calFact(n);
        System.out.println(ans);
    }
}