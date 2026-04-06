package utils;

import java.util.HashMap;
import java.util.Map;

public class BannerPrinterUC8 {

    public static void printBanner(String text) {

        Map<Character, String[]> patterns = getPatterns();

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (char ch : text.toCharArray()) {

                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + " ");
                }
            }
            System.out.println();
        }
    }

    // Store patterns in HashMap
    private static Map<Character, String[]> getPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "*****",
                "*   *",
                "*****",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                "*****",
                "*    ",
                "*****",
                "    *",
                "*****"
        });

        return map;
    }
}