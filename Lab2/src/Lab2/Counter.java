package Lab2;


/**
 * Counter interface
 * Defines methods for counting words, letters and characters.
 */
public interface Counter {

    /**
     * Counts the number of words in a sentence.
     * @param sentence the text to count words in
     * @return the number of words
     */
    int countWords(String sentence);

    /**
     * Counts the number of alphabetic letters in a sentence.
     * @param sentence the text to count letters in
     * @return the number of letters
     */
    int countLetters(String sentence);

    /**
     * Returns the total length of a sentence, including spaces.
     * @param sentence the text to measure
     * @return the total number of characters
     */
    int getLength(String sentence);
}

