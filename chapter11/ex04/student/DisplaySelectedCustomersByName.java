import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DisplaySelectedCustomersByName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter last name to search for >> ");
        String lastName = input.nextLine().trim();
        boolean found = false;

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("CustomerList.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] customer = line.split(",");
                if (customer[2].equalsIgnoreCase(lastName)) {
                    System.out.println(String.join("  ", customer));
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No customers found with last name " + lastName + ".");
            }
        } catch (IOException e) {
            System.out.println("Unable to read CustomerList.txt: " + e.getMessage());
        }
    }
}
