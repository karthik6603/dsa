package LInearSearch;

import java.util.Scanner;

public class CountDigit {

    private static int countDigit(int num){
        return (int)(Math.log10(num)) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = countDigit(num);

        System.out.println(count);
    }
}
