package others;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class CanVisitAllRooms {
    public boolean solve(List<List<Integer>> rooms) {
        Stack<Integer> stack=new Stack<>();
        Set<Integer> visited=new HashSet<>();
        stack.push(0);
        while(!stack.empty()){
            int num=stack.pop();
            visited.add(num);
            for(int n:rooms.get(num)){
                if(!visited.contains(n)){
                    stack.push(n);
                }
            }
        }
        return visited.size()== rooms.size();
    }
}
