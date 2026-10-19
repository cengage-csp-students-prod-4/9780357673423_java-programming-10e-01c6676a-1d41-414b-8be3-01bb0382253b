import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFacts extends JFrame implements ActionListener {
    private final JLabel[] facts = {
        new JLabel("The Sun is a star."),
        new JLabel("Venus is the hottest planet in our solar system."),
        new JLabel("Jupiter is the largest planet in our solar system."),
        new JLabel("The Moon reflects light from the Sun."),
        new JLabel("Saturn has rings made mostly of ice particles."),
        new JLabel("Neptune is the farthest planet from the Sun.")
    };

    private final JPanel factPanel = new JPanel();
    private int currentFact = 0;

    public JFacts() {
        super("Facts");

        JButton changeButton = new JButton("Press to change fact");
        changeButton.addActionListener(this);

        setLayout(new BorderLayout(10, 10));
        add(changeButton, BorderLayout.NORTH);

        factPanel.add(facts[currentFact]);
        add(factPanel, BorderLayout.CENTER);

        setSize(550, 160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        factPanel.remove(facts[currentFact]);
        currentFact = (currentFact + 1) % facts.length;
        factPanel.add(facts[currentFact]);

        factPanel.revalidate();
        factPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JFacts::new);
    }
}