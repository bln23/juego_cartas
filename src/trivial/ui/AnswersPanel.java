package trivial.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AnswersPanel extends JPanel {

    private JButton btnA;
    private JButton btnB;
    private JButton btnC;
    private JButton btnD;

    public AnswersPanel() {
        btnA = new JButton();
        this.add(btnA);
        btnB = new JButton();
        this.add(btnB);
        btnC = new JButton();
        this.add(btnC);
        btnD = new JButton();
        this.add(btnD);
        this.estilosButton();
        btnA.addActionListener(e -> btnA.setBackground(Color.yellow));
        btnB.addActionListener(e -> btnB.setBackground(Color.blue));
        btnC.addActionListener(e -> btnC.setBackground(Color.red));
        btnD.addActionListener(e -> btnD.setBackground(Color.pink));
    }


    private void estilosButton(){
        //configurar componentes
        btnA.setText("Lunes");
        btnA.setBounds(50, 100, 100, 30);
        btnB.setText("Martes");
        btnB.setBounds(60, 100, 100, 30);
        btnC.setText("Miercoles");
        btnC.setBounds(70, 100, 100, 30);
        btnD.setText("Jueves");
        btnD.setBounds(80, 100, 100, 30);
        btnA.setBorderPainted(false);
        btnB.setBorderPainted(false);
        btnC.setBorderPainted(false);
        btnD.setBorderPainted(false);
        btnA.setOpaque(true);
        btnB.setOpaque(true);
        btnC.setOpaque(true);
        btnD.setOpaque(true);
    }
}




