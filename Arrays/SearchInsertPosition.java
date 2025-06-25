/* 📌Problem: https://leetcode.com/problems/search-insert-position?envType=problem-list-v2&envId=array
     Difficulty:Easy
     🎯 Approach: Binary Search(goal is to get O(log n) time complexity)
     ⏱ Time Complexity: O(log n), Space Complexity: O(1)*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high =nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                high =mid-1;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }

        }
        return low;
    }
}