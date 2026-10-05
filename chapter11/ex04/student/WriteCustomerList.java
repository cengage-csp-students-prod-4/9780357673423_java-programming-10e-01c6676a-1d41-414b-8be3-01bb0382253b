import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class WriteCustomerList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("CustomerList.txt"))) {
            System.out.print("Enter ID number or ZZZ to quit >> ");
            String id = input.nextLine().trim();

            while (!id.equals("ZZZ")) {
                System.out.print("Enter first name >> ");
                String firstName = input.nextLine().trim();
                System.out.print("Enter last name >> ");
                String lastName = input.nextLine().trim();
                System.out.print("Enter balance >> ");
                double balance = Double.parseDouble(input.nextLine().trim());

                writer.write(String.format(Locale.US, "%s,%s,%s,%.2f",
                        id, firstName, lastName, balance));
                writer.newLine();

                System.out.print("Enter ID number or ZZZ to quit >> ");
                id = input.nextLine().trim();
            }
        } catch (IOException e) {
            System.out.println("Unable to write CustomerList.txt: " + e.getMessage());
        }
    }
}
