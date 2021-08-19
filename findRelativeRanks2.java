class Solution {
    public String[] findRelativeRanks(int[] score) {
         HashMap<Integer,String> map = new HashMap<>();
        int L = score.length;
        int a[] = new int[L];
        int u=0;
        for(int b:score){
            a[u]=b;
            u++;
        }        
        Arrays.sort(a);
        String[] s={"Gold Medal","Silver Medal","Bronze Medal","4","5"};
        int index=0,v=6;
        for(int i=L-1;i>=0;i--){                
            if(index<=4){
                map.put(a[i],s[index]);
            }            
            else if(index>4){
                map.put(a[i],Integer.toString(v));
                v++;
            }
            index++;
            
        }
        String[] result = new String[score.length];
        for(int i=0;i<L;i++){
            result[i]=map.get(score[i]);
        }
        return result;
    }
}
