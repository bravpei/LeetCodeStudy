package moon.java.reverse;

public class Solution {
    public int reverse(int x) {
        int y=x>0?x:-x;
        String s=String.valueOf(y);
        StringBuilder b= new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            b.append(s.charAt(i));
        }
        try{
            y=Integer.parseInt(b.toString());
            y=x>0?y:-y;
        }catch (Exception e){
            y=0;
        }
        return y;
    }
}
