public class Solution {
    public int islandPerimeter(int[][] grid) {
        int rl=grid.length, cl=grid[0].length;
        int res=0;
        for(int i=0;i<rl;i++){
            for(int j=0;j<cl;j++){
                if(grid[i][j]==1){
                    //up
                    if(i-1<0||grid[i-1][j]==0) res++;
                    //down
                    if(i+1>rl-1||grid[i+1][j]==0) res++;
                    //left
                    if(j-1<0||grid[i][j-1]==0) res++;
                    //right
                    if(j+1>cl-1||grid[i][j+1]==0) res++;
                }
            }
        }
        return res;
    }
}
