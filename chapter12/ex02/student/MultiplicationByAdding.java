import java.util.Scanner;

public class MultiplicationByAdding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer >> ");
        int first = input.nextInt();

        System.out.print("Enter another integer >> ");
        int second = input.nextInt();

        int product = multiplication(first, second);

        System.out.println(first + " * " + second + " = " + product);

        input.close();
    }

    public static int multiplication(int first, int second) {
        if (second == 0) {
            return 0;
        }

        if (second > 0) {
            return first + multiplication(first, second - 1);
        }

        return multiplication(first, second + 1) - first;
    }
}