class Solution {
    public int removeDuplicates(int[] nums) {
        int n =nums.length;
        int slow =0;
        int fast=1;
        while(fast<n){
            if(nums[slow]==nums[fast]){
                fast++;
            }else if(nums[slow]!=nums[fast]){
                    slow++;
                    nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
    
}