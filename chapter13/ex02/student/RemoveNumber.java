import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Enter integers or ZZZ to stop:");
        String entry = input.next();

        while (!entry.equalsIgnoreCase("ZZZ")) {
            numbers.add(Integer.parseInt(entry));
            entry = input.next();
        }

        System.out.println("Numbers:");
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.print("Enter a number to eliminate >> ");
        int numberToRemove = input.nextInt();

        iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().intValue() == numberToRemove) {
                iterator.remove();
                break;
            }
        }

        System.out.println("Numbers:");
        iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        input.close();
    }
}