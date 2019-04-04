import java.util.Arrays;

public class NRepeated_961 {
    public static int repeatedNTimes(int[] A) {
        int result=0;
        int n = A.length/2;
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++){
            if(i <= n && A[i+n-1] == A[i])
                result=A[i];
        }
        return result;
    }

    public static int repeatedNTimes1(int[] A) {
        int i = (int) (Math.random() * A.length);
        int j = (int) (Math.random() * A.length);

        while (i == j || A[i] != A[j]) {
            j = (int) (Math.random() * A.length);
            i = (int) (Math.random() * A.length);
        }
        return A[i];
    }

    public static int repeatedNTimes2(int[] A) {
        int[] count = new int[10000];
        for (int a : A)
            if (count[a]++ == 1)
                return a;
        return -1;
    }

    public static int repeatedNTimes3(int[] A) {
        for (int i = 2; i < A.length; ++i)
            if (A[i] == A[i - 1] || A[i] == A[i - 2])
                return A[i];
        return A[0];
    }

    public static void main(String[] args){
        int[] A = new int[]{5,1,2,5,5,3,5,4};
        System.out.println(repeatedNTimes(A));
    }
}
