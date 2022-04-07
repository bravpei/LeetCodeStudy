package array;

public class Rotate {
    public void solve(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int temp;
        //先对角线翻转
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //中垂线翻转
        for(int i=0;i<m;i++){
            for(int j=0;j<n/2;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
}
