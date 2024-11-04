package scraptest;

import java.util.Scanner;
import java.util.Arrays;

// EIUTRIANGLE
public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] > arr[k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
