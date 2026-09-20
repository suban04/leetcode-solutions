class Solution {
    public int totalNumbers(int[] digits) {

        int[] freq = new int[10];

        // Frequency of each digit
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        // First digit: 1-9 (cannot be 0)
        for (int first = 1; first <= 9; first++) {

            if (freq[first] == 0)
                continue;

            freq[first]--;

            // Second digit: 0-9
            for (int second = 0; second <= 9; second++) {

                if (freq[second] == 0)
                    continue;

                freq[second]--;

                // Last digit must be even
                for (int last = 0; last <= 8; last += 2) {

                    if (freq[last] > 0) {
                        count++;
                    }
                }

                // Restore second digit
                freq[second]++;
            }

            // Restore first digit
            freq[first]++;
        }

        return count;
    }
}