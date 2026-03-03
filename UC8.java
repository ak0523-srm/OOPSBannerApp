import java.util.HashMap;
import java.util.Map;

public class UC8 {

    private static final int HEIGHT = 7;
    private static final int WIDTH = 11;  // fixed width for each character

    private static class CharacterPattern {
        private final String[] pattern;

        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public String getLine(int index) {
            return pattern[index];
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPattern> map = new HashMap<>();

        // O (11 width each line)
        map.put('O', new CharacterPattern(new String[]{
                "   *****   ",
                "  **     ** ",
                " **       **",
                " **       **",
                " **       **",
                "  **     ** ",
                "   *****   "
        }));

        // P
        map.put('P', new CharacterPattern(new String[]{
                " ******     ",
                " **     **  ",
                " **     **  ",
                " ******     ",
                " **          ",
                " **          ",
                " **          "
        }));

        // S
        map.put('S', new CharacterPattern(new String[]{
                "   ******   ",
                "  **        ",
                "  **        ",
                "   *****     ",
                "        **   ",
                "        **   ",
                "  ******     "
        }));

        renderBanner("OOPS", map);
    }

    public static void renderBanner(String word, Map<Character, CharacterPattern> map) {

        for (int i = 0; i < HEIGHT; i++) {

            StringBuilder sb = new StringBuilder();

            for (char c : word.toUpperCase().toCharArray()) {

                CharacterPattern cp = map.get(c);

                if (cp != null) {
                    sb.append(String.format("%-13s", cp.getLine(i)));
                } else {
                    sb.append("             ");
                }
            }

            System.out.println(sb);
        }
    }
}