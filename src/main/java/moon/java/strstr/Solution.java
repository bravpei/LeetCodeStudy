package moon.java.strstr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        int length=needle.length();
        for(int i=0;i<haystack.length();i++){
            if(i+length>haystack.length()){
                return -1;
            }
            String sub=haystack.substring(i,i+length);
            if(sub.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
