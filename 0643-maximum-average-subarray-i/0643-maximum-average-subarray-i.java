class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n =nums.length;
        int windowsum= 0;
        for(int i =0; i<k ;i++){
            windowsum += nums[i];
        }
        int maxsum = windowsum ;
        for(int j = k ; j<n ;j++){
            windowsum += nums[j];
            windowsum -=nums[j-k];
             maxsum =Math.max(maxsum, windowsum);
        }
       return (double) maxsum / k;

    }
}