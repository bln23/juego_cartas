package trivial.ui;

import javax.swing.*;

public class CardPanel extends JPanel {

    public CardPanel() {
        //question panel y answer panel

        QuestionPanel question = new QuestionPanel();
        this.add(question);
        AnswersPanel answers = new AnswersPanel();
        this.add(answers);

    }


}
