import Easy.Algorithms.ValidParentheses;
import Easy.Stack.MakeGood;
import Easy.String.BackSpaceCompare;
import Easy.String.RemoveDuplicates;

public class Main {
  public static void main(String[] args) {

    MakeGood program = new MakeGood();
    System.out.println(program.makeGood("leEeetcode"));
    System.out.println(program.makeGood("abBAcC"));
    System.out.println(program.makeGood("s"));
    System.out.println(program.makeGood("Pp"));
  }
}