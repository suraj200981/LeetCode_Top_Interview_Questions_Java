import Easy.String.BalancedStrings;
import Easy.String.CountItemsMatchingRule;
import Easy.String.DecodeTheMessage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CountItemsMatchingRule program = new CountItemsMatchingRule();
//        System.out.println("Output for 2,2,1: "+ program.singleNumberFunc(new int[]{2,2,1}));

        List<List<String>> allItems = new ArrayList<>();

        List<String> item1= new ArrayList<>();
        List<String> item2= new ArrayList<>();
        List<String> item3= new ArrayList<>();

        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");

        item2.add("computer");
        item2.add("silver");
        item2.add("phone");

        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");

        allItems.add(item1);
        allItems.add(item2);
        allItems.add(item3);

        System.out.println("Heres what i found : "+ program.countMatches(allItems, "type",
                "phone"));



    }
}