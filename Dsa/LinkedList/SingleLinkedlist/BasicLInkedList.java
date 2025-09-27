// Node class
class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

// Singly Linked List class
class SinglyLinkedList {
  Node head;

  // Insert methods
  void insertAtBeginning(int data) {
  }

  void insertAtEnd(int data) {
  }

  void insertAtPosition(int data, int position) {
  }

  // Delete methods
  void deleteAtBeginning() {
  }

  void deleteAtEnd() {
  }

  void deleteAtPosition(int position) {
  }

  // Search method
  boolean search(int key) {
    return false;
  }

  // Update method
  void update(int oldValue, int newValue) {
  }

  // Display / Traverse
  void display() {
    Node temp = head;
    if (temp == null) {
      System.out.println("LinkedList is empty");
      return;
    }
    System.out.print("My LinkedList is: ");
    while (temp != null) {
      System.out.print(temp.data + " --> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  // Get length
  int length() {
    if (head == null) {
      System.out.println("LinkedList is empty");
      return 0;
    }
    Node temp = head;
    int size = 0;
    while (temp != null) {
      size++;
      temp = temp.next;

    }
    return size;
  }

  // Reverse linked list
  void reverse() {
  }

  // Convert array to linked list
  void arrayToLinkedList(int[] arr) {
    if (arr == null || arr.length == 0) {
      System.out.println("Array is empty");
      return;
    }

    head = new Node(arr[0]); 
    Node tail = head; 

    for (int i = 1; i < arr.length; i++) {
      Node newNode = new Node(arr[i]);
      tail.next = newNode; 
      tail = newNode; 
    }
  }
}

public class BasicLInkedList {
  public static void main(String[] args) {

    int arr[] = { 2, 4, 1, 5, 6 };
    SinglyLinkedList LL = new SinglyLinkedList();
    LL.arrayToLinkedList(arr);
    LL.display();
  }

}