import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        // Store score and original index
        int[][] athletes = new int[n][2];

        for (int i = 0; i < n; i++) {
            athletes[i][0] = score[i]; // score
            athletes[i][1] = i;        // original index
        }

        // Sort by score in descending order
        Arrays.sort(athletes, (a, b) -> b[0] - a[0]);

        String[] result = new String[n];

        // Assign ranks
        for (int rank = 0; rank < n; rank++) {

            int originalIndex = athletes[rank][1];

            if (rank == 0) {
                result[originalIndex] = "Gold Medal";
            }
            else if (rank == 1) {
                result[originalIndex] = "Silver Medal";
            }
            else if (rank == 2) {
                result[originalIndex] = "Bronze Medal";
            }
            else {
                result[originalIndex] = String.valueOf(rank + 1);
            }
        }

        return result;
    }
}