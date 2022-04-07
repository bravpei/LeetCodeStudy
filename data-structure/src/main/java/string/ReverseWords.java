package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ReverseWords {
    public String solve(String s) {
        char[] chars=s.toCharArray();
        List<String> fields=new ArrayList<>();
        StringBuilder ret=new StringBuilder();
        String field="";
        for (char aChar : chars) {
            if (aChar != ' ') {
                field+=aChar;
            } else {
                if(!field.equals("")){
                    fields.add(field);
                    field="";
                }
            }
        }
        if(field!=""){
            fields.add(field);
        }
        Collections.reverse(fields);
        for(String str:fields){
            ret.append(str).append(" ");
        }
        return ret.substring(0,ret.length()-1);
    }
}
