package recursion;

public class keypadCombination {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombination(String str, int index, String combination){
        if(str.length()==index){
            System.out.print(combination);
            return;
        }
        char currChar= str.charAt(index);
        String mapping=keypad[currChar-'0'];
        for(int i=0; i<mapping.length();i++){
            printCombination(str, index+1, combination+mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str="0";
        printCombination(str, 0," ");
    }
}
