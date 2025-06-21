package recursion;

public class moveXtoEnd {
    public static void printString(String str, int count, int index, String newStr){
        if(str.length()==index){
            for(int i=0; i<count;i++){
                newStr+="x";
            }
            System.out.println(newStr);
            return;
        }
        char currChar= str.charAt(index);
        if(currChar=='x'){
            count++;
            printString(str, count, index+1, newStr);
        }else{
            newStr+=currChar;
            printString(str, count, index+1, newStr);
        }
    }

    public static void main(String[] args) {
        String str="axbxcxdxexxf";
        printString(str,0,0," ");
    }
}
