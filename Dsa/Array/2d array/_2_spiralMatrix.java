import java.util.ArrayList;

public class _2_spiralMatrix {
  public static void main(String[] args) {
    int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] arr = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 } };
    display(arr);
    spiral(arr);

  }

  public static void display(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();

    }
  }

  public static void spiral(int arr[][]) {
    int columns = arr[0].length;
    int row = arr.length;
    ArrayList<Integer> list = new ArrayList<>();

    int left = 0;
    int top = 0;
    int right = columns - 1;
    int bottom = row - 1;
    System.out.println("-------------");
    System.out.println(left + " " + top + " " + right + " " + bottom);
    System.out.println("-------------");
    System.out.println("List:"+list);
    System.out.println("-------------");
    
    while (top <= bottom && left <= right) {

      for (int i = left; i <= right; i++) {
        System.out.print(arr[top][i] + " ");
        list.add(arr[top][i]);
      }
      top++;
      for (int i = top; i <= bottom; i++) {
        System.out.print(arr[i][right] + " ");
        list.add(arr[i][right]);
      }
      right--;
      for (int i = right; i >= left; i--) {
        System.out.print(arr[bottom][i] + " ");
        list.add(arr[bottom][i] );

      }
      bottom--;
      for (int i = bottom; i >= top; i--) {
        System.out.print(arr[i][left] + " ");
        list.add(arr[i][left]);
      }
      left++;
    }
    System.out.println();
    
    System.out.println("_____________________________________");
    System.out.print("List:"+list);
  }
}
