import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidAnagram_242 {
    public static boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++) count[s.charAt(i) - 'a']++;
        for(int i = 0; i < t.length(); i++) count[t.charAt(i) - 'a']--;
        for(int index : count) if(index != 0) return false;
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) return false;
        ArrayList<String> sa = new ArrayList<>(Arrays.asList(s.split("")));
        ArrayList<String> ta = new ArrayList<>(Arrays.asList(t.split("")));
        for(int i = 0; i < sa.size(); i++){
            String test = sa.get(i);
            if(ta.lastIndexOf(test) != -1) ta.remove(test);
        }
        return ta.size() == 0 ? true : false;
    }

    public static void main(String[] args){
        System.out.println(isAnagram2("我是誰","我是誰"));
    }
}
