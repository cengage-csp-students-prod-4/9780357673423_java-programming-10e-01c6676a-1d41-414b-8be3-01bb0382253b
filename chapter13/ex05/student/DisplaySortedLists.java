import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DisplaySortedLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.print("Enter a word or quit to quit >> ");
        String entry = input.nextLine();

        while (!entry.equals("quit")) {
            words.add(entry);
            Collections.sort(words);
            display(words);

            System.out.print("Enter a word or quit to quit >> ");
            entry = input.nextLine();
        }

        System.out.print("Enter a number or quit to quit >> ");
        entry = input.nextLine();

        while (!entry.equals("quit")) {
            numbers.add(Integer.parseInt(entry));
            Collections.sort(numbers);
            display(numbers);

            System.out.print("Enter a number or quit to quit >> ");
            entry = input.nextLine();
        }

        input.close();
    }

    public static void display(ArrayList<?> list) {
        System.out.println("The size of the list is " + list.size());

        for (Object item : list) {
            System.out.println(item);
        }
    }
}