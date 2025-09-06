/* 📌Problem: https://leetcode.com/problems/search-insert-position?envType=problem-list-v2&envId=array
     Difficulty:Easy
     🎯 Approach: Binary Search(goal is to get O(log n) time complexity)
     ⏱ Time Complexity: O(log n), Space Complexity: O(1)*/
package arrays;

public class SearchInsertSolution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    // ✅ Test driver
    public static void main(String[] args) {
        SearchInsertSolution sol = new SearchInsertSolution();

        int[] nums = {1, 3, 5, 6};

        System.out.println(sol.searchInsert(nums, 5)); // 2
        System.out.println(sol.searchInsert(nums, 2)); // 1
        System.out.println(sol.searchInsert(nums, 7)); // 4
        System.out.println(sol.searchInsert(nums, 0)); // 0
    }
}
