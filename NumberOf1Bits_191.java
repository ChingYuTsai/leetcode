public class NumberOf1Bits_191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 31; i >= 0; i--){
            int n1 = n;
            if(((n1 >> i) & 1) == 1) count++;
        }
        return count;
    }
}
