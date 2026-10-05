import java.util.Scanner;

public class OppositeDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many lines to display? >> ");
        int lines = input.nextInt();

        display(lines);

        input.close();
    }

    public static void display(int lines) {
        if (lines <= 0) {
            return;
        }

        for (int i = 1; i < lines; i++) {
            System.out.print(" ");
        }

        System.out.println("O");
        display(lines - 1);
    }
}