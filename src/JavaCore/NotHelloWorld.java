package JavaCore;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wangweimin on 15/12/28.
 */
public class NotHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new NotHelloWorldFrame();
                frame.setTitle("NotHelloWorld");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class NotHelloWorldFrame extends JFrame {

    public NotHelloWorldFrame() {
        add(new NotHelloWorldComponent());
        pack();
    }

}

class NotHelloWorldComponent extends JComponent {

    public final static int MESSAGE_X = 75;
    public final static int MESSAGE_Y = 100;

    public final static int DEFAULT_WIDTH = 300;
    public final static int DEFAULT_HEIGHT = 200;

    @Override
    protected void paintComponent(Graphics g) {
        g.drawString("Not Hello World", MESSAGE_X, MESSAGE_Y);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
