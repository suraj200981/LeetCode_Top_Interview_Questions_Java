package Easy;
/*345. Reverse Vowels of a String
Solved
Easy
Topics
Companies
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

*/
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
