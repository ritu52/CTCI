package Chapter1;

/**
 * Program to rotate a 2D matrix N*N in clockwise 90 degrees. Console output is below:
 * Array representation:
 * 1, 2, 3, 4, 5,
 * 6, 7, 8, 9, 10,
 * 11, 12, 13, 14, 15,
 * 16, 17, 18, 19, 20,
 * 21, 22, 23, 24, 25,
 * ---------- After rotation by 90 degrees--------
 * 21, 16, 11, 6, 1,
 * 22, 17, 12, 7, 2,
 * 23, 18, 13, 8, 3,
 * 24, 19, 14, 9, 4,
 * 25, 20, 15, 10, 5,
 * Array representation:
 * 3, 4, 5,
 * 6, 7, 8,
 * 1, 2, 9,
 * ---------- After rotation by 90 degrees--------
 * 1, 6, 3,
 * 2, 7, 4,
 * 9, 8, 5,
 *
 * Process finished with exit code 0
 */
public class ArrayRotation1_7 {

  public static void main(String[] args) {
    int[][] arrayToRotate = {
        {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}
    };
    System.out.println("Array representation:");
    printArray(arrayToRotate);
    rotateClockWiseBy90(arrayToRotate);
    System.out.println("---------- After rotation by 90 degrees--------");
    printArray(arrayToRotate);
    int[][] arrayToRotate3 = {
        {3,4,5}, {6,7,8}, {1,2,9}
    };
    System.out.println("Array representation:");
    printArray(arrayToRotate3);
    rotateClockWiseBy90(arrayToRotate3);
    System.out.println("---------- After rotation by 90 degrees--------");
    printArray(arrayToRotate3);
  }

  private static void rotateClockWiseBy90(int[][] arrayToRotate) {
    int size = arrayToRotate.length;
    int layersToRotate = size/2;

    for(int layer=0;layer<layersToRotate;++layer) {
      int last = size - layer -1;

      for(int element=layer; element<last;++element) {
        int offset = element - layer;
        int top = arrayToRotate[layer][element];
        int right = arrayToRotate[element][last];
        int bottom = arrayToRotate[last][last-offset];
        int left = arrayToRotate[last-offset][layer];
        arrayToRotate[layer][element] = left;
        arrayToRotate[element][last] = top;
        arrayToRotate[last][last-offset] = right;
        arrayToRotate[last-offset][layer] = bottom;
      }
    }
  }

  private static void printArray(int[][] arrayToRotate) {
    for(int[] arr : arrayToRotate) {
      for(int x: arr) {
        System.out.print(x+", ");
      }
      System.out.println(" ");
    }
  }
}
