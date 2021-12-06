package queue;

import org.junit.Test;

public class NumIslandsTest {
    @Test
    public void solution() {
        NumIslands numIslands=new NumIslands();
        char[][] grid=new char[][]{{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        numIslands.solution(grid);
    }
}
