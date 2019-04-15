public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        int position = digits.length - 1;
        int[] res = digits;
        while(position >= 0 && digits[position] == 9){
            digits[position] = 0;
            position --;
        }
        if(position == -1){
            res = new int[digits.length + 1];
            res[0] = 1;
        }else{
            res[position] ++;
        }
        return res;
    }
}
