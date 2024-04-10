Question : https://leetcode.com/problems/power-of-two/description/
Code : 
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1)return true;
        if(n<1) return false;
        while(n>1){
            if(n%2 != 0){
                return false;
            }
            n = n/2;
        }
        return true;
    }
}
