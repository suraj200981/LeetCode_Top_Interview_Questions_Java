import Easy.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String [] sentences = new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        MostWordsFound program = new MostWordsFound();
        System.out.println("Output: "+ program.mostWordsFound(sentences));

    }
}