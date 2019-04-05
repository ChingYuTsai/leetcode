import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            ArrayList<Integer> inner = new ArrayList<>();
            inner.add(0, 1);
            if(i > 2){
                List<Integer> last = res.get(i-2);
                for(int j = 1; j < i-1; j++){
                    inner.add(j, last.get(j-1) + last.get(j));
                }
            }
            if(i > 1)
                inner.add(i-1, 1);
            res.add(inner);
        }
        return res;
    }
}
