import java.util.HashSet;

public class ExcelSheetColumnNumber_171 {
    public int titleToNumber(String s) {
        if(s == null || s.length() == 0) return 0;
        char[] ca = s.toCharArray();
        int total = 0;
        for (int i = 0; i < ca.length; i++){
            total = total + (int)((ca[ca.length-1-i]-64) * Math.pow(26, i));
        }
        HashSet<Character>  set = new HashSet<>();
        return total;
    }
}
