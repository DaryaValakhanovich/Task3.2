import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 3, 1, 5, 5, 4, 7, 1, 5, 4, 9, 11, 11, 11};
        System.out.println(Arrays.toString(newArray(array)));
    }


    private static int[] newArray(int[] original) {
        int lengthOfNewArray = numberOfRepeat(original);
        int[] result = new int[lengthOfNewArray];
        result[0] = original[0];
        int x = 1;
        for (int i = 1; i < original.length; i++) {
               if (!isRepeated(Arrays.copyOfRange(original, 0, i), original[i])) {
                   result[x] = original[i];
                    x++;
                }
           }
        return result;
    }

    private static boolean isRepeated(int[] array, int x) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == x) {
                return true;
            }
        }
        return false;
    }

    private static int numberOfRepeat(int[] original){
        int result = 0;
        for (int i = 1; i < original.length; i++) {
            for (int k = i - 1; k >= 0; k--) {
                if (original[i] == original[k]) {
                    result++;
                    k = 0;
                }
            }
        }
        return result;
    }
}
