import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to compute factorial >> ");
        int limit = input.nextInt();

        int factorial = 1;

        for (int i = 1; i <= limit; i++) {
            factorial = factorial * i;
            System.out.println("The factorial of " + i + " is " + factorial);
        }
    }
}
