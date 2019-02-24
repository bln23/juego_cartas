package trivial;

import trivial.ui.TrivialFrame;
import java.util.Arrays;


public class App {

    public static void main(String[] args) {
        Pregunta question1 = new Pregunta(
                "¿Cuando acabó la segunda guerra mundial?",
                Arrays.asList(
                        new Respuesta("1980"),
                        new Respuesta("1939"),
                        new Respuesta("1945"),
                        new Respuesta("1970")
                ),
                new Respuesta("1945")
        );
        Pregunta question2 = new Pregunta(
                "¿Cuál es la capital de Finlandia?",
                Arrays.asList(
                        new Respuesta("Estocolmo"),
                        new Respuesta("Berlín"),
                        new Respuesta("Londres"),
                        new Respuesta("Helsinki")
                ),
                new Respuesta("Helsinki")
        );
        Pregunta question3 = new Pregunta(
                "¿Cuál es el lugar más frío de la tierra?",
                Arrays.asList(
                        new Respuesta("La Antártida"),
                        new Respuesta("Alaska"),
                        new Respuesta("Rusia"),
                        new Respuesta("Noruega")
                ),
                new Respuesta("La Antártida")
        );
        Pregunta question4 = new Pregunta(
                "¿QUé ciudad de las siguientes no es europea?",
                Arrays.asList(
                        new Respuesta("Boston"),
                        new Respuesta("Milan"),
                        new Respuesta("Barcelona"),
                        new Respuesta("Karlsruhe")
                ),
                new Respuesta("Boston")
        );
        TrivialFrame trivialFrame = new TrivialFrame();
        trivialFrame.startGame(Arrays.asList(question1, question2, question3, question4));

    }
}