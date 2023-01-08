package Easy;

public class SmallerNumbersThanCurrent {

  public SmallerNumbersThanCurrent() {

  }

  /*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
  That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

  Return the answer in an array.*/

  public int[] smallerNumbersThanCurrentQuadraticSolution(int[] nums) {

    int[] resultArray = new int[nums.length];

    for (int x = 0; x < nums.length; x++) {
      for (int y = 0; y < nums.length; y++) {

        if (x != y) {
          if (nums[x] > nums[y]) {
            resultArray[x] += 1;
          }
        } else {
          continue;
        }


      }
    }
    return resultArray;
  }
}
