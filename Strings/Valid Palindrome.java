Question : https://leetcode.com/problems/valid-palindrome/description/
Code : 
class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i=0;i<s.length()/2;i++){
            if(s.isEmpty()){
                return true;
            }
            char start=s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            
            if(start!=end){
                return false;
            
            }
        }
        return true;
    }
}
