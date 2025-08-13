/* 📌Problem: https://leetcode.com/problems/missing-number?envType=problem-list-v2&envId=sorting
     Difficulty:Easy
     🎯 Approach: Sum Formula Method (O(n) Time, O(1) Space)

     ⏱ Time Complexity: O(n), Space Complexity: O(1)*/
class Solution {
    public int missingNumber(int[] nums) {
        int expctedsum= ((nums.length)*(nums.length+1)/2);
        int missingsum = 0;
        for (int i =0;i<nums.length;i++){
            missingsum +=nums[i];
        }
        int missing = expctedsum-missingsum;
        return missing;
    }
}