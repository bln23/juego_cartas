package trivial.ui;

import trivial.Question;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CardPanel extends JPanel {

    private final QuestionPanel questionPanel = new QuestionPanel();
    private final AnswersPanel answers = new AnswersPanel();
    private int currentQuestionIndex = 0;

    public CardPanel(List<Question> questions) {
        colocarPanelesHijos();
        answers.addNextQuestionListener(new AnswersPanel.NextQuestionListener() {
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

    private void mostrarPrimeraPregunta(List<Question> questions) {
        showQuestion(questions.get(0));
    }

    private void mostrarSiguientePregunta(List<Question> questions) {
        currentQuestionIndex = currentQuestionIndex + 1;
        boolean hayMasPreguntas = currentQuestionIndex < questions.size();
        if (hayMasPreguntas) {
            showQuestion(questions.get(currentQuestionIndex));
        }
    }

    private void showQuestion(Question question) {
        questionPanel.ask(question.getStatement());
        answers.showAnswers(question);
    }
}