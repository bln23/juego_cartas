package trivial;

import trivial.ui.AnswersPanel;
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
        System.out.println(question.getStatement());
        for (Map.Entry<String, Answer> entry : question.getOptions().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getAnswer());
        }
        String result = question.answer(new Answer("Domingo"));
        System.out.println(result);
        TrivialFrame trivialFrame = new TrivialFrame();
        trivialFrame.showCardPanel();

    }
}
