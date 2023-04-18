package Easy.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortingTheSentence {

  public String sortSentence(String s) {

    ArrayList<String> wordsInSentence = new ArrayList<>();

    ArrayList<Integer> numbers = new ArrayList<>();

    int beginning = 0;

    for (int x = 0; x < s.length(); x++) {

      if (Character.isSpaceChar(s.charAt(x))) {
        x++;
        beginning = x;
      } else {
        if (Character.isDigit(s.charAt(x))) {

          numbers.add(Integer.valueOf(String.valueOf(s.charAt(x)))); //these numbers will be sorted
          wordsInSentence.add(s.substring(beginning, x + 1));
        } else {

        }
      }
    }
    Collections.sort(numbers);

    int x = 0;
    int y = 0;
    StringBuilder stringBuilder = new StringBuilder();

    while (true) {
      if (y == numbers.size()) {
        break;
      }

      if (wordsInSentence.get(x).contains(String.valueOf(numbers.get(y)))) {

        if (y == numbers.size() - 1) {
          stringBuilder.append(wordsInSentence.get(x).replaceAll("[0-9]", ""));
          y++;
          x = 0;
        } else {
          stringBuilder.append(wordsInSentence.get(x).replaceAll("[0-9]", "")).append(" ");
          y++;
          x = 0;
        }
      } else {
        x++;
      }
    }

    return stringBuilder.toString();
  }
}
