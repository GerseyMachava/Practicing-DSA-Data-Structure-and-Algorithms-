public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] stringArr) {

        // Edge Cases
        if (stringArr == null || stringArr.length == 0) {
            return "";
        }
        String result = "";
        String first = stringArr[0];
        // for loop

        for (int i = 0; i < first.length(); i++) {
            char currentChar = first.charAt(i);
            for (int j = 1; j < stringArr.length; j++) {
                if (i >= stringArr[j].length() || stringArr[j].charAt(i) != currentChar) {
                    return result;
                }
            }
            result = result.concat(String.valueOf(currentChar));

        }

        return result;
    }

}
