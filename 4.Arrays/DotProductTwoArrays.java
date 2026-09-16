public class DotProductTwoArrays {

    public static int dotProduct(int[] arr, int[] arr2) {
        int result = 0;
        if (arr == null || arr2 == null) {
            throw new IllegalArgumentException("Arrays must not be null");
        }
        if (arr.length != arr2.length) {
            throw new IllegalArgumentException("The arrays have different length");
        }
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] * arr2[i];
        }
        return result;
    }
}
