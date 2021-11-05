package moon.java.string.reversestring;

public class Solution {
    public void reverseString(char[] s) {
        int length=s.length/2+s.length%2;
        char v;
        for(int i=0;i<length;i++){
            v=s[s.length-i-1];
            s[s.length-i-1]=s[i];
            s[i]=v;
        }
    }
}
