import org.apache.kafka.common.protocol.types.Field;

import java.util.Arrays;
import java.util.Stack;

public class Interview1 {
    public static void main(String[] args) {
        String str = "ab aa aa bcd ab";
        //"tom jerry jerry tom";
        killWordsStack(str);

    }

    private static int killWordsStack(String str) {
        int count=0;
        Stack<String> stack = new Stack<>();
        String[] arr = str.split(" ");
        for(int i=0; i<arr.length; i++) {
            if(stack.isEmpty()) {
               stack.push(arr[i]);
            }else {
                if(stack.peek().equals(arr[i])) {
                    stack.pop();
                }else {
                    stack.push(arr[i]);
                }
            }
        }
        count = stack.size();
        System.out.println("Count is " + count);
        return count;
    }




    /*Input : ab aa aa bcd ab
Output : 3
As aa, aa destroys each other so, 
ab bcd ab is the new sequence.
Input :  tom jerry jerry tom
Output : 0

As first both jerry will destroy each other.
Then sequence will be tom, tom they will also destroy
each other. So, the final sequence doesn’t contain any
word.


*/
    private static int killWords(String[] str) {
        int removedCount=0;
        int remCount=str.length;
        int i=0;
        int j=1;

        while(remCount!=removedCount) {
            while(i<str.length && j<str.length) {
                if(str[i].equals("")) {
                    i++;
                }
                if(str[j].equals("")) {
                    i++;
                }
                if(str[i].equals(str[j])) {
                    str[i]="";
                    str[j]="";
                    i=j+1;
                    j=i+1;
                    removedCount+=2;
                }else {
                    i=j;
                    j=j+1;
                }
            }
        }
        return remCount;
    }
}
