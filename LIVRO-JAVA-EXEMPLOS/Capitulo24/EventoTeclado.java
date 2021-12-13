import java.awt.event.*;
import javax.swing.*;

public class EventoTeclado extends JFrame implements KeyListener {
    private JLabel lbStatus;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;

    public EventoTeclado() {
        setTitle("Eventos de teclado");
        setSize(340, 110);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        bt1 = new JButton("Botão 1");
        bt1.setBounds(10, 10, 100, 30);
        bt1.addKeyListener(this);

        bt2 = new JButton("Botão 2");
        bt2.setBounds(110, 10, 100, 30);
        bt2.addKeyListener(this);

        bt3 = new JButton("Botão 3");
        bt3.setBounds(210, 10, 100, 30);
        bt3.addKeyListener(this);

        lbStatus = new JLabel("Pressione \"Enter\" sobre os botões.");
        lbStatus.setBounds(5, 50, 280, 20);

        getContentPane().setLayout(null);
        getContentPane().add(bt1);
        getContentPane().add(bt2);
        getContentPane().add(bt3);
        getContentPane().add(lbStatus);
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() != 10)
            return;

        if (e.getSource() == bt1)
            lbStatus.setText("O botão 1 foi pressionado.");
        else if (e.getSource() == bt2)
            lbStatus.setText("O botão 2 foi pressionado.");
        else if (e.getSource() == bt3)
            lbStatus.setText("O botão 3 foi pressionado.");
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new EventoTeclado().setVisible(true);
    }
}

/********************************************************************
 * Este arquivo é parte integrante do livro identificado abaixo e é * protegido
 * pela legislação que trata dos direitos autorais. * * Título: Programação de
 * Computadores em Java * Autor: Rui Rossi dos Santos * Editora: NovaTerra
 * Editora e Distribuidora Ltda. * Ano: 2014 *
 ********************************************************************/
