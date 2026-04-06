package utils;

public class BannerPrinterUC7 {

    // Inner class to store character pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void printBanner() {

        CharacterPattern oPattern = new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[]{
                "*****",
                "*   *",
                "*****",
                "*    ",
                "*    "
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[]{
                "*****",
                "*    ",
                "*****",
                "    *",
                "*****"
        });

        String[] o = oPattern.getPattern();
        String[] p = pPattern.getPattern();
        String[] s = sPattern.getPattern();

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + " " + o[i] + " " + p[i] + " " + s[i]);
        }
    }
}