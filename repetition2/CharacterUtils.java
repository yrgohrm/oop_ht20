public class CharacterUtils {
    public static boolean isConsonant(char c) {
        int res = "aouåeiyäöAOUÅIEYÄÖ".indexOf(c);
        return res == -1 && Character.isAlphabetic(c);
    }
}
