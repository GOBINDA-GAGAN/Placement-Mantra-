class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkList {
  Node head;

  boolean isEmpty() {
    Node temp = head;

    return temp == null;
  }

  void push(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;

  }

  int pop() {

    if (isEmpty()) {
      return -1;
    }
    int top = head.data;
    head = head.next;
    return top;
  }

  int peek() {
    if (isEmpty()) {
      return -1;
    }
    return head.data;

  }


}

public class Stack_LinkedLIst {
  public static void main(String[] args) {
    LinkList l1 = new LinkList();
    l1.push(1);
    l1.push(2);
    l1.push(3);

    while (!l1.isEmpty()) {
      System.out.println(l1.peek());
      l1.pop();

    }
  }

}
