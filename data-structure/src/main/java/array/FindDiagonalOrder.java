package array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class FindDiagonalOrder {
    public static int[] solve(int[][] mat) {
        int[] ret = new int[mat.length * mat[0].length];
        List<List<Integer>> arrays=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int a=i+j;
                int v=mat[i][j];

            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] mat=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        solve(mat);
    }
}
