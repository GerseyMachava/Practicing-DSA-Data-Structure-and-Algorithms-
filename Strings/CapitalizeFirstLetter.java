public class CapitalizeFirstLetter {

    public static String capitalizeFirstLetter(String originalString) {

        char[] charArr = originalString.toCharArray();
        String result = "";
        for (int i = 0; i < originalString.length(); i++) {

            if (i == 0) {
                result = result.concat(String.valueOf(charArr[0]).toUpperCase());
                continue;
            }
            if (charArr[i] == ' ') {
                result = result.concat(String.valueOf(charArr[i]).toUpperCase());
                result = result.concat(String.valueOf(charArr[i + 1]).toUpperCase());
                i = i + 1;
            } else {
                result = result.concat(String.valueOf(charArr[i]));
            }

        }

        return result;
    }

    /*
    
    public static String capitalizeFirstLetter(String originalString) {
    if (originalString == null || originalString.isEmpty()) {
        return originalString;
    }
    
    StringBuilder result = new StringBuilder();
    boolean capitalizeNext = true;
    
    for (char c : originalString.toCharArray()) {
        if (c == ' ') {
            result.append(c);
            capitalizeNext = true;
        } else if (capitalizeNext) {
            result.append(Character.toUpperCase(c));
            capitalizeNext = false;
        } else {
            result.append(c);
        }
    }
    
    return result.toString();
}
    
    
    */
}
