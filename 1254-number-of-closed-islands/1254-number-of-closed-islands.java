class Solution {
    public boolean dfs(int[][] grid, int r, int c, int m, int n){

        if(r<0 || r>=m || c<0 || c>=n){
            return false;
        }

        if(grid[r][c] == 1){
            return true;
        }

        grid[r][c] = 1;

        boolean right = dfs(grid, r, c+1, m, n);
        boolean left = dfs(grid, r, c-1, m, n);
        boolean up = dfs(grid, r-1, c, m, n);
        boolean down = dfs(grid, r+1, c, m, n);

        return right && left && up && down;
    }
    public int closedIsland(int[][] grid) {

        int count = 0;
        int m = grid.length;
        int n = grid[0].length;

        for(int r=0; r<m; r++){
            for(int c=0; c<n; c++){
                if(grid[r][c] == 0){
                    if(dfs(grid, r, c, m, n)){
                        count++;
                    }
                }
            }
        }

        return count;
        
    }
}