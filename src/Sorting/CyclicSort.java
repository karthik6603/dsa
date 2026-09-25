package Sorting;

import java.util.Scanner;

public class CyclicSort {

    public static void cyclicSort(int[] arr){

        int i = 0;

        while(i < arr.length){
            int correctIndex = arr[i] - 1;

            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        cyclicSort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
