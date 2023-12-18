package remove_duplicates;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> uniqueNumbers = new ArrayList<Integer>();
        int i = 0;
        int arrayLength = nums.length;

        while (i < arrayLength) {
            if (uniqueNumbers.contains(nums[i])) {
                for (int j = i; j < arrayLength - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                arrayLength--;
            } else {
                uniqueNumbers.add(nums[i]);
                i++;
            }
        }
        return arrayLength;
    }
}
