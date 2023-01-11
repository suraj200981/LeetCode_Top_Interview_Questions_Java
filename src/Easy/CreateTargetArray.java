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
    for (int x = 1; x < nums.length; x++) {

      countForNums = nums[x];
      countForIndex = index[x];

      if (x <= countForIndex) {
        targetArray[countForIndex] = countForNums;

      } else {
        temp = targetArray[countForIndex];
        targetArray[countForIndex] = countForNums;

        targetArray = appendValueToArray(targetArray, temp,countForIndex);

//        targetArray[x] = temp;

      }
    }

    return targetArray;
  }


  public int[] appendValueToArray(int[] arr, int valueAppend, int indexStarting){
    //valueToAppend = 1
    //x = 4
    //arr = [0,4,3,2,0]

    int temp =0;
    int temp2=0;
    for(int x=indexStarting+1; x<arr.length-1; x++){

      if (x != indexStarting + 1) {
        arr[x+1]= temp2;
        break;
      }

        temp = arr[x];//3 //
        arr[x] = valueAppend;////arr = [0,4,1,2,0]
        temp2 = arr[x + 1];
        arr[x+1] = temp;


    }


    return arr;
  }
}
