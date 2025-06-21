package array;
import java.util.*;
public class traverseTwoDArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        int column= sc.nextInt();

        int [][] numbers= new int[rows][column];

        for(int i=0; i<rows;i++){
            for(int j=0; j<column; j++){
                numbers [i][j]= sc.nextInt();
            }
        }
        for(int j=0; j<column;j++){
            for(int i=0; i<rows; i++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
