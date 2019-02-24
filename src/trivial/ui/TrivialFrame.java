package trivial.ui;

import trivial.Question;

import javax.swing.*;
import java.awt.*;
import java.util.List;



@SuppressWarnings("serial")
public class TrivialFrame extends JFrame {

    public TrivialFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(new Label("Trivial"));
        setResizable(true); //redimensionar
        setTitle("Trivial"); //nombre ventana
        setVisible(true);
        //medidas ventana y centrar
        Toolkit myWindow = Toolkit.getDefaultToolkit();
        Dimension sizeWindow = myWindow.getScreenSize();
        // alto y ancho ventana
        int heightWindow = sizeWindow.height;
        int witdthWindow = sizeWindow.width;
        setSize(witdthWindow/2, heightWindow/2);
        //donde se va a ubicar la ventana en la pantalla del ordenador
        setLocation(witdthWindow/4, heightWindow/4);

    }

    // metodo empezar, pasar lista de preguntas
    public void startGame(List<Question> questions) {
        getContentPane().removeAll();
        CardPanel cardPanel = new CardPanel(questions);
        getContentPane().add(cardPanel);
        validate();
    }
}