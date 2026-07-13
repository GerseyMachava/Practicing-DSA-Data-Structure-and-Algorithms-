
public class ExtractEmailInformation {

    public  static void extractEmailInformation(String str) {
        String[] stringArr = str.split("@");

        boolean isBrazilian = stringArr[1].endsWith(".br");
        System.out.println("Email: " + stringArr[0]);
        System.out.println("domain: " + stringArr[1]);
        System.out.println("is Basilian?: " + isBrazilian);

    }
}
