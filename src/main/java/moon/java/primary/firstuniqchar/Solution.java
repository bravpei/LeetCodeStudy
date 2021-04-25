package moon.java.primary.firstuniqchar;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int firstUniqChar(String s) {
        Set<String> set=new HashSet<String>();
        for(int i=0;i<s.length();i++){
            int j;
            for(j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    set.add(String.valueOf(s.charAt(i)));
                    break;
                }
            }
            if(j>=s.length()&&!set.contains(String.valueOf(s.charAt(i)))){
                return i;
            }
        }
        return -1;
    }
}
