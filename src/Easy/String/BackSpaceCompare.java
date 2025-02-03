package Easy.String;

import java.util.Stack;

public class BackSpaceCompare {
  public boolean backspaceCompare(String s, String t) {

    Stack<String> stack1 = new Stack<>();
    Stack<String> stack2 = new Stack<>();

    boolean alreadyDoneCheckS = false;
    boolean alreadyDoneCheckT = false;


    //loop through both strings
    for (int x = 0; x < s.length(); x++) {

      if (s.length() <= 1 && !alreadyDoneCheckS) {
        stack1.push(String.valueOf(s.charAt(x)));
        alreadyDoneCheckS = true;
      } else {
        if (!alreadyDoneCheckS) {
          if (s.charAt(x) != '#') {
            stack1.push(String.valueOf(s.charAt(x)));
          } else {
            if (!stack1.isEmpty()) {
              stack1.pop();
            }
          }
        }
      }
    }
    for (int x = 0; x < t.length(); x++) {

      if (t.length() <= 1 && !alreadyDoneCheckT) {
        stack2.push(String.valueOf(t.charAt(x)));
        alreadyDoneCheckT = true;

      } else {
        if (!alreadyDoneCheckT) {
          if (t.charAt(x) != '#') {
            stack2.push(String.valueOf(t.charAt(x)));
          } else {
            if (!stack2.isEmpty()) {
              stack2.pop();
            }
          }
        }
      }
    }
    //should be left with ac for string s and t after the loop

    //compare both stacks
    if (stack1.toString().equals(stack2.toString())) {
      return true;
    }
    return false;
  }
}
