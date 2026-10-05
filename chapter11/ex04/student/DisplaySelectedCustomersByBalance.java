import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DisplaySelectedCustomersByBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minimum balance >> ");
        double minimumBalance = Double.parseDouble(input.nextLine().trim());
        boolean found = false;

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("CustomerList.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] customer = line.split(",");
                if (Double.parseDouble(customer[3]) > minimumBalance) {
                    System.out.println(String.join("  ", customer));
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No customers have a balance greater than " + minimumBalance + ".");
            }
        } catch (IOException e) {
            System.out.println("Unable to read CustomerList.txt: " + e.getMessage());
        }
    }
}
