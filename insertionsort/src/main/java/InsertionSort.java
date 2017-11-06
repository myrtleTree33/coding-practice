import java.util.Arrays;

public class InsertionSort {

  private static void swap(int i, int j, int[] arr) {
    int c = arr[i];
    arr[i] = arr[j];
    arr[j] = c;
  }

  private static void insertionSort(int[] arr) {
    for (int i = 1 ; i < arr.length; i++) {
      int a = arr[i];
      for (int j = i - 1; j >= 0 && arr[j] > a; j--) {
        swap(j+1, j, arr);
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{7, 2, 8, 4, 5, 1, 2, 11};
    System.out.println("Before: " + Arrays.toString(arr));
    insertionSort(arr);
    System.out.println("After: " + Arrays.toString(arr));
  }

}
