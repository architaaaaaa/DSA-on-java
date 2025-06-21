package recursion;

public class countMazePaths {
    public static int countPath(int i, int j, int n, int m){
        if(i==n || j==m) return 0;
        if(i==n-1 && j==m-1) return 1;

        //right movement
        int rightward= countPath(i,j+1,n,m);
        //downwards movement
        int downward= countPath(i+1,j,n,m);

        return rightward+downward;
    }

    public static void main(String[] args) {
        int n=3, m=3;
        int ans= countPath(0,0,n,m);
        System.out.println(ans);
    }
}
