import javax.swing.*;
public class BonusBug14 extends Frame
{
    JComboBox<String> dropDown = new ComboBox<>(); // Create a ComboBox

    public BonusBug14() {
        super("ComboBox Demo);
        setSize(300); // Set the width and height of the Frame
        setLayout(null); // Set the layout to null
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String languages[] = {"C++","Java", "Python"}; //String array holding three values
        for (String item : languages) {
            dropDown.add(item); // Add items to the JComboBox
        }
        dropDown.setBounds(60,60,90,20); // Set the boundary limits of the ComboBox
        add(dropDown);
    }

    public static void main(String args[])
    {
        JFrame frame = new BonusBug14();
        frame.setVisible(true); // Make the Frame visible by setting it to true
    }     
}
