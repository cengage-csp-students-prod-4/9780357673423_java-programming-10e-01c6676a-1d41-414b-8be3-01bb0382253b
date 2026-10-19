import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;

public class JSandwich extends JFrame implements ActionListener {
    private JComboBox<String> mainIngredient;
    private JComboBox<String> bread;
    private JTextField totalPrice;

    public JSandwich() {
        super("Sublime Sandwich Shop");

        mainIngredient = new JComboBox<String>();
        mainIngredient.addItem("Chicken");
        mainIngredient.addItem("Turkey");
        mainIngredient.addItem("Tuna");

        bread = new JComboBox<String>();
        bread.addItem("White");
        bread.addItem("Wheat");
        bread.addItem("Rye");

        totalPrice = new JTextField(10);
        totalPrice.setEditable(false);

        JLabel title = new JLabel("Sublime Sandwich");
        title.setFont(new Font("SansSerif", Font.BOLD, 22));

        setLayout(new FlowLayout());

        add(title);
        add(new JLabel("Main ingredient:"));
        add(mainIngredient);
        add(new JLabel("Bread:"));
        add(bread);
        add(new JLabel("Total price:"));
        add(totalPrice);

        mainIngredient.addActionListener(this);
        bread.addActionListener(this);

        calculatePrice();

        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void calculatePrice() {
        double price;

        switch (mainIngredient.getSelectedIndex()) {
            case 0:
                price = 7.99;
                break;
            case 1:
                price = 8.49;
                break;
            case 2:
                price = 8.99;
                break;
            default:
                price = 0.0;
        }

        // Each bread type is included in the sandwich price.
        totalPrice.setText(String.format(Locale.US, "%.2f", price));
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        calculatePrice();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JSandwich window = new JSandwich();
            window.setVisible(true);
        });
    }
}