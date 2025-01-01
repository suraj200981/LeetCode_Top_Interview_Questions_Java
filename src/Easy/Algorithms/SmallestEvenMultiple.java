package Easy.Algorithms;

public class SmallestEvenMultiple {
  public int smallestEvenMultiple(int n) {

    //find GCD
    int val = n % 2;
    int GCD = 0;
    if( val==0){ // in the case that its 0
      GCD = 2;
    }else {
      GCD = val;
    }

    //multiple the 2 numbers
    int topNumbers = n * 2;

    //divide the top by the bottom

    return topNumbers/GCD;
  }
}
