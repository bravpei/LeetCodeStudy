package moon.java;

public class LengthOfLongestSubstring3 {
    public static int lengthOfLongestSubstring(String s) {
        String son="";
        int length=0;
        for(int i=0;i<s.length();i++){
            if(!son.contains(String.valueOf(s.charAt(i)))){
                son+=s.charAt(i);
                length=length>son.length()?length:son.length();
            }else {
                String str=String.valueOf(s.charAt(i));
                son=son.substring(son.indexOf(str)+1);
                son+=s.charAt(i);
            }
        }
        return length;
    }
    public static void main(String[] args){
        int num=lengthOfLongestSubstring("abcabcbb");
        System.out.println(num);
    }
}
