public class _1_image_rotated {

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    display(arr);
    System.out.println("---------------Stop-----------------");
    System.out.println();
    transpose(arr);
    System.out.println("---------------Stop-----------------");
    System.out.println();
    rotatedEachRow(arr);
  }

  public static void display(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print("[");
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print("  " + arr[i][j] + "  ");
      }
      System.out.println("]");
      System.out.println();
    }
  }

  public static void transpose(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j <= i; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }

    }
    display(arr);
  }

  public static void rotatedEachRow(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      int start = 0;
      int end = arr.length - 1;
      while (start < end) {
        int temp = arr[i][start];
        arr[i][start] = arr[i][end];
        arr[i][end] = temp;
        start++;
        end--;

      }
    }
    display(arr);
  }
}