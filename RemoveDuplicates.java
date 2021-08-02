class Solution {
    public int removeDuplicates(int[] nums) {
         int length = nums.length;
        
        if(length == 0)
            return 0;
        
        int i;
        int targetIndex = 1;
        int OG = nums[0];
        
        for(i = 1; i < length; i++){
            
            if(nums[i] != OG){
                
                OG = nums[i];
                nums[targetIndex] = nums[i];
                targetIndex++;
            }
        }
        
        return targetIndex;
    }
}
