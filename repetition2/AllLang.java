public class AllLang implements Translator {

    @Override
    public String getLanguage() {
        return "all language";
    }

    @Override
    public String translate(String text) {
        StringBuilder builder = new StringBuilder();
        boolean isNewWord = true;
        for (int i = 0; i < text.length(); ++i) {
            char c = text.charAt(i);
            if (CharacterUtils.isConsonant(c) && isNewWord) {
                builder.append(c).append("all");
                isNewWord = false;
            }
            else {
                if (c == ' ') {
                    isNewWord = true;
                }

                builder.append(c);
            }
        }

        return builder.toString();
    }
    
}
