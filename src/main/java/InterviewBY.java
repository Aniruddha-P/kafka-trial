import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class InterviewBY {

    public static void main(String[] args) {

    }





















    /*------------------------Interview 1-----------------------------*/
    public static String longestSubStringCharacter(String s) {
        StringBuilder longestSubString = new StringBuilder();
        Set<Character> set = new HashSet<>(s.length());
        int i=0, j=0;
        for(j=0; j<s.length(); j++) {
            Character charAtJ = s.charAt(j);
            if(!set.contains(charAtJ)) {
                set.add(charAtJ);
            }else {
                if(longestSubString.length()<(j-i)) {
                    longestSubString.delete(0, longestSubString.length());
                    longestSubString.append(s.substring(i,j));
                }
                set.clear();
                set.add(charAtJ);
                i=j;
            }
        }
        return longestSubString.toString();
    }



    public static String longestSubString(String s) {
        String lss= "";
        Set<String> set = new LinkedHashSet<>();
        int i=0;
        int j=1;
        set.add(String.valueOf(s.charAt(0)));
        while(j<s.length()) {
            if(!set.contains(String.valueOf(s.charAt(j)))) {
                set.add(String.valueOf(s.charAt(j)));
                j++;
            }else {
                if(lss.length()<=(j-i)) {
                    lss = s.substring(i, j);
                }
                    set.clear();
                    set.add(String.valueOf(s.charAt(j)));
                    i=j;
                    j++;
            }
        }
        return lss;
    }
}
