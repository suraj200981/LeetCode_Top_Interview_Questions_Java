import Easy.Algorithms.ValidParentheses;
import Easy.String.BackSpaceCompare;
import Easy.String.RemoveDuplicates;

public class Main {
  public static void main(String[] args) {

    BackSpaceCompare program = new BackSpaceCompare();
//Input: s = "ab#c", t = "ad#c"

    System.out.println(program.backspaceCompare("ab#c", "ad#c"));// valid
    System.out.println(program.backspaceCompare("ab##", "c#d#"));// valid
    System.out.println(program.backspaceCompare("a#c", "b"));// invalid
    System.out.println(program.backspaceCompare("a##c", "#a#c"));// valid
    System.out.println(program.backspaceCompare("xywrrmp", "xywrrmu#p"));// valid


  }
}