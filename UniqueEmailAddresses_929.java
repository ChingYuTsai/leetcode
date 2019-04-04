import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses_929 {
    public static int numUniqueEmails(String[] emails) {
        Set<String> result = new HashSet<>();
            for (String email : emails){
                String[] split = email.split("@");
                String without = split[0].split("\\+")[0].replaceAll("\\.", "");
                String after = without + "@" + split[1];
                result.add(after);
            }
        return result.size();
    }

    public static void main(String[] args){
        String[] input = new String[] {"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(input));
    }
}
