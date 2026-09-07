import java.time.LocalDate;
import java.util.Scanner;

public class TestMonthHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month >> ");
        int m1 = input.nextInt();
        System.out.print("Enter day >> ");
        int d1 = input.nextInt();
        System.out.print("Enter year >> ");
        int y1 = input.nextInt();

        System.out.print("Enter month >> ");
        int m2 = input.nextInt();
        System.out.print("Enter day >> ");
        int d2 = input.nextInt();
        System.out.print("Enter year >> ");
        int y2 = input.nextInt();

        LocalDate first = LocalDate.of(y1, m1, d1);
        LocalDate second = LocalDate.of(y2, m2, d2);

        System.out.println("First date " + first);
        System.out.println("Second date " + first.plusMonths(1));
        System.out.println("Third date " + first.plusMonths(2));
        System.out.println("Fourth date " + first.plusMonths(3));

        System.out.println("First date " + second);
        System.out.println("Second date " + second.plusMonths(1));
        System.out.println("Third date " + second.plusMonths(2));
        System.out.println("Fourth date " + second.plusMonths(3));
    }
}
