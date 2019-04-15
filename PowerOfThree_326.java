public class PowerOfThree_326 {
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return ( n > 0 && 1162261467 % n == 0);
    }

    public boolean isPowerOfThree2(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }

    public boolean mySolution(int n) {
        if(n == 0) return false;
        int remain = n;
        while(remain % 3 == 0) remain /= 3;
        return remain == 1 ? true : false;
    }
}
