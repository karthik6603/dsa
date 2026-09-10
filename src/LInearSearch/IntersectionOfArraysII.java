package LInearSearch;

import java.util.*;

public class IntersectionOfArraysII {
    private static int[] mergeWithRepetition(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();

        for (int num : arr2) {
            if (freq.getOrDefault(num, 0) > 0) {
                res.add(num);
            }
        }

        int[] arr = new int[res.size()];

        int i = 0;

        for (int num : res) {
            arr[i++] = num;
        }

        return arr;

    }

    public static void main(String[] args) {

    }
}
