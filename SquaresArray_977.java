import java.lang.reflect.Array;
import java.util.Arrays;

public class SquaresArray_977 {
    public static int[] sortedSquares(int[] A) {
        int result[] = new int[A.length];
        for(int i = 0; i < A.length; i++){
            result[i] = Math.abs(A[i]) * Math.abs(A[i]);
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args){
        int[] A = new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(A)));
    }
}
