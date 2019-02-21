package trivial.ui;

import trivial.Answer;
import trivial.Question;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class AnswersPanel extends JPanel {

    private final List<JButton> buttons = new ArrayList<>();
    private final List<NextQuestionListener> listeners = new ArrayList<>();

    private void notifyNextAnswer() {
        for (NextQuestionListener listener : listeners) {
            listener.onNext();
        }
    }


    private void estilosButton(){
        //configurar componentes
        int initialPositionX = 50;
        for (JButton button : buttons) {
            button.setBounds(initialPositionX, 100, 100, 30);
            button.setBorderPainted(false);
            button.setOpaque(true);
            initialPositionX += 10;
        }
    }

    public void addNextQuestionListener(NextQuestionListener listener) {
        listeners.add(listener);
    }

    public void showAnswers(Question question) {
        for (Answer answer : question.getOptions().values()) {
            JButton button = new JButton(answer.getAnswer());
            buttons.add(button);
            this.add(button);
            //clase anonima con arrow function
            button.addActionListener(e -> {
                // Si respuesta incorrecta -> mostrar respuesta correcta
                // Siempre -> Mostrar botón Siguiente y al clickar llamar a notifyNextAnswer()
                if (question.answer(answer)) {
                    button.setBackground(Color.green);
                } else {
                    button.setBackground(Color.red);
                }
            });
        }
        this.estilosButton();
    }

    interface NextQuestionListener {
        void onNext();
    }
}




