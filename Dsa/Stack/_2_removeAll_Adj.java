import java.util.Stack;

public class _2_removeAll_Adj {
  public static void main(String[] args) {
    String s = "CCAX";// "AX"
     StringBuilder result = new StringBuilder();
    int n = s.length();

    Stack<Character> st = new Stack<>();

    for (int i = 0; i < n; i++) {
      if (st.empty() || st.peek() != s.charAt(i)) {
        st.push(s.charAt(i));
      } else {
        st.pop();
      }
    }

    while (!st.isEmpty()) {
      result.append(st.pop());

    }
    System.out.println(result.reverse().toString());

  }

}
