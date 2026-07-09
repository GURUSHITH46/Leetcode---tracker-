// Last updated: 09/07/2026, 09:11:09
import java.util.HashMap;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
             map.put(nums[i], i);
        }
         return new int[] {};
    }
}
