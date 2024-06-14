Question : https://leetcode.com/problems/count-primes/description/
Code :
class Solution {
    public int countPrimes(int n) {
       if(n<2){
        return 0;
       }
       int Prime[] = new int [n];
       for(int i=2;i<n;i++){
         // Initially mark all numbers as prime (1)
        Prime[i]=1;
       }
       for(int i=2;i*i<n;i++){
        if(Prime[i]==1){
          // Mark multiples of i as non-prime (1)
            for(int j=i*i;j<n;j+=i){
                Prime[j]=0;
            }
        }
       }
       int c=0;
       for(int i=2;i<n;i++){
        if(Prime[i]==1){
            c++;
        }
       }
       return c;
    }
}
