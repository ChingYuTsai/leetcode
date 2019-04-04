public class ToLowerCase_709 {
    public static String toLowerCase(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            int item = str.charAt(i);
            if(item >= 65 && item <= 90)
                result += (char) (item + 32);
            else
                result += (char) (item);
        }
        return result;
    }

    public static void main(String[] args){
        String str = "HeLlo";
        System.out.println(toLowerCase(str));
    }
}
