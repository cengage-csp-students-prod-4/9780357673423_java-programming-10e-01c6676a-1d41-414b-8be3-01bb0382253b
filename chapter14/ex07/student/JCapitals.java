import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCapitals extends JFrame implements ActionListener {
    private final String[] countries = {
        "Austria", "Canada", "France", "Germany",
        "Italy", "Japan", "United Kingdom"
    };

    private final String[] capitals = {
        "Vienna", "Ottawa", "Paris", "Berlin",
        "Rome", "Tokyo", "London"
    };

    private final JComboBox<String> countryBox =
        new JComboBox<String>(countries);

    private final JTextField capitalField = new JTextField(30);

    public JCapitals() {
        super("Capitals");
        setLayout(new FlowLayout());

        add(new JLabel("Select a country"));
        add(countryBox);

        capitalField.setEditable(false);
        add(capitalField);

        countryBox.addActionListener(this);
        displayCapital();

        setSize(420, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void displayCapital() {
        int index = countryBox.getSelectedIndex();
        capitalField.setText(
            "The capital of " + countries[index]
            + " is " + capitals[index] + "."
        );
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        displayCapital();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JCapitals window = new JCapitals();
            window.setVisible(true);
        });
    }
}