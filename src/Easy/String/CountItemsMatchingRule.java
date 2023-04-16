package Easy.String;

import java.util.List;

public class CountItemsMatchingRule {

  public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

    int indexRuleKey=0;
    if (ruleKey.equals("type")){
      indexRuleKey=0;
    } else if (ruleKey.equals("color")) {
      indexRuleKey=1;
    } else if (ruleKey.equals("name")){
      indexRuleKey=2;
    }

    int count=0;
    //alg to find based on ruleKey and ruleValue
    for(int x=0; x<items.size(); x++){
      if(items.get(x).get(indexRuleKey).equals(ruleValue)){
        count++;
      }
    }
    return count;
  }
}
