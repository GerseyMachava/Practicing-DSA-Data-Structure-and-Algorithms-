public class FindEvenNumbers {
    public static int findNumbers(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            int numberLength = String.valueOf(Math.abs(arr[i])).length();
            if (numberLength % 2 == 0) {
                count++;
            }
        }
        return count;

    }

}
