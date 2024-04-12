import javax.swing.*;
import java.awt.*;

public class ScrollableAlignedComponents {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Scrollable Aligned Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Array of button texts
        String[] buttonTexts = {
                "Action 1", "Action 2", "Action 3", "Action 4", "Action 5",
                "Action 6", "Action 7", "Action 8", "Action 9", "Action 10"
        };

        // Panel that will contain the labels and buttons
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 4, 2, 4); // Margin around components
        gbc.anchor = GridBagConstraints.WEST;

        for (int i = 0; i < 10; i++) {
            gbc.gridx = 0; // First column for labels
            gbc.gridy = i; // Row, one for each label/button pair
            JLabel label = new JLabel("Label " + (i + 1));
            panel.add(label, gbc);

            gbc.gridx = 1; // Second column for buttons
            JButton button = new JButton(buttonTexts[i]);
            panel.add(button, gbc);
        }

        // Scroll pane for the panel
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
       // scrollPane.setPreferredSize(new Dimension(300, 200));

        frame.add(scrollPane);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
