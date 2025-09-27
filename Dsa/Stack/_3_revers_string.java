import java.util.Arrays;
import java.util.Stack;

public class _3_revers_string {
  public static void main(String[] args) {
    String string = "gobinda gagan dey";
    char s[] = { 'h', 'f' };
    reverseString(string);
    reverseString(s);
    System.out.println(Arrays.toString(s));
  }

  public static void reverseString(String string) {
    Stack<Character> st = new Stack<>();
    String revString = "";
    int i = 0;
    while (string.length() > i) {
      if (st.empty()) {
        st.push(string.charAt(i));
        i++;
      } else {
        st.push(string.charAt(i));
        i++;
      }
    }
    while (!st.empty()) {
      char Char = st.pop();
      revString += Char;

    }
    System.out.println(revString);
  }

  public static void reverseString(char[] s) {
    Stack<Character> st = new Stack<>();
    int i = 0;
    while (i < s.length) {
      if (st.isEmpty()) {
        st.push(s[i]);
        i++;
      } else {
        st.push(s[i]);
        i++;
      }
    }
    int j = 0;
    while (!st.empty()) {
      s[j] = st.pop();
      j++;
    }
    Arrays.toString(s);
  }
}
