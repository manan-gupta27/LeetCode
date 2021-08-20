class Solution {
    public int[] findErrorNums(int[] nums) {
         int[] array = new int[nums.length+1];
        for(int i = 0; i < nums.length; i++){
            array[nums[i]]++;
        }
        int repeatedNumber = 0;
        int missingNumber = 0;
        int index = 0;
        for(int count : array){
            if(count == 0)
                missingNumber = index;
            if(count == 2)
                repeatedNumber = index;
            index++;
        }
        return new int[]{repeatedNumber, missingNumber};
    }
}
