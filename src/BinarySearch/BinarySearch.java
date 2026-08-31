package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    // This will be the normal binary search; to prevent the overflow if integers we use
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // make it excption

        int target =  sc.nextInt();

        int index = binarySearch(arr, target);

        int answerIndex = binarySearch(arr, target);

        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;

    }
}
