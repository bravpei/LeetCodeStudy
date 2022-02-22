package stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] solution(int[] temperatures){
        int[] answer=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=1;i<temperatures.length;i++){
            while (true){
                int top=stack.peek();
                if(temperatures[i]>temperatures[top]){
                    answer[top]=i-top;
                    stack.pop();
                    if(stack.size()>0)
                    continue;
                }
                stack.push(i);
                break;
            }
        }
        return answer;
    }
}
