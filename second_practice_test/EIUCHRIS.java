package second_practice_test;

import java.util.Scanner;

public class EIUCHRIS {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int[] outcomes = new int[n];

        for (int i = 0; i < n; i++) {
            outcomes[i] = sc.nextInt();
        }

        int Maxscore = 100;
        int[] count = new int[Maxscore + 1];

        for (int score : outcomes) {
            count[score]++;
        }
        int HighestScore = -1;
        int result = -1;

        for (int i = 0; i < outcomes.length; i++) {
            if (count[outcomes[i]] == 1 && outcomes[i] > HighestScore) {
                HighestScore = outcomes[i];
                result = i;
            }
        }
        if (result == -1) {
            System.out.println("none");
        } else {
            System.out.println(result + 1);
        }

    }
}
