package BinarySearch;
import java.util.*;

public class CeilOfNumber {
    // This is the smallest number which is greater than or equal to the target element

    private static int ceilOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        int ans = -1;

         while(start <= end){
             int mid = start + (end - start) / 2;

             if(arr[mid] >= target){
                 ans = arr[mid];
                 end = mid - 1;
             }
             else{
                 start = mid + 1;
             }
         }

         return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        int target = scan.nextInt();
        int res = ceilOfNumber(arr, target);
    }

}
