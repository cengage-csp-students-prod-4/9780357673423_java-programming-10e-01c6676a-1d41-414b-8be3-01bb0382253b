import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ValidateCheckDigits {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(Paths.get("AcctNumsIn.txt"), "UTF-8");
             BufferedWriter output = Files.newBufferedWriter(Paths.get("AcctNumsOut.txt"))) {

            while (input.hasNext()) {
                String accountNumber = input.next();
                boolean valid = false;

                if (accountNumber.matches("[0-9]{6}")) {
                    int sum = 0;
                    for (int i = 0; i < 5; i++) {
                        sum += accountNumber.charAt(i) - '0';
                    }
                    int checkDigit = accountNumber.charAt(5) - '0';
                    valid = sum % 10 == checkDigit;
                }

                System.out.println(accountNumber + (valid ? " is valid" : " is invalid"));

                if (valid) {
                    output.write(accountNumber);
                    output.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Unable to process account files: " + e.getMessage());
        }
    }
}
