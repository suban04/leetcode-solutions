import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> map = new HashMap<>();

        // Store list1: restaurant -> index
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> ans = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        // Check list2
        for (int j = 0; j < list2.length; j++) {

            if (map.containsKey(list2[j])) {

                int sum = map.get(list2[j]) + j;

                if (sum < minSum) {
                    minSum = sum;
                    ans.clear();
                    ans.add(list2[j]);
                } 
                else if (sum == minSum) {
                    ans.add(list2[j]);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}