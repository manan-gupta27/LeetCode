class Solution {
    public int missingNumber(int[] nums) {
         int diff = 0;
        for (int i = 0; i < nums.length; i++) {
            diff += nums[i] - i;
        }
        return nums.length - diff;   
    }
}
