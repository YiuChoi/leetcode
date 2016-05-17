import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by 蔡小木 on 2016/5/17 0017.
 *
 *  leetcode 第一题
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum1(new int[]{2, 3, 7,4}, 6)));
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
