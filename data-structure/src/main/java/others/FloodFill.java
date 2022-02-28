package others;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class FloodFill {
    public int[][] solve(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        int length = image.length;
        int wide = image[0].length;
        queue.offer(sr * wide + sc);
        while (!queue.isEmpty()) {
            int num = queue.poll();
            int l = num / wide;
            int w = num % wide;
            image[l][w] = newColor;
            visited.add(num);
            num = (l - 1) * wide + w;
            if (l - 1 >= 0 && !visited.contains(num)) {
                if (image[l - 1][w] == oldColor) {
                    queue.offer(num);
                }
                visited.add(num);
            }
            num = l * wide + w + 1;
            if (w + 1 < wide && !visited.contains(num)) {
                if(image[l][w+1]==oldColor){
                    queue.offer(num);
                }
                visited.add(num);
            }
            num = (l + 1) * wide + w;
            if (l + 1 < length && !visited.contains(num)) {
                if(image[l+1][w]==oldColor){
                    queue.offer(num);
                }
                visited.add(num);
            }
            num = l * wide + w - 1;
            if (w - 1 >= 0 && !visited.contains(num)) {
                if(image[l][w-1]==oldColor){
                    queue.offer(num);
                }
                visited.add(num);
            }
        }
        return image;
    }
}
