/**
 * Created by 蔡小木 on 2016/5/17 0017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo2(3));
    }

    //Runtime: 5 ms
    private static boolean isPowerOfTwo0(int n) {
        for (int i = 0; ; i++) {
            if (Math.pow(2, i) == n) {
                return true;
            }
            if (Math.pow(2, i) > n || n <= 0) {
                return false;
            }
        }
    }

    //Runtime: 2 ms
    //This is kind of cheating, but the idea is that a power of two in binary form has and only has one "1".
    private static boolean isPowerOfTwo1(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }

    //Runtime: 2 ms
    private static boolean isPowerOfTwo2(int n) {
        return ((n & (n - 1)) == 0 && n > 0);
    }
}
