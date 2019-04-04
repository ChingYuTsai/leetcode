import java.util.Arrays;

public class ReverseString_344 {
    public static void reverseString(char[] s) {
        int n = s.length / 2;
        for(int i = 0; i < n; i++){
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
    }

    public static void main(String[] args){
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
