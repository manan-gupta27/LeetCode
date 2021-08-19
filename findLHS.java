class Solution {
    public int findLHS(int[] nums) {
         
         HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
      int c=0,max=0;
	  //count frequency of all the elements
      for(int i=0;i<nums.length;i++)
      {
    	  if(!map.containsKey(nums[i]))
    	  {
    		  c=1;
    		  map.put(nums[i], c);
    	  }
    	  else
    	  {
    		  c=map.get(nums[i]);
    		  c++;
    		  map.put(nums[i], c);
    	  }
      }
	  //check if the elements present in hashmap have difference one,if yes add their frequencies
      for(int i:map.keySet())
      {
    	  if(map.containsKey(i+1))
    	  {
    		  max=Math.max(max, map.get(i)+map.get(i+1));
    	  }
      }
       return max; 
    }
}
