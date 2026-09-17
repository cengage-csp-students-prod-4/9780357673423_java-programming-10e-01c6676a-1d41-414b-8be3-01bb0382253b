import java.util.Scanner;

public class IncreasedProduction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter worker's current production level >> ");
        double production = input.nextDouble();

        double current = production;
        int monthExceeded = -1;

        for (int month = 1; month <= 24; month++) {
            current = current * 1.06;
            System.out.println("Month " + month + "     Predicted production is " + current);

            if (current > 10000.0 && monthExceeded == -1) {
                monthExceeded = month;
            }
        }

        if (monthExceeded == -1) {
            System.out.println("This worker will not reach 10000.0 in 24 months");
        } else {
            System.out.println("The month in which production exceeds 10000.0 is month #" + monthExceeded);
        }
    }
}
