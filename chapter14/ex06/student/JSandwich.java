import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class JSandwich extends JFrame {
    private final JComboBox<String> ingredientBox =
        new JComboBox<>(new String[]{"Chicken", "Turkey", "Tuna"});

    private final JComboBox<String> breadBox =
        new JComboBox<>(new String[]{"White", "Wheat", "Rye"});

    private final double[] prices = {7.99, 8.49, 8.99};
    private final JTextField priceField = new JTextField(10);

    public JSandwich() {
        super("Sublime Sandwich Shop");

        JLabel heading = new JLabel("Sublime Sandwich", SwingConstants.CENTER);
        heading.setFont(new Font("SansSerif", Font.BOLD, 22));

        JPanel choices = new JPanel(new GridLayout(3, 2, 10, 10));
        choices.add(new JLabel("Main ingredient:"));
        choices.add(ingredientBox);
        choices.add(new JLabel("Bread:"));
        choices.add(breadBox);
        choices.add(new JLabel("Total price:"));
        choices.add(priceField);

        priceField.setEditable(false);

        JPanel content = new JPanel(new BorderLayout(10, 15));
        content.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        content.add(heading, BorderLayout.NORTH);
        content.add(choices, BorderLayout.CENTER);
        setContentPane(content);

        ingredientBox.addActionListener(event -> updatePrice());
        breadBox.addActionListener(event -> updatePrice());
        updatePrice();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updatePrice() {
        // All bread choices are included in the ingredient price.
        double total = prices[ingredientBox.getSelectedIndex()];
        priceField.setText(String.format(Locale.US, "$%.2f", total));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JSandwich::new);
    }
}