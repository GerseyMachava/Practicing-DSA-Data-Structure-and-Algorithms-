public class RemoveNonDigits {

    public static String removeNonDigits(String str) {
        char charArr[] = str.toCharArray();
        String newString = "";

        for (int i = 0; i < charArr.length; i++) {
            if (Character.isDigit(charArr[i])) {
                newString = newString.concat(String.valueOf(charArr[i]));
            }
        }
        return newString;
    }

    //Mais eficiente
    public static String removeNonDigits2(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c); // Modifica a mesma string
            }
        }
        return sb.toString();
    }

}
