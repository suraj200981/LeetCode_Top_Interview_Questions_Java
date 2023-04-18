
import Easy.String.CheckIfTwoStringArraysAreEquivalent;
import Easy.String.SortingTheSentence;


public class Main {
    public static void main(String[] args) {

        CheckIfTwoStringArraysAreEquivalent program = new CheckIfTwoStringArraysAreEquivalent();

        String [] word1 = new String[]{"ab","c"};
        String [] word2 = new String[]{"a","bc"};

        System.out.println("Output : "+ program.arrayStringsAreEqual(word1,word2));



    }
}