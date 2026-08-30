class Solution {
    public int trap(int[] height) {
        int water = 0 ;
        int left =1 ,right =height.length-2;

        int leftmax=height[0] ,rightmax = height[height.length -1];

        while(left<=right){
            leftmax =Math.max (leftmax ,height[left]);
            rightmax =Math.max(rightmax,height[right]);

        if(rightmax<leftmax){
            water =water + (rightmax -height[right]);
            right--;
        }
        else{
            water =water + ( leftmax -height[left]);
            left++;
        }

        }
        return water;
    }
}