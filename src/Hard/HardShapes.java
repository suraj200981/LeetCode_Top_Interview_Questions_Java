package Hard;

public class HardShapes {

  public void printHollowPyramid(int n) {
    for (int x = 0; x < n; x++) { // do for n times
      System.out.println();
      for (int y = 0; y < n - x; y++) { // y spaces
        System.out.print(" ");
      }

      if(x==0 || x== n-1) {

        for (int k = 0; k < (x * 2) +1; k++) { //k stars

          System.out.print("*");
        }
      }
      else{
        System.out.print("*");

        for (int k = 0; k <= (x * 2) -2; k++) { //k stars

          System.out.print(" ");
        }
        System.out.print("*");
      }
    }
  }
}
