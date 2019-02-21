package trivial.ui;

import trivial.Answer;
import trivial.Question;

import javax.swing.*;
import java.util.List;

public class CardPanel extends JPanel {

    //Lista de preguntas
    private final List<Question> questions;
    //panel en el que van las preguntas
    private final QuestionPanel questionPanel;
    //panel en el que van las respuestas
    private final AnswersPanel answers;
    // posicion de la pregunta actual
    private int currentQuestionIndex = 0;

    //constructor al que le pasamos la lista de preguntas
    public CardPanel(List<Question> questions) {
        this.questions = questions;

        //creamos un panel de pregunta y respuestas
        questionPanel = new QuestionPanel();
        answers = new AnswersPanel();
        this.add(questionPanel);
        this.add(answers);

        //siguiente pregunta
        answers.addNextQuestionListener(() -> {
            currentQuestionIndex = currentQuestionIndex + 1;
            showQuestion(questions.get(currentQuestionIndex));
        });
        showQuestion(questions.get(currentQuestionIndex));
    }

    private void showQuestion(Question question) {
        questionPanel.ask(question.getStatement());
        answers.showAnswers(question);
    }


}
