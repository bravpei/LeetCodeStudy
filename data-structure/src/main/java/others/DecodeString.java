package others;

import java.util.Stack;

public class DecodeString {
    public String solve(String s){
        Stack<Integer> numStack=new Stack<>();
        Stack<StringBuilder> resStack=new Stack<>();
        StringBuilder res=new StringBuilder();
        int num=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+c-'0';
            }else if(c=='['){
                numStack.push(num);
                resStack.push(res);
                res=new StringBuilder();
                num=0;
            }else if(c==']'){
                StringBuilder pre=resStack.pop();
                int n= numStack.pop();
                for(int i=0;i<n;i++){
                    pre.append(res);
                }
                res=pre;
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
