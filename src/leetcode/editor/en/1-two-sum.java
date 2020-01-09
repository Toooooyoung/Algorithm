package leetcode.editor.en;// Given an array of integers, return indices of the two numbers such that they a
// dd up to a specific target.
//
// You may assume that each input would have exactly one solution, and you may n
// ot use the same element twice.
//
// Example:
//
//
// Given nums = [2, 7, 11, 15], target = 9,
//
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].
//
// Related Topics Array Hash Table

// leetcode submit region begin(Prohibit modification and deletion)
import java.util.Arrays;
import java.util.HashMap;
class TwoSumSolution {
  public int[] twoSum(int[] nums, int target) {
    // use HashMap
    if (nums == null || nums.length == 0) return new int[] {0, 0};

    HashMap<Integer, Integer> res = new HashMap<>();
    int i = 0;
    for (int num : nums) {
      if (res.containsKey(num)) {
        return new int[] {res.get(num), i};
      } else {
        res.put(target - num, i);
        i += 1;
      }
    }
    return new int[] {0, 0};
  }
}
// leetcode submit region end(Prohibit modification and deletion)
