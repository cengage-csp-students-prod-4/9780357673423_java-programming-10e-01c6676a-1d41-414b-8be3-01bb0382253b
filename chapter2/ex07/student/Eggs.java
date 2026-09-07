public class Eggs {
    public static void main(String[] args) {
        java.util.Scanner input = new java. util.Scanner(System.in);

        // Prompt user
        System.out.print("Enter the number of eggs: ");
        int eggs = input.nextInt();

        // Prices
        final double DOZEN_PRICE = 3.25;
        final double SINGLE_PRICE = 0.45;

        // Calculations
        int dozens = eggs / 12;
        int loose = eggs % 12;

        double total = (dozens * DOZEN_PRICE) + (loose * SINGLE_PRICE);
        // Display explanation
        System.out.println("You ordered " + eggs + " eggs.");
        System.out.println("That's " + dozens + " dozen at $" + DOZEN_PRICE +
                           " per dozen and " + loose + " loose eggs at " +
                           SINGLE_PRICE + " cents each for a total of $" +
                           String.format("%.2f", total) + ".");
    
    }
}