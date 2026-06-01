class Solution {
    public int diagonalSum(int[][] mat) {
        int pd = 0;
        int sd = 0;
        for(int i=0; i<mat.length; i++){
            //pd
            pd += mat[i][i];
            pd += mat[i][mat.length-i-1];

        }
        if(mat.length%2 !=0){
            int mid = mat.length/2;
            pd = pd - mat[mid][mid];
        }
        
        return pd;
    }
}