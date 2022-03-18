package others;

import java.util.ArrayList;
import java.util.List;

public class GetRow {
    public List<Integer> solve(int rowIndex) {
        List<Integer> old=new ArrayList<>();
        List<Integer> row=new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
            old.clear();
            old.addAll(row);
            row.clear();
            for(int j=0;j<i+1;j++){
                if(j==0){
                    row.add(1);
                    continue;
                }
                if(j==i){
                    row.add(1);
                    continue;
                }
                row.add(old.get(j-1)+old.get(j));
            }
        }
        return row;
    }
}
