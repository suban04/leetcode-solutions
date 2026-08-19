class Solution {
    public int findGCD(int[] nums) {
        int n =nums.length;
        int max =nums[0];
        int min =nums[0];

        for(int i =0 ;i<n ;i++){
            min =Math.min(min ,nums[i]);
            max =Math.max(max,nums[i]);
        }while(max!=0){
            int temp =max ;
            max =min % max;
            min =temp;
        }
        return min ;
    }
}