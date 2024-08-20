
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > highest) {
                highest = nums.get(i);
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < lowest) {
                lowest = nums.get(i);
            }
        }

        return highest - lowest;
    }
}
