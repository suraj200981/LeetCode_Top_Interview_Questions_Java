package Easy.String;

import java.util.Iterator;
import java.util.Stack;

public class RemoveDuplicates {

  public String removeDuplicates(String s) {

    StringBuilder output = new StringBuilder();

    Stack<Character> stack = new Stack<>();

    for(int x=0; x<s.length(); x++){
      if(stack.isEmpty()){
        stack.push(s.charAt(x)); //push character at x i.e. 'a' goes on top
      }else {
        if(s.charAt(x)==stack.peek()){ // check for similar char
          stack.pop(); // remove from the stack if matching
        }else {
          stack.push(s.charAt(x));
        }
      }
    }

    Iterator<Character> iter = stack.iterator();

    while (iter.hasNext()){
      output.append(iter.next());
    }
    return output.toString();
  }
}
