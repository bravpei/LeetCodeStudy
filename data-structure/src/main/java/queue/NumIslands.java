package queue;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class NumIslands {
    public int solution(char[][] grid){
        int length=grid.length;
        int width=grid[0].length;
        int count=0;
        for(int i=0;i<length;i++){
            for (int j=0;j<width;j++){
                if(grid[i][j]=='1'){
                    Queue<int[]> queue= new LinkedList<>();
                    queue.offer(new int[]{i,j});
                    count++;
                    while(true){
                        int[] coordinate=queue.poll();
                        if(Objects.isNull(coordinate)){
                            break;
                        }else {
                            int ii=coordinate[0];
                            int jj=coordinate[1];
                            grid[coordinate[0]][coordinate[1]]='0';
                            if(ii-1>=0&&grid[ii-1][jj]=='1'){
                                queue.offer(new int[]{ii-1,jj});
                            }
                            if(jj-1>=0&&grid[ii][jj-1]=='1'){
                                queue.offer(new int[]{ii,jj-1});
                            }
                            if(ii+1<length&&grid[ii+1][jj]=='1'){
                                queue.offer(new int[]{ii+1,jj});
                            }
                            if(jj+1<width&&grid[ii][jj+1]=='1'){
                                queue.offer(new int[]{ii,jj+1});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
