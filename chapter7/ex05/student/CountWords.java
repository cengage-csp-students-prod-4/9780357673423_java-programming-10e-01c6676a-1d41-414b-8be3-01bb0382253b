import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string >> ");
        String text = input.nextLine();

        // Characters that separate words
        String separators = "[ .,;?!-]+";

        // Trim leading/trailing separators
        text = text.trim();

        // If the string becomes empty, word count is 0
        if (text.isEmpty()) {
            System.out.println("There are 0 words in the string");
            return;
        }

        // Split on any combination of separators
        String[] words = text.split(separators);

        System.out.println("There are " + words.length + " words in the string");
    }
}
