import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by 蔡小木 on 2016/5/17 0017.
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * UPDATE (2016/2/13):
 * The return format had been changed to zero-based indices. Please read the above updated description carefully.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum1(new int[]{2, 3, 7, 4}, 6)));
    }

    //Runtime: 63 ms
    private static int[] twoSum0(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if ((nums[i] + nums[j]) == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }

    //Runtime: 6 ms
    private static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> tracer = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (tracer.containsKey(nums[i])) {
                int left = tracer.get(nums[i]);
                return new int[]{left, i};
            } else {
                tracer.put(target - nums[i], i);
            }
        }
        return new int[2];
    }
}
