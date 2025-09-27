// Node class

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

protected  class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

// LinkedList class
class LinkedList {
  Node head;

  // Display the linked list
  void display(String message) {
    Node temp = head;
    if (head == null) {
      System.out.println("LinkedList is empty");
      return;
    }
    System.out.print(message + " ");
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  // Convert array to linked list
  void convertArrayToLinkList(int arr[]) {
    if (arr.length == 0) {
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

// Main class
public class _1_SortLinkedList {

  Node sortLinkedList(Node head) {
    List<Integer> list = new ArrayList<>();
    // LinkedList ll = new LinkedList();

    Node temp = head;
    while (temp != null) {
      list.add(temp.data);
      temp = temp.next;
    }
    list.sort(null);

    int i = 0;
    temp = head;
    while (temp != null) {
      temp.data = list.get(i);
      temp = temp.next;
      i++;
    }

    // int[] sortedArr = list.stream().mapToInt(Integer::intValue).toArray();
    // ll.convertArrayToLinkList(sortedArr);
    return head;

    // return ll.head;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 9, 3, 0, 6, 7 };

    LinkedList ll = new LinkedList();
    ll.convertArrayToLinkList(arr);

    ll.display("Original LinkedList is:");

    _1_SortLinkedList obj = new _1_SortLinkedList();
    Node newHead = obj.sortLinkedList(ll.head);

 
    ll.head = newHead;

    ll.display("Sorted LinkedList is:");
  }
}
