public class binaryNum {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        for(int i:num){
            String ans=Integer.toBinaryString(i);
            System.out.println(ans);
        }
    }
}
