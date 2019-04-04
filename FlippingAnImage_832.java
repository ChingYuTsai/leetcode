import java.util.Arrays;

public class FlippingAnImage_832 {
    public static int[][] flipAndInvertImage(int[][] A) {

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < (A[i].length)/2; j++){
                int temp = A[i][j];
                A[i][j] = A[i][A[i].length-1-j];
                A[i][A[i].length-1-j] = temp;
            }
            System.out.println(Arrays.toString(A[i]));
            for(int m = 0; m < A[i].length; m++){
                if (A[i][m] == 0)
                    A[i][m] = 1;
                else
                    A[i][m] = 0;
            }
        }
        return A;
    }

    public static void main(String[] args){
        int[][] A = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(A)));
    }
}
