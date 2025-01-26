package Medium;

public class MediumShapes {

  public void printPyramid() {
    for (int x = 0; x < 4; x++) {
      System.out.println();
      for (int y = 0; y < 3 - x; y++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (x * 2) + 1; k++) {

        System.out.print("*");
      }
    }
  }

  public void printDiamond(int n) {

    //top half
    int starsPrinted = 0;
    for (int x = 0; x < n; x++) {
      starsPrinted = 0;
      System.out.println();
      for (int y = 0; y < n - x; y++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (x * 2) + 1; k++) {
        System.out.print("*");
        starsPrinted++;
      }
    }
    int reduceStars = (2 * n) - 1;
    int increaseSpaces = (2 * n) - 1;

    //bottom half

    if (starsPrinted == (2 * n) - 1) {
      for (int x = 1; x < n; x++) {
        reduceStars -= 2;
        increaseSpaces -= 1;
        System.out.println(" ");
        for (int y = (2 * n) - 1; y >= increaseSpaces; y--) {
          System.out.print(" ");
        }
        for (int y = 0; y < reduceStars; y++) {
          System.out.print("*");
        }
      }
    }
  }

  public void printHollowSquare(int n) {

    for (int x = 0; x < n; x++) { //do 4 times
      System.out.println();

      if (x == 0 || x == n - 1) { //first or last row
        for (int y = 0; y < n; y++) {
          System.out.print("*");
        }
      } else {
        System.out.print("*");
        for (int y = 0; y < n - 2; y++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
    }
  }

  public void printHollowRightAngledTriangle(int n) {

    int increaseSpaces = 1;

    for (int x = 0; x < n; x++) { // do for n times
      System.out.println();

      if(x==0 || x==1 || x== n-1){
        for (int y = 0; y < x + 1; y++) {
          System.out.print("*");
        }
      }else{
        System.out.print("*");
        for (int y = 0; y < increaseSpaces; y++) {
          System.out.print(" ");
        }
        System.out.print("*");
        increaseSpaces++;
      }
    }
  }
}
