package Easy.String;

public class CheckIfTwoStringArraysAreEquivalent {

  public CheckIfTwoStringArraysAreEquivalent() {


  }

  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

    StringBuilder string1 = new StringBuilder();
    StringBuilder string2 = new StringBuilder();


    for (int x = 0; x < word1.length; x++) {
      string1.append(word1[x]);
    }

    for (int x = 0; x < word2.length; x++) {
      string2.append(word2[x]);
    }

    if (string1.toString().equals(string2.toString())) {
      return true;
    }

    return false;

  }
}
