import Easy.BestTimeToBuyAndSellStockII;
import Easy.RemoveDuplicationsFromSortedArray;

public class Main {
    public static void main(String[] args) {

        RemoveDuplicationsFromSortedArray one = new RemoveDuplicationsFromSortedArray();
        BestTimeToBuyAndSellStockII two = new BestTimeToBuyAndSellStockII();

//        int [] nums = {1,1,2,2,2,3,3,4,4};
//        System.out.println("Output: "+one.removeDuplicates(nums));

        int [] prices = {1,5,3,6,4};

        System.out.println("Output: "+ two.maxProfit(prices));
    }
}