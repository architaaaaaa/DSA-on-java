package recursion;

public class fillTiles {
    public static int printTileToFill(int n, int m){
        if(n==m) return 2;
        if(n< m) return 1;

        int verticallyPlace= printTileToFill(n-m,m);
        int horizontallyPlace= printTileToFill(n-1,m);

        return verticallyPlace+horizontallyPlace;
    }

    public static void main(String[] args) {
        int n=4,m=2;
        int ans=printTileToFill(n,m);
        System.out.println(ans);
    }
}
