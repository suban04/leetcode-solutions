
class Solution {
    public int reverseDegree(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            int reversePosition = 26 - (ch - 'a');

            int stringPosition = i + 1;

            int product = reversePosition * stringPosition;

            sum = sum + product;
        }

        return sum;
    }
}
