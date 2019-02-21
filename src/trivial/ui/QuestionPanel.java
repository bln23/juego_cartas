package trivial.ui;

import javax.swing.*;


public class QuestionPanel extends JPanel {

    private final JLabel jLabel;

    public QuestionPanel() {
        jLabel = new JLabel();
        this.add(jLabel);
    }

    //respuesta
    public void ask(String statement) {
        jLabel.setText(statement);
    }
}
