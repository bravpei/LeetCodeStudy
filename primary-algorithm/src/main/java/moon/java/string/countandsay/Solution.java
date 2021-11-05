package moon.java.string.countandsay;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(5));
    }
    public String countAndSay(int n) {
        String seq="1";
        for(int i=0;i<n-1;i++){
            StringBuilder say= new StringBuilder();
            int index=0;
            for(int j=0;j<seq.length();j++){
                if(seq.charAt(index)!=seq.charAt(j)){
                    say.append(j - index);
                    say.append(seq.charAt(index));
                    index=j;
                }
            }
            say.append(seq.length() - index);
            say.append(seq.charAt(index));
            seq= say.toString();
        }
        return seq;
    }
}
