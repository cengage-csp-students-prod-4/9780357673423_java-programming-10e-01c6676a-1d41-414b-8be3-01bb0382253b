public class Eggs {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of eggs: ");
        int eggs = input.nextInt();

        int dozens = eggs / 12;
        int loose = eggs % 12;

        double total = (dozens * 3.25) + (loose * 0.45);

        System.out.println("You ordered " + eggs + " eggs. That's " +
                dozens + " dozen at $3.25 per dozen and " +
                loose + " loose eggs at 45 cents each for a total of $" +
                String.format("%.2f", total) + ".");
    }
}
