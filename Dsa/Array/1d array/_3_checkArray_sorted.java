public class _3_checkArray_sorted {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 78 }; // true
    // int arr[]={1,2,3,5,2,4}; // false

    System.out.println("Array is sorted:" + checkSorted(arr));

  }

  public static boolean checkSorted(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] >= arr[i - 1]) {
      } else {
        return false;
      }
    }
    return true;

  }

}
