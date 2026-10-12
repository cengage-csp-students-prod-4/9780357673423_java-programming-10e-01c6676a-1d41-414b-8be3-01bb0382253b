import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CommaPlacement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.print("Enter a word or ZZZ to quit >> ");
        String word = input.nextLine();

        while (!word.equals("ZZZ")) {
            words.add(word);
            System.out.print("Enter another word or ZZZ to quit >> ");
            word = input.nextLine();
        }

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());

            if (iterator.hasNext()) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }

        System.out.println();
        input.close();
    }
}