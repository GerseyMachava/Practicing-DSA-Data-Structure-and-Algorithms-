public class ReverseString {

    public static String reverseString(String originalString) {
        char[] originalStringArr = originalString.toCharArray();

        String result = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {

            result = result.concat(String.valueOf(originalStringArr[i]));

        }

        return result;
    }
}
