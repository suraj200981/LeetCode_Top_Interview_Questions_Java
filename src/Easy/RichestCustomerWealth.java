package Easy;

public class RichestCustomerWealth {
  public RichestCustomerWealth(){

  }

  public int maximumWealth(int[][] accounts) {
    int count =1;
    int total = 0;
    int biggest = 0;
    for (int row=0; row< count; row++){
      for (int col=0; col< accounts[row].length; col++){
          if(col==accounts[row].length-1){
            total+= accounts[row][col];
          }else {
            total+= accounts[row][col];
          }
      }
      if(total>biggest){
        biggest=total;
      }
      if(count==accounts.length) {
        break;
      }
        total =0;
        count++;
    }
    return biggest;
  }
}
