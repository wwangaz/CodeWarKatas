package JavaCore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by wangweimin on 15/12/30.
 */
public class RadioButtonFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new RadioButtonFrame();
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class RadioButtonFrame extends JFrame {
    private JPanel buttonPanel;
    private ButtonGroup group;
    private JLabel label;
    private final static int DEFAULT_SIZE = 36;

    public RadioButtonFrame() {
        label = new JLabel("The quick brown fox jump over the lazy dog");
        label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        add(label, BorderLayout.CENTER);

        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addButton("Small", 8);
        addButton("Medium", 12);
        addButton("large", 18);
        addButton("extra large", 36);

        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    private void addButton(String name, final int size) {
        boolean selected = size == DEFAULT_SIZE;
        JRadioButton button = new JRadioButton(name, selected);
        group.add(button);
        buttonPanel.add(button);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("Serif", Font.PLAIN, size));
            }
        };

        button.addActionListener(listener);
    }
}
