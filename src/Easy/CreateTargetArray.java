package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class CreateTargetArray {
  public CreateTargetArray() {

  }

  /*
  *                                        [0,1,2,3,4]
        Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        Output: [0,4,1,3,2]
        Explanation:
        nums       index     target
        0            0        [0]
        1            1        [0,1]
        2            2        [0,1,2]
        3            2        [0,1,3,2]
        4            1        [0,4,1,3,2]
  *
  *
  *
  * */
  public int[] createTargetArray(int[] nums, int[] index) {

    int[] targetArray = new int[nums.length];

    int countForIndex = 0;
    int countForNums = 0;
    int temp = 0;
    for (int x = 0; x < nums.length; x++) {

      countForNums = nums[x];
      countForIndex = index[x];

      if (x <= countForIndex) {
        targetArray[countForIndex] = countForNums;

      } else {
        temp = targetArray[countForIndex];
        targetArray[countForIndex] = countForNums;
        targetArray[x] = temp;
      }
    }

    return targetArray;
  }
}
