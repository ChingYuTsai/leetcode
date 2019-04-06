import java.util.HashSet;

public class HappyNumber_202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sqr, remain;
        while(set.add(n)){
            sqr = 0;
            while(n > 0){
                remain = n % 10;
                sqr += remain * remain;
                n /= 10;
            }
            if(sqr == 1)
                return true;
            n = sqr;
        }
        return false;
    }
}
