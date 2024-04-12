import javax.swing.*;
import java.awt.*;

public class AlignedComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aligned Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(9, 9, 4, 4); // Margin around components
        gbc.gridx = 0;
        gbc.gridy = 0;
       // gbc.anchor = GridBagConstraints.WEST;

        JLabel label = new JLabel("Name:");


        JTextField textField = new JTextField(20);

        frame.add(label, gbc);
        gbc.gridx = 1;
        frame.add(textField, gbc);

        frame.pack();
        frame.setVisible(true);
    }
}
