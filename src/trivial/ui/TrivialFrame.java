package trivial.ui;

import javax.swing.*;
import java.awt.*;

public class TrivialFrame extends JFrame {

    public TrivialFrame() {
        setSize(new Dimension(800, 800));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(new Label("Hola"));
        setResizable(true);
        setTitle("Trivial");
        setVisible(true);
    }

    public void showCardPanel() {
        getContentPane().removeAll();
        getContentPane().add(new CardPanel());
        validate();
    }
}
