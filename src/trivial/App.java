package trivial;

import trivial.ui.TrivialFrame;

import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Question question = new Question(
                "¿Qué día es hoy?",
                List.of(
                        new Answer("Lunes"),
                        new Answer("Martes"),
                        new Answer("Miercoles"),
                        new Answer("Domingo")
                ),
                new Answer("Domingo")
        );
        TrivialFrame trivialFrame = new TrivialFrame();
        trivialFrame.startGame(List.of(question));

    }
}
