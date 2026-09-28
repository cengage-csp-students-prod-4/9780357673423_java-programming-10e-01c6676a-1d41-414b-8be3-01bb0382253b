import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] studentIds = {1234, 2345, 3456, 4567, 5678};
        int[] scores = new int[studentIds.length];

        for (int i = 0; i < studentIds.length; i++) {
            System.out.print("Enter score for student id number: "
                    + studentIds[i] + " >> ");

            try {
                int score = Integer.parseInt(input.nextLine().trim());

                if (score > 100) {
                    throw new ScoreException(
                            "Score cannot exceed 100 - will be 0");
                }

                scores[i] = score;
            } catch (ScoreException e) {
                System.out.println(e.getMessage());
                scores[i] = 0;
            } catch (Exception e) {
                System.out.println("Score must be an integer - will be 0");
                scores[i] = 0;
            }
        }

        for (int i = 0; i < studentIds.length; i++) {
            System.out.println("ID #" + studentIds[i]
                    + "  Score " + scores[i]);
        }

        input.close();
    }
}