/* Date: 15/08/2025
📌Problem: https://leetcode.com/problems/binary-search
     Difficulty:Easy
     🎯 Approach: Recursively divide the search range in half until the target is found or the range becomes empty:

     ⏱ Time Complexity: O(logn), Space Complexity: O(logn)*/


class Solution {
    public int binSearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return binSearch(arr, target, start, mid - 1); // Search left half
        } else {
            return binSearch(arr, target, mid + 1, end); // Search right half
        }
    }

    public int search(int[] arr, int target) {
        return binSearch(arr, target, 0, arr.length - 1);
    }
}
