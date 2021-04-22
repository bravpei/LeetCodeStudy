package moon.java.isanagram;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] a=new int[26];
        int[] b=new int[26];
        char[] chrA=s.toCharArray();
        char[] chrB=t.toCharArray();
        for(int i=0;i<t.length();i++){
            a[chrA[i]-'a']++;
            b[chrB[i]-'a']++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
