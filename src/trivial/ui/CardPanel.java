package trivial.ui;

import trivial.Pregunta;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CardPanel extends JPanel {

    private final PanelPreguntas questionPanel = new PanelPreguntas();
    private final PanelRespuestas answers = new PanelRespuestas();
    private int currentQuestionIndex = 0;

    public CardPanel(List<Pregunta> questions) {
        colocarPanelesHijos();
        answers.ejecutaEstoCuandoPulsenSiguiente(new PanelRespuestas.NextQuestionListener() {
            @Override
            public void onNext() {
                mostrarSiguientePregunta(questions);
            }
        });
        mostrarPrimeraPregunta(questions);
    }

    private void colocarPanelesHijos() {
        this.add(questionPanel);
        this.add(answers);
        setLayout(new GridLayout(2, 1));
    }

    private void mostrarPrimeraPregunta(List<Pregunta> questions) {
        showQuestion(questions.get(0));
    }

    private void mostrarSiguientePregunta(List<Pregunta> questions) {
        currentQuestionIndex = currentQuestionIndex + 1;
        boolean hayMasPreguntas = currentQuestionIndex < questions.size();
        if (hayMasPreguntas) {
            showQuestion(questions.get(currentQuestionIndex));
        }
    }

    private void showQuestion(Pregunta question) {
        questionPanel.pregunta(question.getStatement());
        answers.mostrarRespuestas(question);
    }
}