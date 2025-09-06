/* 📌Problem: https://leetcode.com/problems/missing-number?envType=problem-list-v2&envId=sorting
     Difficulty:Easy
     🎯 Approach: Sum Formula Method (O(n) Time, O(1) Space)

     ⏱ Time Complexity: O(n), Space Complexity: O(1)*/
package arrays;

public class MissingNumberSolution {
    public int missingNumber(int[] nums) {
        int expectedSum = (nums.length * (nums.length + 1)) / 2;
        int actualSum = 0;

        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }

    // ✅ Test driver
    public static void main(String[] args) {
        MissingNumberSolution sol = new MissingNumberSolution();

        int[] nums1 = {3, 0, 1};       // missing = 2
        int[] nums2 = {0, 1};          // missing = 2
        int[] nums3 = {9,6,4,2,3,5,7,0,1}; // missing = 8

        System.out.println(sol.missingNumber(nums1)); // 2
        System.out.println(sol.missingNumber(nums2)); // 2
        System.out.println(sol.missingNumber(nums3)); // 8
    }
}
