class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        HashMap<Integer, Boolean> rows = new HashMap<>();
        HashMap<Integer, Boolean> cols = new HashMap<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    rows.put(i, true);
                    cols.put(j, true);
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(rows.containsKey(i) || cols.containsKey(j)){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}