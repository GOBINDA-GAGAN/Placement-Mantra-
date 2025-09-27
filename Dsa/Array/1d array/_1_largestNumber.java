import java.util.Arrays;

public class _1_largestNumber {
  public static void main(String[] args) {
    int arr[] = { 3, 2, 1, 5, 2 };
    System.out.println(Arrays.toString(arr));

    System.out.println(" largest element  is: " + largestNumber(arr));
  }

  public static int largestNumber(int arr[]) {
    int largest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }

    }
    return largest;
  }
}