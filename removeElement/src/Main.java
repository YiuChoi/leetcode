/**
 * Given an array and a value, remove all instances of that > value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.+
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1,2,3,2,54,65,2,23},2));
        System.out.println(removeElement(new int[]{1,2,3,2,54,65,2,2},3));
    }


    private static int removeElement(int[] arr, int value) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                continue;
            }
            arr[j] = arr[i];
            j++;
        }
        return j;
    }
}
