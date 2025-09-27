public class _3_sum_of_allPrimeNumber {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 5, 6,7 }; // TODO_output=2+5=7

    allPrimeNumberSum(arr);
  }

  public static void allPrimeNumberSum(int arr[]) {

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      int count = 0;

      for (int j = 1; j < arr[i]; j++) {
        if (arr[i] % j == 0) {
          count++;
        }
      }

      if (count == 1) {
        sum = sum + arr[i];
      }
    }
    System.out.println(sum);

  }

}
