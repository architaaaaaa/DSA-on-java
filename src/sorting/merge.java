package sorting;

public class merge {
    public static void conquer(int arr[],int StartingIndex, int mid, int EndingIndex ){
        int merged[]= new int[EndingIndex-StartingIndex +1]; //starting index starts from '0', so we are adding 1;

        int index1=StartingIndex;
        int index2= mid+1;
        int x=0;
        while(index1<=mid && index2<=EndingIndex){
            if(arr[index1]<arr[index2]){
                merged[x]+=arr[index1];
                x++;
                index1++;
            }else{
                merged[x]+=arr[index2];
                x++;
                index2++;
            }
        }
        while(index1<=mid){
            merged[x]+=arr[index1];
            x++;
            index1++;
        }
        while(index2<=EndingIndex){
            merged[x]+=arr[index2];
            x++;
            index2++;
        }
        for(int i=0, j=StartingIndex; i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    public static void divide(int arr[], int StartingIndex, int EndingIndex){
        if(StartingIndex>=EndingIndex){
            return;
        }
        int mid= StartingIndex+(EndingIndex-StartingIndex)/2;
        divide(arr,StartingIndex, mid);
        divide(arr, mid+1, EndingIndex);

        conquer(arr, StartingIndex,mid,EndingIndex);

    }

    public static void main(String[] args) {
        int arr[]={3,5,2,7,1};
        int n=arr.length;
        divide(arr,0,n-1);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
