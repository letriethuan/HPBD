package scraptest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EIUACTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of participants
        int n = sc.nextInt();
        int[] outcomes = new int[n];

        // Read the outcomes
        for (int i = 0; i < n; i++) {
            outcomes[i] = sc.nextInt();
        }

        // Map to count occurrences of each outcome
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count each outcome
        for (int outcome : outcomes) {
            countMap.put(outcome, countMap.getOrDefault(outcome, 0) + 1);
        }

        // Find the highest unique outcome
        int highestUniqueOutcome = -1;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) { // Check if it's unique
                highestUniqueOutcome = Math.max(highestUniqueOutcome, entry.getKey());
            }
        }

        // Find the index of the participant with the highest unique outcome
        if (highestUniqueOutcome == -1) {
            System.out.println("none");
        } else {
            for (int i = 0; i < n; i++) {
                if (outcomes[i] == highestUniqueOutcome) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }

        sc.close();
    }
}