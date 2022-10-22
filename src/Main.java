import Easy.BestTimeToBuyAndSellStockII;
import Easy.RemoveDuplicationsFromSortedArray;
import Easy.RunningSumOf1dArray;

public class Main {
    public static void main(String[] args) {

        RemoveDuplicationsFromSortedArray one = new RemoveDuplicationsFromSortedArray();
        BestTimeToBuyAndSellStockII two = new BestTimeToBuyAndSellStockII();
        RunningSumOf1dArray three = new RunningSumOf1dArray();

//        int [] nums = {1,1,2,2,2,3,3,4,4};
//        System.out.println("Output: "+one.removeDuplicates(nums));

//        int [] prices = {1,5,3,6,4};

        int [] nums = {1,2,3,4};

        System.out.println("Output: ");
        three.result(three.runningSum(nums));
    }
}