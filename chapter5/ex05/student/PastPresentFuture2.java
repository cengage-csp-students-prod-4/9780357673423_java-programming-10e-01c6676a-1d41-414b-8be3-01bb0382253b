import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDate today = LocalDate.now();

        System.out.print("Enter a month >> ");
        int month = input.nextInt();

        System.out.print("Enter a day >> ");
        int day = input.nextInt();

        System.out.print("Enter a year (four digits) >> ");
        int year = input.nextInt();

        LocalDate entered = LocalDate.of(year, month, day);

        if (entered.isBefore(today)) {
            System.out.println("The entered date is in the past");
        } 
        else if (entered.equals(today)) {
            System.out.println("The entered date is the current date");
        } 
        else if (entered.isAfter(today)) {
            System.out.println("The entered date is in the future");
        }
    }
}
