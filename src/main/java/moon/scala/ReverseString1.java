package moon.scala;

public class ReverseString1 {
    public String reverseString(String s) {
        StringBuffer sb=new StringBuffer();
        int l=s.length()-1;
        while(l>=0){
            sb.append(s.charAt(l));
            l--;
        }
        return sb.toString();
    }
}
