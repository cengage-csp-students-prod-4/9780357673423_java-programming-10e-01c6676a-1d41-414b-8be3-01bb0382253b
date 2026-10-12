import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers or ZZZ to stop:");
        while (input.hasNext()) {
            String entry = input.next();

            if (entry.equalsIgnoreCase("ZZZ")) {
                if (numbers.size() >= 4) {
                    break;
                }
                System.out.println("Please enter at least four integers.");
            } else {
                numbers.add(Integer.parseInt(entry));
            }
        }

        displayNumbers(numbers);

        System.out.print("Enter a number to eliminate >> ");
        int numberToRemove = input.nextInt();
        numbers.remove(Integer.valueOf(numberToRemove));

        displayNumbers(numbers);
        input.close();
    }

    private static void displayNumbers(ArrayList<Integer> numbers) {
        System.out.println("Numbers:");
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}