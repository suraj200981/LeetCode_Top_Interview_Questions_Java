package Easy.Algorithms;


import java.util.ArrayList;
import java.util.Stack;

public class ValidParentheses {

  public boolean isValid(String s) {

    //implementation using stack

    Stack<Character> stack = new Stack<>();

    boolean output = false;

    String validOpenings = "([{";

    int popCount = 0; // total brackets closed currently
    int pushCount = 0;// total brackets opened currently


    //is the length is odd return false;
    if (Math.abs(s.length() % 2) == 1) {
      return output;
    }

//"([}}])"
    for (int x = 0; x < s.length(); x++) {

      if (validOpenings.contains(String.valueOf(s.charAt(x)))) {
        stack.push(s.charAt(x)); //adds i.e. '{' to the top of the stack
        pushCount++;
      }else {
        if (!stack.isEmpty()) {
          if (s.charAt(x) == ')' && stack.peek() == '(') {
            stack.pop();
            popCount++;
          } else if (s.charAt(x) == ']' && stack.peek() == '[') {
            stack.pop();
            popCount++;
          } else if (s.charAt(x) == '}' && stack.peek() == '{') {
            stack.pop();
            popCount++;
          } else {
            return output;
          }
        } else if (!validOpenings.contains(String.valueOf(s.charAt(x)))) {
          return output;
        }
      }
      {
      }
    }
    if (popCount == pushCount) {
      output = true;
    }
    return output;
  }

}
