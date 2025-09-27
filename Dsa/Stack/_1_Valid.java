import java.util.Stack;

public class _1_Valid {
  public static void main(String[] args) {

    String string = "{}[";

    boolean res = Parentheses(string);
    System.out.println(res);

  }

  public static boolean Parentheses(String s1) {
    Stack<Character> st = new Stack<>();

    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == '(' || s1.charAt(i) == '{' || s1.charAt(i) == '[') {
        st.push(s1.charAt(i));
      } else {
        if (st.empty()) {
          return false;
        }

        char ch = st.pop();

        if ((s1.charAt(i) == ')' && ch != '(') || (s1.charAt(i) == '}' && ch != '{')
            || (s1.charAt(i) == ']' && ch != '[')) {
          return false;
        }

      }

    }

    return st.isEmpty();

  }

}
