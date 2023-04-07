package Easy.Algorithms;

public class BalancedStrings {

  public int balancedStringSplit(String s) {

    int rCount= 0;
    int lCount=0;
    int answer=0;
    for(int x=0; x<s.length();x++){
      if(s.charAt(x) =='R'){
        rCount+=1;
      }else{
        lCount+=1;
      }

      if(rCount==lCount){
        answer++;
      }

    }

    System.out.println("Total R: "+ rCount);
    System.out.println();
    System.out.println("Total L: "+ lCount);
    System.out.println();
    System.out.println("Answer: "+answer);


    return answer;
  }
}
