package Easy.String;

import java.util.HashMap;

public class ValidParentheses {

  public ValidParentheses() {

  }

  public boolean isValid(String s) {

    HashMap<Character, Character> map = new HashMap<>();

    map.put('(', ')');
    map.put('{', '}');
    map.put('[', ']');

    boolean output = false;
    for (int x = 0; x < s.length(); x++) {
      if (x != 0 && !output) {
        break;
      }
      for (int y = x + 1; y < s.length(); y++) {
        try {
          if (map.get(s.charAt(x)) == s.charAt(y)) {
            output = true;
            x++;
          } else {
            output = false;
          }
        } catch (NullPointerException e) {
          output = false;
          break;
        }
      }
    }
    return output;
  }
}
