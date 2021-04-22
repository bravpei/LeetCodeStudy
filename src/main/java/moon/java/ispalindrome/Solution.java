package moon.java.ispalindrome;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aa"));
    }
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while (i <= j) {
            if (isAlphabetOrNumber(s.charAt(i))) {
                i++;
                continue;
            }
            if (isAlphabetOrNumber(s.charAt(j))) {
                j--;
                continue;
            }
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
   static boolean isAlphabetOrNumber(char c){
        if('0'<=c&&c<='9'||'a'<=c&&c<='z'||'A'<=c&&c<='Z')
            return false;
        else
            return true;
    }
}