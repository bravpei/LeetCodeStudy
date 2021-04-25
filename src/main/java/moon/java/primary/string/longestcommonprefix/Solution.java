package moon.java.primary.string.longestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for (int i=1;i<strs.length;i++){
            String match=strs[i];
            int j=0;
            while(j<match.length()&&j<prefix.length()){
                if(prefix.charAt(j)!=match.charAt(j)){
                    break;
                }
                j++;
            }
            prefix=prefix.substring(0,j);
            if(prefix.equals("")){
                return prefix;
            }
        }
        return prefix;
    }
}
