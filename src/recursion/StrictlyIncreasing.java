package recursion;

public class StrictlyIncreasing {
    public static boolean isIncreasing(int arr[], int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return isIncreasing(arr,index+1);
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        int arr[]={1,4,4,5};
        if(isIncreasing(arr,0)){
            System.out.println("strictly increasing");
        }else{
            System.out.println("not possible");
        }

    }
}
