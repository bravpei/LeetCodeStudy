package string;

public class ReverseString {
    public void solve(char[] s) {
        int i=0,j=s.length-1;
        char a;
        while(i<=j){
            a=s[i];
            s[i]=s[j];
            s[j]=a;
            i++;
            j--;
        }
    }
}
