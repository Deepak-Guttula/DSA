1class Solution {
2  public int lengthOfLongestSubstring(String s) {
3    int ans = 0;
4    int[] count = new int[128];
5
6    for (int l = 0, r = 0; r < s.length(); ++r) {
7      ++count[s.charAt(r)];
8      while (count[s.charAt(r)] > 1)
9        --count[s.charAt(l++)];
10      ans = Math.max(ans, r - l + 1);
11    }
12
13    return ans;
14  }
15}