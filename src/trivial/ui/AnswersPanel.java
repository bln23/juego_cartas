package trivial.ui;

import javax.swing.*;


public class AnswersPanel extends JPanel {

    private JButton btnA;
    private JButton btnB;
    private JButton btnC;
    private JButton btnD;

    public AnswersPanel() {
        JButton btnA = new JButton();
        this.add(btnA);
        JButton btnB = new JButton();
        this.add(btnB);
        JButton btnC = new JButton();
        this.add(btnC);
        JButton btnD = new JButton();
        this.add(btnD);

    }

    public void estilosButton(){
        //configurar componentes
        btnA.setText("Lunes");
        btnA.setBounds(50, 100, 100, 30);
        btnB.setText("Martes");
        btnB.setBounds(60, 100, 100, 30);
        btnC.setText("Miercoles");
        btnC.setBounds(70, 100, 100, 30);
        btnD.setText("Jueves");
        btnD.setBounds(80, 100, 100, 30);
    }

}d


