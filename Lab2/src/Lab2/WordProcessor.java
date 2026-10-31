package Lab2;

/**
 * WordProcessor implements the Counter interface.
 * It counts words, letters and characters.
 */
public class WordProcessor implements Counter {

    // Stores fallback text.
    private String text;

    /**
     * Returns the stored text.
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the stored fallback text.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Counts words in a sentence.
     * Uses stored text if sentence is null.
     */
    @Override
    public int countWords(String sentence) {

        if (sentence == null) {
            sentence = text;
        }

        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }

        return sentence.trim().split("\\s+").length;
    }

    /**
     * Counts alphabetic letters in a sentence.
     * Uses stored text if sentence is null.
     */
    @Override
    public int countLetters(String sentence) {

        if (sentence == null) {
            sentence = text;
        }

        if (sentence == null) {
            return 0;
        }

        int letters = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            }
        }

        return letters;
    }

    /**
     * Returns sentence length, including spaces.
     * Uses stored text if sentence is null.
     */
    @Override
    public int getLength(String sentence) {

        if (sentence == null) {
            sentence = text;
        }

        if (sentence == null) {
            return 0;
        }

        return sentence.length();
    }
}
