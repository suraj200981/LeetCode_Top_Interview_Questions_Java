package Easy.Algorithms;

public class SortedSquares {
  public int[] sortedSquares(int[] nums) {

    // square first
    for (int x = 0; x < nums.length; x++) {
      nums[x] = nums[x] * nums[x];
    }
    // sort after
    int temp = 0;
    for (int x = 0; x < nums.length; x++) {
      for (int y = 1; y < nums.length; y++) {
        if (nums[y - 1] > nums[y]) {
          temp = nums[y - 1];
          nums[y - 1] = nums[y];
          nums[y] = temp;
        }
      }
    }
    // return result
    return nums;
  }
}
