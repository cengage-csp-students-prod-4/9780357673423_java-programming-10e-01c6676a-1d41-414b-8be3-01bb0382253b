import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDate today = LocalDate.now();
        int currentMonth = today.getMonthValue();
        int currentYear = today.getYear();

        System.out.print("Enter a month >> ");
        int month = input.nextInt();

        System.out.print("Enter a day >> ");
        int day = input.nextInt();

        System.out.print("Enter a year (four digits) >> ");
        int year = input.nextInt();

        if (year != currentYear) {
            System.out.println(month + " is not this year");
        } else if (month < currentMonth) {
            System.out.println(month + " is in an earlier month this year");
        } else if (month > currentMonth) {
            System.out.println(month + " is in a later month this year");
        } else {
            System.out.println(month + " is this month");
        }
    }
}
