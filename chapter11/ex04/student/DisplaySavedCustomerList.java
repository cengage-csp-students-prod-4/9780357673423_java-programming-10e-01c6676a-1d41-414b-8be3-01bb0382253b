import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DisplaySavedCustomerList {
    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("CustomerList.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] customer = line.split(",");
                System.out.println(String.join("  ", customer));
            }
        } catch (IOException e) {
            System.out.println("Unable to read CustomerList.txt: " + e.getMessage());
        }
    }
}
