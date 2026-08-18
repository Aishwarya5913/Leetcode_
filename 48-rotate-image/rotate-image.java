class Solution {
    public void rotate(int[][] matrix) {
        int i,j,n,temp=0;
        n = matrix.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                temp = matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n/2;j++){
                temp = matrix[i][n-1-j];
                matrix[i][n-1-j]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}