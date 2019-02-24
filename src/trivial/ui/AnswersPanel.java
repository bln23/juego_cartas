package trivial.ui;

import trivial.Answer;
import trivial.Question;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AnswersPanel extends JPanel {

    private final List<JButton> buttons = new ArrayList<>();
    private final List<NextQuestionListener> listeners = new ArrayList<>();
    private final JPanel answerButtons;
    private JButton boton;
    private JButton botonRespuestaCorrecta;

    public AnswersPanel() {
        answerButtons = new JPanel();
        add(answerButtons);
        boton = new JButton("SIGUIENTE");
        boton.setBounds(100, 150, 100, 30);
        boton.addActionListener(e -> notifyNextAnswer());
        add(boton);
        setLayout(new GridLayout(2, 1));
    }

    private void notifyNextAnswer() {
        for (NextQuestionListener listener : listeners) {
            listener.onNext();
        }
    }

    //configurar componentes
    private void estilosButton() {
        GridLayout buttonsGrid = new GridLayout(2, 2);
        buttonsGrid.setHgap(5);
        buttonsGrid.setVgap(5);
        int initialPositionX = 70;
        for (JButton button : buttons) {
            button.setBounds(initialPositionX, 100, 100, 40);
            button.setBorderPainted(false);
            button.setOpaque(true);
            initialPositionX += 10;
        }
        answerButtons.setLayout(buttonsGrid);
    }


    public void addNextQuestionListener(NextQuestionListener listener) {
        listeners.add(listener);
    }

    public void showAnswers(Question question) {
        buttons.clear();
        answerButtons.removeAll();
        boton.setVisible(false);
        for (Answer answer : question.getOptions().values()) {
            JButton button = new JButton(answer.getAnswer());
            buttons.add(button);
            answerButtons.add(button);
            if (question.answer(answer)) {
                botonRespuestaCorrecta = button;
            }

            //clase anonima con arrow function
            button.addActionListener(e -> {
                if (!question.answer(answer)) {
                    button.setBackground(Color.red);
                }
                botonRespuestaCorrecta.setBackground(Color.green);
                disableButtons();
                boton.setVisible(true);
            });
        }
        this.estilosButton();

    }

    private void disableButtons() {
        for (JButton button : buttons) {
            button.setEnabled(false);
        }
    }

    interface NextQuestionListener {
        void onNext();
    }
}