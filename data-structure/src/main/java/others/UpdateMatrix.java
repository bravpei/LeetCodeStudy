package others;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class UpdateMatrix {
    public int[][] solve(int[][] mat){
        int m= mat.length,n=mat[0].length;
        int[][] ret=new int[m][n];
        Queue<String> queue=new ArrayDeque<>();
        Set<String> visited=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                queue.offer(i+":"+j);
                int count=0;
                while(!queue.isEmpty()){
                    int l=queue.size();
                    for(int x=0;x<l;x++){
                        String num=queue.poll();
                        int a=Integer.parseInt(num.split(":")[0]),b=Integer.parseInt(num.split(":")[1]);
                        if(mat[a][b]==0){
                            ret[i][j]=count;
                            queue.clear();
                            visited.clear();
                            break;
                        }
                        visited.add(num);
                        num=(a-1)+":"+b;
                        if(a>0&&!visited.contains(num)){
                            queue.offer(num);
                        }
                        num=a+":"+(b+1);
                        if(b+1<n&&!visited.contains(num)){
                            queue.offer(num);
                        }
                        num=(a+1)+":"+b;
                        if(a+1<m&&!visited.contains(num)){
                            queue.offer(num);
                        }
                        num=a+":"+(b-1);
                        if(b>0&&!visited.contains(num)){
                            queue.offer(num);
                        }
                    }
                    count++;
                }
            }
        }
        return ret;
    }
}
