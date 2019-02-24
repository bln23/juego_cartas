package trivial.ui;

import javax.swing.*;
import java.awt.*;


public class PanelPreguntas extends JPanel {

    private final JLabel jLabel;

    public PanelPreguntas() {
        setLayout(new GridLayout(1, 1));
        jLabel = new JLabel();
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(jLabel);
    }

    //pregunta
    public void pregunta(String statement) {
        jLabel.setText(statement);
    }
}