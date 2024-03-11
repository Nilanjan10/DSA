Question : https://leetcode.com/problems/reverse-integer/description/
Code :
class Solution {
    public int reverse(int x) {
        int ans = 0; 

        while (x != 0) { 
            int last = x % 10; 
            int newResult = ans * 10 + last; 
            if ((newResult - last) / 10 != ans) { 
                return 0; 
            }
            ans = newResult; 
            x = x / 10; 
        }

        return ans;
    }
}
