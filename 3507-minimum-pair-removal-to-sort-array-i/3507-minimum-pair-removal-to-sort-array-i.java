import java.util.*;

class Solution {
    public int minimumPairRemoval(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        // Convert array to ArrayList
        for (int num : nums) {
            list.add(num);
        }

        int ans = 0;

        while (!isSorted(list)) {

            int minSum = Integer.MAX_VALUE;
            int index = 0;

            // Find minimum adjacent pair
            for (int i = 0; i < list.size() - 1; i++) {

                int sum = list.get(i) + list.get(i + 1);

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            // Merge the pair
            list.set(index, minSum);
            list.remove(index + 1);

            ans++;
        }

        return ans;
    }

    private boolean isSorted(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}