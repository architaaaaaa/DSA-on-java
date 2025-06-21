package recursion;

public class inviteGuestSingleOrDouble {
    public static int inviteGuests(int n){
        if(n<=1) return 1;

        int singleEntry= inviteGuests(n-1);
        int pairEntry= (n-1)* inviteGuests(n-2);
        return singleEntry+pairEntry;
    }

    public static void main(String[] args) {
        int n=2;
        int totalEntry= inviteGuests(n);
        System.out.println(totalEntry);
    }
}
