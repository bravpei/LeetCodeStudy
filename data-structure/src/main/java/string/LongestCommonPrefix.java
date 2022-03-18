package string;

public class LongestCommonPrefix {
    public String solve(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String prefix=strs[0];
        int num=0;
        while(true){
            for (String str : strs) {
                if (num >= str.length()||prefix.charAt(num) != str.charAt(num)) {
                    return prefix.substring(0, num);
                }
            }
            num++;
        }
    }
}
