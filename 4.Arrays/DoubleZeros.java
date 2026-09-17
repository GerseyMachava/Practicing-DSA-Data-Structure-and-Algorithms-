public class DoubleZeros {

    public static int[] doubleZeros(int[] arrayOfNumbers) {
        int[] result = new int[arrayOfNumbers.length];
        int writePos = 0;

        for (int i = 0; i < arrayOfNumbers.length && writePos < arrayOfNumbers.length; i++) {
            result[writePos] = arrayOfNumbers[i];
            writePos++;

            if (arrayOfNumbers[i] == 0 && writePos < arrayOfNumbers.length) {
                result[writePos] = 0;
                writePos++;
            }
        }
        return result;
    }

}
