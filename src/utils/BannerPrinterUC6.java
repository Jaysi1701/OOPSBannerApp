package utils;

public class BannerPrinterUC6 {

    public static void printBanner() {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + " " + o[i] + " " + p[i] + " " + s[i]);
        }
    }

    // Function for O
    public static String[] getOPattern() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Function for P
    public static String[] getPPattern() {
        return new String[]{
                "*****",
                "*   *",
                "*****",
                "*    ",
                "*    "
        };
    }

    // Function for S
    public static String[] getSPattern() {
        return new String[]{
                "*****",
                "*    ",
                "*****",
                "    *",
                "*****"
        };
    }
}