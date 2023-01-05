package Easy;

public class NumberOfGoodPairs {

  public NumberOfGoodPairs() {

  }

  public int numIdenticalPairsQuadraticSolution(int[] nums) {

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

  public int numIdenticalPairsLinearSolution(int[] nums){

    int currentNum = 0;
    int nextNum = 0;
    int countPairs = 0;
    int x=0;
    int y=1;

    while(true){

      if(x==nums.length-1){
        break;
      } else if(y==nums.length){
        x++;
        y=x+1;
        if(y==nums.length){
          break;
        }
      }

      currentNum = nums[x];
      nextNum = nums[y];

      if (currentNum == nextNum) {
        countPairs++;
        y++;
      } else {
        y++;
      }
    }
    return countPairs;

  }

}
