class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int j = 0;

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            // Remove indices that are outside the current window
            while (!queue.isEmpty() && queue.peekFirst() <= i - k) {
                queue.removeFirst();
            }

            // Remove smaller elements from the back
            // They can never become the maximum
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
                queue.removeLast();
            }

            // Add current index
            queue.addLast(i);

            // Start storing answers once the first window is complete
            if (i >= k - 1) {
                res[j++] = nums[queue.peekFirst()];
            }
        }

        return res;
    }
}