package trivial;

import trivial.ui.TrivialFrame;
import java.util.Arrays;


public class App {

    public static void main(String[] args) {
        Question question1 = new Question(
                "¿Qué día es hoy?",
                Arrays.asList(
                        new Answer("Lunes"),
                        new Answer("Martes"),
                        new Answer("Miercoles"),
                        new Answer("Domingo")
                ),
                new Answer("Domingo")
        );
        Question question2 = new Question(
                "¿Cómo se llama la gata de Belén?",
                Arrays.asList(
                        new Answer("Paketo"),
                        new Answer("Hannah"),
                        new Answer("Juana"),
                        new Answer("Triskis")
                ),
                new Answer("Hannah")
        );
        TrivialFrame trivialFrame = new TrivialFrame();
        trivialFrame.startGame(Arrays.asList(question1, question2));

    }
}