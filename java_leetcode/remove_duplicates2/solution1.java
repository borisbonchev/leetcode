package remove_duplicates2;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Occurrence> uniqueNumbers = new HashMap<Integer, Occurrence>();
        int i = 0;
        int arrayLength = nums.length;

        while (i < arrayLength) {
            if (uniqueNumbers.get(nums[i]) == Occurrence.Once) {
                uniqueNumbers.put(nums[i], Occurrence.Twice);
                i++;
            } else if (uniqueNumbers.get(nums[i]) == Occurrence.Twice) {
                for (int j = i; j < arrayLength - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                arrayLength--;
            } 
            else {
                uniqueNumbers.put(nums[i], Occurrence.Once);
                i++;
            }
        }
        return arrayLength;
    }

    enum Occurrence {
        Once, Twice, None
    }
}