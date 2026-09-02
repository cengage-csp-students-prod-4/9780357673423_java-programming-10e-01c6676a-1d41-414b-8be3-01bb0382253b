import java.util.*;
public class BonusBug10
{
    public static void main(String args[])
    {
        {
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter the size of the array >> ");
            int size = kb.nextInt();
            int[] arr = new int{size};
            System.out.println("Enter " + size + " integers >>");
            for (int i = 0; i < size; i++) {
                int input = kb.nextInt();
                arr[i] += input;
            }
            System.out.println("Enter an index to retrieve >> ";
            index = kb.nextInt();
            System.out.println(arr[index]); //may throw out of bounds exception
        } 
        // handling the array exception
          catch(OutOfBoundsException e);
        {
            System.out.println(e);
        }
    }
}