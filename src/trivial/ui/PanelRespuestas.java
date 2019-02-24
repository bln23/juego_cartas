package trivial.ui;

import trivial.Respuesta;
import trivial.Pregunta;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PanelRespuestas extends JPanel {

    private final List<JButton> buttons = new ArrayList<>();
    private final List<NextQuestionListener> listeners = new ArrayList<>();
    private final JPanel answerButtons;
    private JButton boton;
    private JButton botonRespuestaCorrecta;

    public PanelRespuestas() {
        answerButtons = new JPanel();
        GridLayout buttonsGrid = new GridLayout(2, 2);
        buttonsGrid.setHgap(5);
        buttonsGrid.setVgap(5);
        answerButtons.setLayout(buttonsGrid);
        add(answerButtons);
        boton = new JButton("SIGUIENTE");
        boton.setBounds(100, 150, 100, 30);
        boton.addActionListener(e -> notificarSiguientePregunta());
        add(boton);
        setLayout(new GridLayout(2, 1));
    }

    private void notificarSiguientePregunta() {
        for (NextQuestionListener listener : listeners) {
            listener.onNext();
        }
    }


    public void ejecutaEstoCuandoPulsenSiguiente(NextQuestionListener listener) {
        listeners.add(listener);
    }

    public void mostrarRespuestas(Pregunta question) {
        buttons.clear();
        answerButtons.removeAll();
        boton.setVisible(false);
        for (Respuesta answer : question.getOptions()) {
            JButton button = crearBotonPreguntas(answer);
            buttons.add(button);
            answerButtons.add(button);
            if (question.respuesta(answer)) {
                botonRespuestaCorrecta = button;
            }

            //clase anonima con arrow function
            button.addActionListener(e -> {
                if (!question.respuesta(answer)) {
                    button.setBackground(Color.red);
                }
                botonRespuestaCorrecta.setBackground(Color.green);
                deshabilitarBotones();
                boton.setVisible(true);
            });
        }

    }

    private JButton crearBotonPreguntas(Respuesta answer) {
        JButton button = new JButton(answer.getAnswer());
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.setBackground(Color.white);
        return button;
    }

    private void deshabilitarBotones() {
        for (JButton button : buttons) {
            button.setEnabled(false);
        }
    }

    interface NextQuestionListener {
        void onNext();
    }
}