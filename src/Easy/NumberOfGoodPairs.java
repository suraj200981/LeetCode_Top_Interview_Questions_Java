package Easy;

public class NumberOfGoodPairs {

  public NumberOfGoodPairs() {

  }

  public int numIdenticalPairs(int[] nums) {

    int currentNum = 0;
    int nextNum = 0;

    int countPairs = 0;

    for (int x = 0; x < nums.length; x++) {
      currentNum = nums[x];
      for (int y = x + 1; y < nums.length; y++) {
        nextNum = nums[y];
        if (currentNum == nextNum) {
          countPairs++;
        }
      }
    }
    return countPairs;
  }

}
