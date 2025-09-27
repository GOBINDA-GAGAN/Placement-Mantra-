import java.util.Stack;

public class stackCollection {
  public static void main(String[] args) {
    Stack<Integer> s1 = new Stack<>();
    int arr[] = { 1, 2, 3, 4 };

    System.out.println("Initially Stack: " + s1);

    // Push elements
    for (var each : arr) {
      s1.push(each);
      System.out.println("After pushing " + each + " -> " + s1);
    }

    // Pop elements
    System.out.println("\nPopping elements...");
    System.out.println("Popped: " + s1.pop() + " -> " + s1);
    System.out.println("Popped: " + s1.pop() + " -> " + s1);
    System.out.println("Popped: " + s1.pop() + " -> " + s1);

    // Peek element
    System.out.println("\nPeek element: " + s1.peek());
    System.out.println("Final Stack after peek: " + s1);

    // Print all elements (bottom to top)
    System.out.print("\nAll elements in stack (bottom to top):");
    for (Integer num : s1) {
      System.out.print(num + " ");
    }
  }
}
