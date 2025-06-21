package hashing;
import java.util.*;
public class sumOfSubArray {
            public static int findAllSubarraysWithGivenSum(int[] arr, int k) {
                Map<Integer, Integer> map= new HashMap<>();
                map.put(0, 1); // Base case: sum of 0 occurs once before the start
                int preSum = 0;
                int count = 0;

                for(int i=0; i<arr.length;i++){
                    preSum+=arr[i];
                    int remove= preSum-k;
                    count+=map.getOrDefault(remove,0);
                    map.put(preSum, map.getOrDefault(preSum,0)+1);
                }
                return count;
            }

            public static void main(String[] args) {
                int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
                int k = 3;
                System.out.println(findAllSubarraysWithGivenSum(arr, k));
    }
}
