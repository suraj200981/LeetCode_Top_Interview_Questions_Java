package Easy;

public class ReverseVowels {
  public String reverseVowels(String s) {
    int right = s.length() - 1;
    int left = 0;
    StringBuilder stringNew = new StringBuilder(s);

    while (left <= right) {
      if ("aeiou".contains(String.valueOf(stringNew.charAt(left)).toLowerCase())
              && "aeiou".contains(String.valueOf(stringNew.charAt(right)).toLowerCase())) {
        char temp = stringNew.charAt(left);
        stringNew.setCharAt(left, stringNew.charAt(right));
        stringNew.setCharAt(right, temp);
        left++;
        right--;
      } else if (!"aeiou".contains(String.valueOf(stringNew.charAt(left)).toLowerCase())) {
        left++;
      } else if (!"aeiou".contains(String.valueOf(stringNew.charAt(right)).toLowerCase())) {
        right--;
      }
    }
    return stringNew.toString();

  }
}
