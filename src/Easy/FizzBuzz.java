package Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public FizzBuzz(){

  }

  public List<String> fizzBuzz(int n) {
    List <String> list = new ArrayList<>();
    for (int x = 1; x<=n;x++){
      if(x%3==0&& x%5==0){
        list.add("FizzBuzz");
      }else if(x%3==0){
        list.add("Fizz");
      }else if(x%5==0){
        list.add("Buzz");
      }else {
        list.add(Integer.toString(x));
      }
    }
    return list;
  }
}
