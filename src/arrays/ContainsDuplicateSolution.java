/* 📌Problem: https://leetcode.com/problems/contains-duplicate?envType=problem-list-v2&envId=sorting
     Difficulty:Easy
     🎯 Approach: Sort and Compare Adjacent Elements

     ⏱ Time Complexity: O(nlogn), Space Complexity: O(1)*/
package arrays;

import java.util.Arrays;

public class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // ✅ Test driver
    public static void main(String[] args) {
        ContainsDuplicateSolution sol = new ContainsDuplicateSolution();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};

        System.out.println(sol.containsDuplicate(nums1)); // false
        System.out.println(sol.containsDuplicate(nums2)); // true
    }
}
