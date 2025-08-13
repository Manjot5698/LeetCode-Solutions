/* 📌Problem: https://leetcode.com/problems/contains-duplicate?envType=problem-list-v2&envId=sorting
     Difficulty:Easy
     🎯 Approach: Sort and Compare Adjacent Elements

     ⏱ Time Complexity: O(nlogn), Space Complexity: O(1)*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}