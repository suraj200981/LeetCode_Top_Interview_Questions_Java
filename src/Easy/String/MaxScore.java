package Easy.String;


/*Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).

The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.



Example 1:

Input: s = "011101"
Output: 5
Explanation:
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5
left = "01" and right = "1101", score = 1 + 3 = 4
left = "011" and right = "101", score = 1 + 2 = 3
left = "0111" and right = "01", score = 1 + 1 = 2
left = "01110" and right = "1", score = 2 + 1 = 3
Example 2:

Input: s = "00111"
Output: 5
Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
Example 3:

Input: s = "1111"
Output: 3


Constraints:

2 <= s.length <= 500
The string s consists of characters '0' and '1' only.*/


public class MaxScore {

  //011101
  public int maxScore(String s) {
    int totalOnes = 0;
    int zerosCount = 0;
    int onesCount = 0;
    int bestScore = Integer.MIN_VALUE;

    // Count total ones in the string
    for (char ch : s.toCharArray()) {
      if (ch == '1') totalOnes++;
    }

    // Traverse the string and calculate scores
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == '0') zerosCount++;
      else onesCount++;

      // Calculate score one by one left to right doing the split
      //i.e. when i=0 left=0 and right= 11101
      int currentScore = zerosCount + (totalOnes - onesCount);
      bestScore = Math.max(bestScore, currentScore);

    }

    return bestScore;
  }
}
