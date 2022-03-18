package array;

import java.util.HashSet;
import java.util.Set;

public class SetZeroes {
    public void solve(int[][] matrix) {
        Set<Integer> rows=new HashSet<>();
        Set<Integer> columns=new HashSet<>();
        int row=matrix.length;
        int column=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for(int n:rows){
            for(int k=0;k<column;k++){
                matrix[n][k]=0;
            }
        }
        for(int n:columns){
            for(int k=0;k<row;k++){
                matrix[k][n]=0;
            }
        }
    }
}
