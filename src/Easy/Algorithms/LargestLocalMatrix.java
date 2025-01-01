package Easy.Algorithms;

import java.util.ArrayList;

/*
* 2373. Largest Local Values in a Matrix
Easy
Topics
Companies
Hint
You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

Return the generated matrix.



Example 1:


Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]
Explanation: The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
Example 2:


Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
Output: [[2,2,2],[2,2,2],[2,2,2]]
Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.


Constraints:

n == grid.length == grid[i].length
3 <= n <= 100
1 <= grid[i][j] <= 100*/
public class LargestLocalMatrix {
  public int[][] largestLocal(int[][] grid) {

    for (int r = 0; r < grid.length; r++) {
      System.out.print("Row " + r + ":   ");
      for (int c = 0; c <= 3; c++) {
        if (c == 3) {
          System.out.print(grid[r][c]);

        } else {
          System.out.print(grid[r][c] + ", ");
        }
      }
      System.out.println();

    }

    System.out.println();
    System.out.println();
    System.out.println();
    boolean findingLargestLocal = false;

    ArrayList<Integer> largestNums = new ArrayList<>();
    int currentLargest = 0;

    int rowChange = 0;
    int columnChange = 0;
    int upToRow = grid.length - 2;
    int upToColumn = grid.length - 2;
    System.out.println(grid.length-2);

    while (!findingLargestLocal) {
      for (int r = rowChange; r <=upToRow; r++) {


        System.out.print("Row " + r + ":   ");
        for (int c = columnChange; c <= upToColumn; c++) {
          System.out.print(grid[r][c] + ", ");
          if (grid[r][c] > currentLargest) {
            currentLargest = grid[r][c];
            if (columnChange == grid.length - 2) {
              columnChange = 0;
              rowChange++;
            }
          }
        }
        if (r == grid.length - 2) {
          largestNums.add(currentLargest);
          System.out.println();
          System.out.println("Biggest was: "+ currentLargest);
          currentLargest = 0;
          upToColumn = grid.length - 1;
          columnChange++;
          System.out.println("--------------");

        }
        System.out.println();

        if(largestNums.size()==grid.length-2){
          upToRow=grid.length - 1;
          upToColumn= grid.length - 2;
          rowChange=grid.length - 2;
          columnChange=0;
        }

        if(largestNums.size()==grid.length){
          findingLargestLocal=true;
        }

      }
    }

    System.out.println("current largest: " + largestNums);
    return null;
  }
}
