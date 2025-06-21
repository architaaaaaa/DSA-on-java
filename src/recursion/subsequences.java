package recursion;

public class subsequences {
    public static void printSubsequences(String s, int index, String newString){
        if(s.length()==index){
            System.out.println(newString);
            return;

        }
        char currChar=s.charAt(index);
        printSubsequences(s, index+1, newString+currChar); //wants to be
        printSubsequences(s, index+1, newString); //not wants to be
    }

    public static void main(String[] args) {
        String s="aaa";
        printSubsequences(s, 0, " ");
    }
}
