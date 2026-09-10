package LInearSearch;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArraysI {

    private static int[] mergeWithoutRepetition(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();

        for(int i : arr1){
            set.add(i);
        }

        Set<Integer> result = new HashSet<>();

        for(int num : arr2){
            if(set.contains(num)){
                result.add(num);
            }
        }

        int[] arr = new int[result.size()];

        int i = 0;
        for(int num : result){
            arr[i++] = num;
        }

        return arr;

    }
    public static void main(String[] args) {
        
    }
}
