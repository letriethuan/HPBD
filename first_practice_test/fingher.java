package first_practice_test;

import java.util.Scanner;

public class fingher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] fingers = { "cai", "tro", "giua", "ap ut", "ut" };
        int finger_num = n % 18;
        // Minus 20 to ensure the finger_nums are from 1 to 10
        if (finger_num > 10) {
            finger_num = 20 - finger_num;
        }
        // Check if the fingers_nnum is in the right or left hand
        if (finger_num <= 5) {
            System.out.println("Ngon " + fingers[finger_num - 1] + " cua ban tay trai");
        } else if (finger_num > 5) {
            System.out.println("Ngon " + fingers[10 - finger_num] + " cua ban tay phai");
        }

        sc.close();
    }

}
