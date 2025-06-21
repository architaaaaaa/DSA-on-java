package array;
import java.util.*;
public class findingLocationOfX {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int size=sc.nextInt();
//        int[] numbers= new int[size];
//
//        for(int i=0; i<size; i++){
//            numbers[i]=sc.nextInt();
//        }
//        int x= sc.nextInt();
//        for(int i=0;i<numbers.length; i++){
//            if(numbers[i]==x){
//                System.out.println("the number is found at: "+i);
//            }
//        }
        int row=sc.nextInt();
        int column=sc.nextInt();

        int[][] numbers= new int[row][column];

        for(int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        int x=sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(numbers[i][j]==x){
                    System.out.println("number is at location: ("+i+","+j+")");
                }
            }
        }
    }
}
