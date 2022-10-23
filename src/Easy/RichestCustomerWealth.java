package Easy;

public class RichestCustomerWealth {
  public RichestCustomerWealth(){

  }

  public int maximumWealth(int[][] accounts) {

    int count =1;
    int total = 0;
    int biggest = 0;

    System.out.println("Which customer has the most wealth?");
    System.out.println();
    for (int row=0; row< count; row++){
      for (int col=0; col< accounts[row].length; col++){
          if(col==accounts[row].length-1){
            total+= accounts[row][col];
            System.out.print(accounts[row][col]+" = " + total);
          }else {
            total+= accounts[row][col];
            System.out.print(accounts[row][col]+" + ");
          }
      }
      System.out.println();
      if(total>biggest){
        biggest=total;
      }
      if(count==accounts.length) {
        break;
      }else {

        total =0;
        count++;
      }
    }
    System.out.println();
    return biggest;
  }
}
