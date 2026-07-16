public class SpaceRemover {

    public static String spaceRemover(String phrase) {
        char[] phraseArr = phrase.toCharArray();
        String result = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (phraseArr[i] !=' ') {
               result = result.concat(String.valueOf(phraseArr[i]));
            } 
        }
        return result;
    }

}
