public class CharUtils {
    public static boolean isConsonant(char c) {
        int res = "aouåeiyäöAOUÅIEYÄÖ".indexOf(c);
        return res == -1 && Character.isAlphabetic(c);
    }

    public static boolean isVowel(char c) {
        return Character.isAlphabetic(c) && !isConsonant(c);
    }

    public static LetterType classifyLetter(char c) {
        if (isVowel(c)) {
            return LetterType.VOWEL;
        }
        else if (isConsonant(c)) {
            return LetterType.CONSONANT;
        }
        else {
            return LetterType.OTHER;
        }
    }
}