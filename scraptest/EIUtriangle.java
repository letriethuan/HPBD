package scraptest;

import java.util.Scanner;
import java.util.Arrays;

public class EIUtriangle {
    static Scanner sc = new Scanner(System.in);

    public static int count_Triangle(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(count_Triangle(arr, n));
    }
}
