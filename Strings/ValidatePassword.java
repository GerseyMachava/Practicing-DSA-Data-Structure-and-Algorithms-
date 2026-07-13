public class ValidatePassword {

    public static boolean validatePassword(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        if (str.length() < 8) {
            return false;
        }
        if (!checkIfHasLetter(str)) {
            return false;
        }
        if (!checkIfHasDigit(str)) {
            return false;
        }
        if (!checkIfHasSpecialCharacter(str)) {
            return false;
        }

        return true;

    }

    public static boolean checkIfHasLetter(String str) {
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                return true;
            }

        }
        return false;
    }

    public static boolean checkIfHasDigit(String str) {
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isDigit(charArr[i])) {
                return true;
            }

        }
        return false;
    }

    public static boolean checkIfHasSpecialCharacter(String str) {
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '@' || charArr[i] == '#' || charArr[i] == '&') {
                return true;
            }

        }

        return false;

    }

}
