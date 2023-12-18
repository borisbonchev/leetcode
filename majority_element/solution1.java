package majority_element;

class Solution {
    public int majorityElement(int[] nums) {
        int majEl = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                majEl = num;
            }
            if (num == majEl) {
                count++;
            } else {
                count--;
            }
        }
        return majEl;
    }
}
