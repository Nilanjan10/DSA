Question : https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
Code : 
class Solution {
   public char nextGreatestLetter(char[] exarr, char targetEl) {
            //Same BSA approach in ceiling is here but we dont need if conditon (target=mid element) as question asks only smallest letter greater than target
            //In the beginning always index of start=0 and end=array.length-1
            int start=0;
            int end=exarr.length-1;
            //There are no characters in letters that is lexicographically greater than target means target is greater than or equal to the highest index(beginning end index or array.length-1 index) so we return letters[0].
            if(targetEl>=exarr[end]){
                return exarr[0];
            }

            //Already given that array is sorted in ascending order. So, no need to do order agnostic BSA
            //We only need to binary search the array till start<=end
            while (start<=end){
            /*Calculate middle element index 'mid'
            *]mid=(start+end)/2 is correct but a problem may occur when we consider larger arrays which big start,end which causes
              to exceed the range of 'int' when we do start+end in mid claculation.
            *]So,we can alternatively use mid=start+(end-start)/2 which gives the same answer by doing end-start here in calc we dont exceed int range */
                int mid=start+(end-start)/2;

                //Compare target element with mid element exarr[mid]
                //we dont need if conditon (target=mid element) as question asks only smallest letter greater than target
                if (targetEl < exarr[mid]) {
                    //if targetEl < exarr[mid] then search left side by updating end. end= mid-1
                    end=mid-1;
                }
                else {
                    //if targetEl>exarr[mid] then seearch right side by updating start.  start=mid+1
                    start=mid+1;
                }
            }
            //We need the element just greater than target not equal to. THis happens when s=e is crossed and while loop is exited by now updated start index start=end+1.
            //So we get the next just greater element at now updated start. SO print element at updated start
            return exarr[start];
        }
}
