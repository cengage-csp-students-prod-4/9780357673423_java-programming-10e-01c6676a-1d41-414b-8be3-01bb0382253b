import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DisplaySelectedCustomer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID number to search for >> ");
        String id = input.nextLine().trim();
        boolean found = false;

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("CustomerList.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] customer = line.split(",");
                if (customer[0].equals(id)) {
                    System.out.println(String.join("  ", customer));
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No customer found with ID " + id + ".");
            }
        } catch (IOException e) {
            System.out.println("Unable to read CustomerList.txt: " + e.getMessage());
        }
    }
}
