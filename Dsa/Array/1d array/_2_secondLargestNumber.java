import java.util.Arrays;

public class _2_secondLargestNumber {

  public static void main(String[] args) {

    int arr[] = { 3, 2, 1, 5, 2 };
    System.out.println(Arrays.toString(arr));

    System.out.println("(Better)->Second_largest element is: " + secondLargestNumber_better(arr));
    System.out.println("(Optimal)->Second_largest element is: " + secondLargestNumber_optimal(arr));
  }

  public static int secondLargestNumber_better(int arr[]) { // O(n)+ O(n)= O(2n)
    int largest = arr[0];
    int secondLargest = -1; // no negative number present in the array
    for (int i = 0; i < arr.length; i++) { // O(n)
      if (arr[i] > largest) {
        largest = arr[i]; // find the largest number
      }
    }
    for (int i = 0; i < arr.length; i++) { // O(n)

      if (arr[i] > secondLargest && arr[i] != largest) {
        secondLargest = arr[i];
      }
    }

    return secondLargest;
  }

  public static int secondLargestNumber_optimal(int arr[]) { // O(n)
    int largest = arr[0];
    int secondLargest = -1; // no negative number present in the array
    for (int i = 1; i < arr.length; i++) { // O(n)
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i]; // find the largest number
      } else if (arr[i] < largest && arr[i] > secondLargest) {
        secondLargest = arr[i];
      }
    }

    return secondLargest;
  }

}