
import Easy.Algorithms.*;

import java.util.Arrays;


public class Main {
  public static void main(String[] args) {

    LargestLocalMatrix program = new LargestLocalMatrix();

    int[][] grid1 = new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
//    int[][] grid2 = new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 2, 1, 1}, {1, 1, 1, 1,
//            1}, {1, 1, 1, 1, 1}};
    System.out.println("output: " + Arrays.deepToString(program.largestLocal(grid1)));
//    System.out.println("output: " + Arrays.deepToString(program.largestLocal(grid2)));
  }
}