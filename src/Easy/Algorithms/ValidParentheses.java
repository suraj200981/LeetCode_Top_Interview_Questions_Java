package Easy.Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

  public boolean isValid(String s) {
    HashMap<Character, Character> map = new HashMap<>();

    map.put('(', ')');
    map.put('{', '}');
    map.put('[', ']');

    map.put(')', 'x');
    map.put('}', 'x');
    map.put(']', 'x');

    boolean output = false;
    int correctCount = 0;

    int left = 0; //start of string
    int right = s.length() - 1; //end of string

    ArrayList<String> valid = new ArrayList<>();

    ArrayList<String> notValid = new ArrayList<>();
    notValid.add("{");
    notValid.add("[");
    notValid.add("(");

    if(s.length()-1<1 || s.length()==3){
      return output;
    }


    while (left <right) {
      if (valid.contains(String.valueOf(s.charAt(left)))) {
        left++;
      }

      if(left==right){
        correctCount++;
        break;
      }
      if (map.get(s.charAt(left)) == s.charAt(right)) {
        valid.add(String.valueOf(s.charAt(left)));
        valid.add(String.valueOf(s.charAt(right)));

        //check if left is right next to right
        if(right-left==1){
          left++;
          left++;
          right = s.length() - 1;
          correctCount++;
        }else {
          left++;
          //check to the left of the right char and see if its in the valid arraylist
          if (notValid.contains(String.valueOf(s.charAt(right-1))) && s.length()>2) {
            break;
          }
          right = s.length() - 1;
          correctCount++;
        }
      } else {
        right--;
      }
    }
    if (correctCount == (s.length()) / 2) {
      output = true;
    }
    return output;
  }

}
