import java.util.Scanner;

public class TestJobApplicants {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create three JobApplicant objects using the blank constructor
        JobApplicant app1 = new JobApplicant();
        JobApplicant app2 = new JobApplicant();
        JobApplicant app3 = new JobApplicant();

        // Fill each applicant with user-entered data
        app1 = getData(input);
        app2 = getData(input);
        app3 = getData(input);

        // Display qualification results
        displayResult(app1);
        displayResult(app2);
        displayResult(app3);
    }

    public static JobApplicant getData(Scanner input) {
        System.out.print("Enter applicant's name >> ");
        String name = input.nextLine();

        System.out.print("Enter applicant's phone number >> ");
        String phone = input.nextLine();

        System.out.println("Is applicant skilled in word processing?");
        System.out.print("    Enter 1 for yes or 2 for no >> ");
        int word = input.nextInt();

        System.out.println("Is applicant skilled in spreadsheet?");
        System.out.print("    Enter 1 for yes or 2 for no >> ");
        int sheet = input.nextInt();

        System.out.println("Is applicant skilled in database?");
        System.out.print("    Enter 1 for yes or 2 for no >> ");
        int db = input.nextInt();

        System.out.println("Is applicant skilled in graphics?");
        System.out.print("    Enter 1 for yes or 2 for no >> ");
        int gfx = input.nextInt();
        input.nextLine(); // clear leftover newline

        // Convert 1/2 into booleans
        boolean hasWord = (word == 1);
        boolean hasSheet = (sheet == 1);
        boolean hasDb = (db == 1);
        boolean hasGfx = (gfx == 1);

        // Return a fully built JobApplicant object
        return new JobApplicant(name, phone, hasWord, hasSheet, hasDb, hasGfx);
    }

    public static boolean isQualified(JobApplicant app) {
        int count = 0;

        if (app.getHasWordSkill()) count++;
        if (app.getHasSpreadsheetSkill()) count++;
        if (app.getHasDatabaseSkill()) count++;
        if (app.getHasGraphicsSkill()) count++;

        return count >= 3;
    }

    public static void displayResult(JobApplicant app) {
        if (isQualified(app)) {
            System.out.println(app.getName() + " is qualified for an interview  Phone: " + app.getPhone());
        } else {
            System.out.println(app.getName() + " is not qualified for an interview at this time  Phone: " + app.getPhone());
        }
    }
}
