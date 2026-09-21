import java.util.Scanner;

public class ArrayMethodDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Prompt user for 10 integers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer #" + (i + 1) + " >> ");
            numbers[i] = input.nextInt();
        }

        System.out.println();

        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, 12);
        displayHigherThanAverage(numbers);
    }

    // (1) Display all integers
    public static void display(int[] nums) {
        System.out.print("The numbers are ");
        for (int n : nums) {
            System.out.print(" " + n + " ");
        }
        System.out.println("\n");
    }

    // (2) Display integers in reverse order
    public static void displayReverse(int[] nums) {
        System.out.print("The numbers in reverse order are ");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(" " + nums[i] + " ");
        }
        System.out.println("\n");
    }

    // (3) Display the sum of integers
    public static void displaySum(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("The sum of all numbers is " + sum + "\n");
    }

    // (4) Display values less than a limit
    public static void displayLessThan(int[] nums, int limit) {
        System.out.print("");
        boolean found = false;

        for (int n : nums) {
            if (n < limit) {
                System.out.print(n + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No numbers are less than the limit " + limit);
        } else {
            System.out.println("are less than the limit " + limit);
        }

        System.out.println();
    }

    // (5) Display values higher than the average
    public static void displayHigherThanAverage(int[] nums) {
        double sum = 0;
        for (int n : nums) {
            sum += n;
        }

        double avg = sum / nums.length;
        System.out.println("The average is " + avg);

        for (int n : nums) {
            if (n > avg) {
                System.out.print(" " + n + " ");
            }
        }

        System.out.println(" are greater than the average\n");
    }
}
