package recursion;

public class calculatePower {
//    public static int printCalculation(int x, int n){
//        if(n==0) return 1;
//        if(x==0) return 0;
//
//        int xPownm1= printCalculation(x, n-1);
//        int xPown= x * xPownm1;
//        return xPown;
//    }
//
//    public static void main(String[] args) {
//        int x=2, n=5;
//        int ans=printCalculation(x,n);
//        System.out.println(ans);
//    }
    public static int printCalculation(int x, int n){
        if(n==0) return 1;
        if(x==0) return 0;

        if(n%2 == 0){
            return printCalculation(x, n/2)* printCalculation(x, n/2);
        }else{
            return printCalculation(x, n/2)* printCalculation(x, n/2)*x;
        }
    }

    public static void main(String[] args) {
        int x=2, n=5;
        int ans= printCalculation(x,n);
        System.out.println(ans);
    }
}
