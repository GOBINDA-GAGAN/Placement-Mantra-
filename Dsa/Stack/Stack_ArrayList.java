import java.util.ArrayList;

class myStack {
  ArrayList<Integer> list = new ArrayList<>();

  boolean isEmpty() {   // ✅ return boolean
    return list.size() == 0;
  }

  void peek() {
    if (isEmpty()) {
      System.out.println("My stack is empty");
      return;
    }
    int top = list.get(list.size() - 1);
    System.out.println("My peek element: " + top);
  }

  // push
  void push(int data) {
    list.add(data);
  }

  // pop
  void pop() {
    if (isEmpty()) {
      System.out.println("My stack is empty");
      return;
    }
    int top = list.get(list.size() - 1);
    list.remove(list.size() - 1);
    System.out.println("My pop element is: " + top);
  }

  void displayAllElement() {
    System.out.println("My stack elements: " + list);
  }
}

public class Stack_ArrayList {
  public static void main(String[] args) {
    myStack stack1 = new myStack();
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    for (int i = 0; i < arr.length; i++) {
      stack1.push(arr[i]);
    }

    stack1.displayAllElement();
    stack1.peek();

    stack1.push(10);
    stack1.displayAllElement();
    stack1.peek();

    System.out.println("________________________");
    stack1.pop();
    stack1.pop();
    stack1.pop();
    System.out.println("________________________");
    stack1.displayAllElement();
  }
}
