class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i =0;
        while(i<matrix.length){
            if (target<=matrix[i][matrix[i].length-1]){
                int[] a = matrix[i];
                int l = 0;
                int r = a.length-1;
                while (l<=r){
                    int mid = (l+r)/2;
                    if (target == matrix[i][mid]){
                        return true;
                    }
                    else if (target<matrix[i][mid]){
                        r=mid-1;
                    }
                    else{
                        l=mid+1;
                    }
                }
                return false;
            }
            else{
                i++;
            }
        }
        return false;
        
    }
}
