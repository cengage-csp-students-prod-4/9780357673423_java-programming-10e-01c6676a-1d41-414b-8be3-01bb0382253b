import java.util.Scanner;

public class DemoTees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TeeShirt shirt1 = new TeeShirt();
        TeeShirt shirt2 = new TeeShirt();
        CustomTee custom1 = new CustomTee();
        CustomTee custom2 = new CustomTee();

        enterDetails(input, shirt1);
        enterDetails(input, shirt2);

        enterDetails(input, custom1);
        System.out.print("Enter slogan for shirt >> ");
        custom1.setSlogan(input.nextLine());

        enterDetails(input, custom2);
        System.out.print("Enter slogan for shirt >> ");
        custom2.setSlogan(input.nextLine());

        displayDetails(shirt1);
        displayDetails(shirt2);

        displayDetails(custom1);
        System.out.println("Slogan: " + custom1.getSlogan());

        displayDetails(custom2);
        System.out.println("Slogan: " + custom2.getSlogan());

        input.close();
    }

    public static void enterDetails(Scanner input, TeeShirt shirt) {
        System.out.print("Enter order number >> ");
        shirt.setOrderNumber(Integer.parseInt(input.nextLine().trim()));

        System.out.print("Enter color >> ");
        shirt.setColor(input.nextLine());

        System.out.print("Enter size >> ");
        shirt.setSize(input.nextLine().trim());
    }

    public static void displayDetails(TeeShirt shirt) {
        System.out.println("Order #" + shirt.getOrderNumber());
        System.out.println("Description: " + shirt.getSize()
                + " " + shirt.getColor());
        System.out.printf("Price: $%.2f%n", shirt.getPrice());
    }
}