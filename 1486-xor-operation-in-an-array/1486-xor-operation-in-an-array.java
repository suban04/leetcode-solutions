class Solution {
    public int xorOperation(int n, int start) {
        int count =0 ;
        int Xor_result =0;
        for(int  i =start ;count<n ;i+=2){
                Xor_result ^=i;
                count ++;
        }
        return  Xor_result ;
    }
}