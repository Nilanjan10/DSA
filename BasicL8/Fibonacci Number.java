Question : https://leetcode.com/problems/fibonacci-number/description/
Code : 
class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int sum=0;
        if(n<=1){
            return n;
        }
        for(int i=1;i<n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}
