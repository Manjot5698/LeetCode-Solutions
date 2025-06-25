/*
    LongestCommonPrefix
 📌 Problem: https://leetcode.com/problems/longest-common-prefix?envType=problem-list-v2&envId=string
 Difficulty: Easy
🎯 Approach: finding shortest element of strs because it is the largest possible prefix.
⏱ Time Complexity: O(M*N), Space Complexity: O(1)
*/



class Solution {
    public String longestCommonPrefix(String[] strs) {
        String shortest =strs[0];
        for(int i = 1; i<strs.length;i++){
            if(strs[i].length()<shortest.length()){
                shortest= strs[i];
            }
        }
        for (int i = 0; i < shortest.length(); i++) {
            char c = shortest.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {`
                    return shortest.substring(0, i);
                }
            }
        }