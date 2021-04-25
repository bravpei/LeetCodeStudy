package moon.java.primary.string.myatoi;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("  012345678"));
    }

    public int myAtoi(String s) {
        s = s.trim();
        StringBuilder sb=new StringBuilder();
        boolean start=false;
        for(int i=0;i<s.length();i++){
            if(start){
                if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    sb.append(s.charAt(i));
                    continue;
                }else {
                    break;
                }
            }
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                sb.append(s.charAt(i));
                start=true;
            }else if(s.charAt(i)=='-'||s.charAt(i)=='+'){
                sb.append(s.charAt(i));
                start=true;
            }else {
                break;
            }

        }
        if(sb.length()<=0){
            return 0;
        }else if(sb.length()==1){
            if(sb.charAt(0)<='0'||sb.charAt(0)>='9'){
                return 0;
            }else {
                return Integer.parseInt(sb.toString());
            }
        }else {
            try {
                return Integer.parseInt(sb.toString());
            }catch (Exception e){
                if(sb.charAt(0)=='-'){
                    return Integer.MIN_VALUE;
                }else {
                    return Integer.MAX_VALUE;
                }
            }
        }
    }
}
