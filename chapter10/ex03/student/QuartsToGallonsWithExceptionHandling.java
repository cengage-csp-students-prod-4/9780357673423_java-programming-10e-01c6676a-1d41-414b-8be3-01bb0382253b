import java.util.Scanner;

public class QuartsToGallonsWithExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int QUARTS_PER_GALLON = 4;
        int quarts;

        while (true) {
            System.out.print("Enter quarts needed >> ");

            try {
                quarts = Integer.parseInt(input.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Invalid data entry");
            }
        }

        int gallons = quarts / QUARTS_PER_GALLON;
        int remainingQuarts = quarts % QUARTS_PER_GALLON;

        System.out.println("A job that needs " + quarts
                + " quarts requires " + gallons
                + " gallons plus " + remainingQuarts + " quarts.");

        input.close();
    }
}