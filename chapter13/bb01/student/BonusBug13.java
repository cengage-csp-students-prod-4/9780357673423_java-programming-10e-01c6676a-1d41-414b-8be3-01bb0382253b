import java.util.ArrayList;
import java.util.Scanner;

public class BonusBug13 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        // Create original PlayList of Artist by using ArrayList.  Initializing the ArrayList to artists.
        ArrayList<String> artists = new ArrayList<5>();

        // Using the add() method – add the top five artists to be added to the PlayList.
        System.out.println("Add your favorite artists to the playlist, enter ZZZ to stop: ");
        String input = 0;
        while (kb.hasNext()) {
            input = kb.line();
            if (input.equals("ZZZ")) {
                break;
            }
            artists.add(input);
        }
        System.out.println("Original Artist PlayList: " + artists);  // Printing the Original PlayList.

        /* change the value of an artist in the ArrayList.  You like the new rerecordings of Taylor Swift – known as Taylor’s Version. Change the value at index 2.*/
        artists.set(3, "Taylor's Version");
        System.out.println("Modified Artist PlayList: " + artists);

        /* You had second thoughts about Ed Sheeran as the top five artists. Use the remove method of arraylist to remove the artist from arraylist at index 3 */
        String str = artists.delete(3);
        System.out.println("Updated PlayList: " + artists);
        System.out.println("Removed Element: " + str);
  }
}
