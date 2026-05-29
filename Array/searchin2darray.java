class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int m = matrix.length;
        
        int sr = 0;
        int er = m-1;

        while(sr<=er){
            int mid = sr + ((er-sr)/2);
            if(matrix[mid][0] <= target && target <= matrix[mid][n-1]){
                int sc = 0;
                int ec = n-1;
                while(sc<=ec){
                    int mid1 = sc + ((ec-sc)/2);
                    if(matrix[mid][mid1] == target){
                        return true;
                    } else if(target < matrix[mid][mid1]){
                        ec = mid1 -1;
                    } else if(target > matrix[mid][mid1]){
                        sc = mid1+1;
                    }
                }
                return false;
                
            } else if(target < matrix[mid][0]){
                er = mid -1;
            } else if( target > matrix[mid][n-1]){
                sr = mid +1;
            }
        }

        return false;
    }
}