class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;

        int diagonal_sum=0;

        for(int i=0;i<n;i++){
         diagonal_sum+=mat[i][i];
         diagonal_sum+=mat[i][n-1-i]; 
        }
        
        if(n%2==1){
          diagonal_sum-=mat[n/2][n/2];
        }
        return diagonal_sum;
    }
}