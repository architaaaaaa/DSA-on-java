package recursion;

public class firstOccurance {
    public static int first=-1;
    public static int last=-1;

    public static void printOccurance(String str, char element, int index){
        if(index==str.length()){
            return;
        }
        if(str.charAt(index)==element){
            if(first==-1){
                first=index;
            }else{
                last=index;
            }
        }
        printOccurance(str, element, index+1);
    }

    public static void main(String[] args) {
        printOccurance("abaabsadhaf", 'a', 0);
        System.out.println(first);
        System.out.println(last);
    }
}
