
import Easy.String.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        CountConsistentStrings program = new CountConsistentStrings();

        String[] words = new String[]{"a","b","c","ab","ac","bc","abc"};
        String[] words1 = new String[]{"ad","bd","aaab","baa","badab"};

        System.out.println("Output : "+ program.countConsistentStrings("abc", words));



    }
}