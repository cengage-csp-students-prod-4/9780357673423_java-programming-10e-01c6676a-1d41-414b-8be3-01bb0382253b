import java.util.Scanner;

public class ValidatePassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string >> ");
        String password = input.nextLine();

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;

        // Count uppercase, lowercase, and digits
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Check validity
        boolean valid = true;

        if (upperCount < 2 || lowerCount < 3 || digitCount < 1) {
            System.out.println("The password did not have enough:");
            valid = false;

            if (upperCount < 2) {
                System.out.println("uppercase letters");
            }
            if (lowerCount < 3) {
                System.out.println("lowercase letters");
            }
            if (digitCount < 1) {
                System.out.println("digits");
            }
        }

        if (valid) {
            System.out.println("Valid password");
        }
    }
}
