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
        ColorFondo Amarillo = new ColorFondo(Color.yellow);
        btnB = new JButton();
        this.add(btnB);
        ColorFondo Azul = new ColorFondo(Color.blue);;
        btnC = new JButton();
        this.add(btnC);
        ColorFondo Rojo = new ColorFondo(Color.red);
        btnD = new JButton();
        this.add(btnD);
        ColorFondo Rosa = new ColorFondo(Color.pink);
        this.estilosButton();

        btnA.addActionListener(Amarillo);
        btnB.addActionListener(Azul);
        btnC.addActionListener(Rojo);
        btnD.addActionListener(Rosa);


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
    }

    private class ColorFondo implements ActionListener{

        private Color colorDeFondo;

        public ColorFondo(Color c){

            this.colorDeFondo = c;

        }

        public void actionPerformed(ActionEvent e){

            setBackground(colorDeFondo);

        }


    }

}




