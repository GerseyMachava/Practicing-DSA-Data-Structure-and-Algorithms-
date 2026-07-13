public class ExtractDateData {

    public static void extractDateData(String str) {
        String[] strArr = str.split("/");
        String day = strArr[0];
        String month = strArr[1];
        String year = strArr[2];

        if (month.startsWith("0")) {
            month = month.replace('0', ' ');
        }
        if (day.startsWith("0")) {
            day = day.replace('0', ' ');
        }

        System.out.println("Day:" + day);
        System.out.println("Month:" + month);
        System.out.println("Year:" + year);
    }

}
