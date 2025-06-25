package recursion;

public class removeDuplicates {
    public static boolean[] map= new boolean[26];

    public static void printDuplicates(String str, int index, String newString){
        if(str.length()==index){
            System.out.println(newString);
            return;
        }
        char currChar= str.charAt(index);

        if(map[currChar-'a']){
            printDuplicates(str, index+1, newString);
        }else{
            newString+=currChar;
            map[currChar-'a']= true;
            printDuplicates(str, index+1, newString);
        }
    }
    public static void main(String[] args) {
        String str="abbcdde";
        printDuplicates(str, 0, " ");
    }
}
