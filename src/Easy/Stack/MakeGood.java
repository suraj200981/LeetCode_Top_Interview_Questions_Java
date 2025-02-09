package Easy.Stack;

import java.util.Stack;

public class MakeGood {
  public String makeGood(String s) {

    Stack<Character> stack = new Stack<Character>();
    boolean popAgainCheck = false;
    StringBuilder finalValue = new StringBuilder();

    for (int x = 0; x < s.length(); x++) {
      stack.push(s.charAt(x));

      //do pop again check
      if (popAgainCheck) {
        stack.pop();
        popAgainCheck = false;
      }
      if (x == s.length() - 1) {
        break;
      }
      if (!stack.isEmpty()) {
        //check if the characters are equal even if one is uppercase - we can handle this later
        if (Character.toLowerCase(s.charAt(x + 1)) == Character.toLowerCase(stack.peek())) {
          //Check if the top of the stack and the current character is uppercase
          if (Character.isUpperCase(s.charAt(x+1)) && Character.isUpperCase(stack.peek())) {
            //figure out handling for this based on tests passed
            System.out.println("true");
          } else if (Character.isUpperCase(s.charAt(x + 1)) || Character.isUpperCase(stack.peek())) {
            //Check if current index is uppercase
            stack.pop();
            popAgainCheck = true;
          }
        }
      }
    }

    if(stack.isEmpty()){
      return "";
    }
    for (int x=0;x< stack.size(); x++){
      finalValue.append(stack.get(x));
    }
    return finalValue.toString();
  }
}
