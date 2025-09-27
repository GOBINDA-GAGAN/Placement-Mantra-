import java.util.ArrayList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Create LinkedList from array
    public void createFromArray(int[] arr) {
        if (arr.length == 0)
            return;

        head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
    }

    // Display LinkedList
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Create LinkedList from ArrayList
    public void createFromArrayList(ArrayList<Integer> arrList) {
        if (arrList.size() == 0)
            return;

        head = new Node(arrList.get(0));
        Node current = head;

        for (int i = 1; i < arrList.size(); i++) {
            current.next = new Node(arrList.get(i));
            current = current.next;
        }
    }

    // merge two list
    public void merge(Node head1, Node head2) {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null) {
            list.add(temp1.data);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            list.add(temp2.data);
            temp2 = temp2.next;
        }
        System.out.println("Marge two list:"+list);
        list.sort(null);
        System.out.println("Sort:"+list);
        createFromArrayList(list);
        display();

    }
}

public class _2_Marge2Linkedlist {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 1, 2, 6, 7, 19, 20 };

        LinkedList list1 = new LinkedList();
        list1.createFromArray(arr1);

        LinkedList list2 = new LinkedList();
        list2.createFromArray(arr2);

        System.out.print("LinkedList 1:  ");
        list1.display();
        System.out.print("LinkedList 2:  ");
        list2.display();

        LinkedList ll = new LinkedList();

        ll.merge(list1.head, list2.head);
    }
}
