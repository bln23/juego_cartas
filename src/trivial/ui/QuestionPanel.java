package trivial.ui;

import javax.swing.*;
import java.awt.*;


public class QuestionPanel extends JPanel {

    private final JLabel jLabel;

    public QuestionPanel() {
        setLayout(new GridLayout(1, 1));
        jLabel = new JLabel();
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(jLabel);
    }

    //pregunta
    public void ask(String statement) {
        jLabel.setText(statement);
    }
}