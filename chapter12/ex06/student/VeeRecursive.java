import java.util.Scanner;

public class VeeRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a height for your Vee >> ");
        int height = input.nextInt();

        drawVee(1, height, 0, height * 2);

        input.close();
    }

    public static void drawVee(int currentLine, int totalLines,
                               int spacesBefore, int spacesBetween) {
        if (currentLine > totalLines) {
            return;
        }

        for (int i = 0; i < spacesBefore; i++) {
            System.out.print(" ");
        }

        System.out.print("V");

        for (int i = 0; i < spacesBetween; i++) {
            System.out.print(" ");
        }

        System.out.println("V");

        drawVee(currentLine + 1, totalLines,
                spacesBefore + 1, spacesBetween - 2);
    }
}