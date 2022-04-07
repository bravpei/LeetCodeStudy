package others;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> solve(int numRows) {
        List<List<Integer>> yang = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            yang.add(new ArrayList<>());
            for(int j=0;j<i+1;j++){
                if(j==0){
                    yang.get(i).add(1);
                    continue;
                }
                if(j==i){
                    yang.get(i).add(1);
                    continue;
                }
                yang.get(i).add(yang.get(i-1).get(j-1)+yang.get(i-1).get(j));
            }
        }
        return yang;
    }
}
