package Lab2;

import java.util.Scanner;

/**
 * Driver class to test WordProcessor.
 */
public class Driver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get sentence from user.
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Create WordProcessor object.
        WordProcessor processor = new WordProcessor();

        // Set fallback text.
        processor.setText("Java Programming is interesting");

        // Test using WordProcessor datatype.
        System.out.println("\n===== WORDPROCESSOR TEST =====");

        System.out.println("Using user input:");

        System.out.println("Words: "
                + processor.countWords(sentence));

        System.out.println("Letters: "
                + processor.countLetters(sentence));

        System.out.println("Length: "
                + processor.getLength(sentence));

        // Test using null values.
        System.out.println("\nUsing null values:");

        System.out.println("Words: "
                + processor.countWords(null));

        System.out.println("Letters: "
                + processor.countLetters(null));

        System.out.println("Length: "
                + processor.getLength(null));

        // Change reference datatype to Counter.
        Counter counter = processor;

        System.out.println("\n===== COUNTER TEST =====");

        System.out.println("Using user input:");

        System.out.println("Words: "
                + counter.countWords(sentence));

        System.out.println("Letters: "
                + counter.countLetters(sentence));

        System.out.println("Length: "
                + counter.getLength(sentence));

        // Test null values through Counter.
        System.out.println("\nUsing null values:");

        System.out.println("Words: "
                + counter.countWords(null));

        System.out.println("Letters: "
                + counter.countLetters(null));

        System.out.println("Length: "
                + counter.getLength(null));

        scanner.close();
    }
}
