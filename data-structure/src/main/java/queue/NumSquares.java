package queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumSquares {
    public int solution(int n) {
        Queue<Integer> queue = new LinkedList<>();
        int level = 0;
        queue.offer(n);
        while (!queue.isEmpty()) {
            int length = queue.size();
            while (length-- > 0) {
                int i = 1;
                int num = queue.poll();
                if(isSquares(num)){
                    return ++level;
                }
                while (true) {
                    int square = i * i;
                    if (num - square < square) {
                        break;
                    }
                    queue.offer(num - square);
                    i++;
                }
            }
            level++;
        }
        return level;
    }

    private boolean isSquares(int n) {
        int i = 1;
        while (true) {
            if (i * i == n) {
                return true;
            }
            if (i * i > n) {
                return false;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new NumSquares().solution(12));
    }
}
