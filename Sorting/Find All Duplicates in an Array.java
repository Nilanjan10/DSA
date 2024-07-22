Question : https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
Code : 
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int ind = Math.abs(nums[i]) - 1; 
            if (nums[ind] < 0) {
                duplicates.add(ind + 1); 
            } else {
                nums[ind] = -nums[ind];
            }
        }
        return duplicates;
    }
}
