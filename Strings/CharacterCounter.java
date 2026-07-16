public class CharacterCounter {

    public static int characterCounter(String word, char character) {
        char[] wordArr = word.toCharArray();
        int occurrence = 0;

        for (int i = 0; i < wordArr.length; i++) {
            if (wordArr[i] == character) {
                occurrence++;
            }
        }
        return occurrence;
    }

    /*
    
    public static int characterCounter(String word, char character) {
    int count = 0;
    for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) == character) {
            count++;
        }
    }
    return count;
}
    
    */
}
