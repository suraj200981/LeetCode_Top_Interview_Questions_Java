package Easy;

public class NumberOfStepsToReduceNumberToZero {

  public NumberOfStepsToReduceNumberToZero (){

  }

  public int numberOfSteps(int num) {
    boolean notZero = true;
    int countSteps = 0;
    while(notZero){
      if(num==0){
        notZero=false;
      }else if (num%2==0){
        num= num/2;
        countSteps++;
      }else {
        num= num-1;
        countSteps++;
      }
    }
    return countSteps;
  }
}
