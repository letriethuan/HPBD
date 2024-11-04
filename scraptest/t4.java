package scraptest;

import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int inc_num = 1;
        int dec_num = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                inc_num++;
            } else if (arr[i] < arr[i - 1]) {
                dec_num++;
            }
        }
        if (inc_num == n) {
            System.out.println("increasing");
        } else if (dec_num == n) {
            System.out.println("decreasing");
        } else {
            System.out.println("none");
        }
        sc.close();
    }
}
