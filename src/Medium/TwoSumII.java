package Medium;


//167. Two Sum II - Input Array Is Sorted
//Solved
//Medium
//Topics
//Companies
//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//
//The tests are generated such that there is exactly one solution. You may not use the same element twice.
//
//Your solution must use only constant extra space.
//
//
//
//Example 1:
//
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
public class TwoSumII {

  //solved in O(LogN)
  //two pointer technique
  public int[] twoSum(int[] numbers, int target) {

    // they are already sorted so if the sum is greater then the target we can more
    // the right pointer left
    // otherwise we can move the left pointer right

    boolean targetMet = false;
    int left = 0;
    int right = numbers.length - 1;

    while (!targetMet) {

      if ((numbers[left] + numbers[right]) > target) {
        right--;
      } else if ((numbers[left] + numbers[right]) < target) {
        left++;
      } else if ((numbers[left] + numbers[right]) == target) {
        targetMet = true;
      }
    }
    return new int[] { left + 1, right + 1 };
  }
}
