class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        
      if (n == 0)
         return 0;
        
      Arrays.sort(nums);
      int ans = 0;
      for (int i = 0; i < n; i++) {
         ans += nums[i] - nums[0];
      }
      return ans;
    }
}
