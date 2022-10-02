import Easy.RemoveDuplicationsFromSortedArray;

public class Main {
    public static void main(String[] args) {

        RemoveDuplicationsFromSortedArray one = new RemoveDuplicationsFromSortedArray();

        int [] nums = {1,1,2,2,2,3,3,4,4};
        System.out.println("Output: "+one.removeDuplicates(nums));
    }
}