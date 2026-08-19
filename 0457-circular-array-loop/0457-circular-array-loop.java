class Solution {
    public boolean circularArrayLoop(int[] nums) {
            int n =nums.length;
            for(int start =0 ;start<n ;start++){
                int curr =start ;
                boolean positive =nums[start]>0;
                int count =0;
                while(count<n){
                    if((nums[curr]> 0)!=positive ){
                        break;
                    }
                    int next =(((curr+nums[curr])%n+n)%n);
                    if(next ==curr){
                        break;
                    }
                    curr =next;
                    count++;
                    if(curr==start){
                        return true;
                    }
                }
            
            }
                return false ;
    }
}