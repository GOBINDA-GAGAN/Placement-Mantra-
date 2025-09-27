import java.util.HashSet;
import java.util.Set;

public class _4_Remove_duplicates_from_Sorted_Array {
  public static void main(String[] args) {
    int arr[] = { 1, 1, 2, 3, 4, 4 };

    System.out.println("(Brute)->total number of duplicate element:" + totalNumberOfDuplicate_Brute(arr));
    System.out.println("(optimal)->total number of duplicate element:" + totalNumberOfDuplicate_optimal(arr));

  }

  public static int totalNumberOfDuplicate_Brute(int arr[]) { // Tc=n log n + O{n} Sc= O(n)
    int total = 0;
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) { // n log n
      set.add(arr[i]);
    }
    for (Integer ele : set) { // O(n)
      total++;
    }
    return total;
  }
  public static int totalNumberOfDuplicate_optimal(int arr[]) { // Tc=O{n} Sc= O(1)
    int i=0;
    for( int j=0;j<arr.length;j++){
      if(arr[j]!=arr[i]){
        arr[i+1]=arr[j];
        i++;
      }
    }
    return i+1;
  }

}
