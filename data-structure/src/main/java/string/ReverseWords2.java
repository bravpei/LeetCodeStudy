package string;

public class ReverseWords2 {
    public static String solve(String s) {
        int slow=0,quick=0,tem=0;
        String ret="";
        while(quick<s.length()){
            if(quick==s.length()-1||s.charAt(quick+1)==' '){
                tem=quick+2;
                while (quick>=slow){
                    ret+=s.charAt(quick--);
                }
                ret+=' ';
                slow=tem;
                quick=slow;
            }else {
                quick++;
            }
        }
        return ret.substring(0,ret.length()-1);
    }

    public static void main(String[] args) {
        solve("Let's take LeetCode contest");
    }
}
