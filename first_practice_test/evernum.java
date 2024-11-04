package first_practice_test;

import java.util.Scanner;

public class evernum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read the number of test cases.
        int testcase = sc.nextInt();

        // Step 2: Loop over each test case.
        for (int i = 0; i < testcase; i++) {
            // Step 3: Read the size of the numlist array for this test case.
            int m = sc.nextInt();
            int[] numlist = new int[m];

            // Step 4: Read the maximum number n to check if all numbers from 1 to n are
            // present.
            int n = sc.nextInt();

            // Step 5: Initialize a boolean array "found" with size n+1, set to false
            // initially.
            // This will help track which numbers from 1 to n are present in numlist.
            boolean[] found = new boolean[n + 1];

            // Step 6: Set flag to true, assuming all numbers from 1 to n will be found in
            // numlist.
            boolean flag = true;

            // Step 7: Fill in numlist and update "found" for any valid numbers in the list.
            for (int j = 0; j < m; j++) {
                numlist[j] = sc.nextInt();

                // Step 8: If the number is positive and within range, mark it as "found".
                if (numlist[j] > 0 && numlist[j] <= n) {
                    found[numlist[j]] = true;
                }
            }

            // Step 9: Check if every index from 1 to n in "found" is true, meaning all
            // numbers 1 to n are present.
            for (int j = 1; j <= n; j++) {
                if (!found[j]) {
                    flag = false; // If any number is missing, set flag to false and break out of loop.
                    break;
                }
            }

            // Step 10: Print "Yes" if all numbers from 1 to n are present, otherwise print
            // "No".
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        // Step 11: Close the scanner to prevent resource leaks.
        sc.close();
    }
}
