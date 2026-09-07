import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the room's length >> ");
        double length = input.nextDouble();

        System.out.print("Enter the room's width >> ");
        double width = input.nextDouble();

        System.out.print("Enter the room's height >> ");
        double height = input.nextDouble();

        double price = computeArea(length, width, height);

        System.out.println("The price to paint the room is $" + price);
    }

    public static double computeArea(double length, double width, double height) {
        // Wall area = 2 * (length * height) + 2 * (width * height)
        double area = 2 * (length * height) + 2 * (width * height);

        double gallons = computeGallons(area);

        System.out.println("You will need " + gallons + " gallons");

        double price = gallons * 32.0;
        return price;
    }

    public static double computeGallons(double area) {
        return area / 350.0;
    }
}
