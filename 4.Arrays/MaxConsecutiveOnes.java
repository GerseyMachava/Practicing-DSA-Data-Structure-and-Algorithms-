
public class MaxConsecutiveOnes {

    public static int consecutiveOnes(int[] arr) {
        int consecutiveOnes = 0;
        int maxConsecutive = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                consecutiveOnes++;
                if (consecutiveOnes > maxConsecutive) {
                    maxConsecutive = consecutiveOnes;
                }
            } else {
                consecutiveOnes = 0; // reseta ao encontrar um 0
            }
        }

        return maxConsecutive;
    }
}
