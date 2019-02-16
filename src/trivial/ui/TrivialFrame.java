package trivial.ui;

import javax.swing.*;
import java.awt.*;

public class TrivialFrame extends JFrame {

    public TrivialFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(new Label("Trivial"));
        setResizable(true); //redimensionar
        setTitle("Trivial"); //nombre ventana
        setVisible(true);
        Toolkit myWindows = Toolkit.getDefaultToolkit();
        Dimension sizeWindow = myWindows.getScreenSize();
        int heightWindow = sizeWindow.height;
        int witdthWindow = sizeWindow.width;
        setSize(witdthWindow/2, heightWindow/2);
        setLocation(witdthWindow/4, heightWindow/4);
    }

    public void showCardPanel() {
        getContentPane().removeAll();
        getContentPane().add(new CardPanel());
        validate();
    }
}
