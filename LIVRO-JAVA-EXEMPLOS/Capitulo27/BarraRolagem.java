import java.awt.*;
import javax.swing.*;

public class BarraRolagem extends JFrame {
    private JScrollBar sbSul;
    private JScrollBar sbLeste;

    public BarraRolagem() {
        setTitle("Barras de rolagem");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        sbSul = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 300);
        sbLeste = new JScrollBar(JScrollBar.VERTICAL, 100, 0, 0, 150);
        sbSul.setBlockIncrement(50);
        sbLeste.setBlockIncrement(10);
        sbSul.setFocusable(true);
        sbLeste.setFocusable(true);

        getContentPane().add(sbSul, BorderLayout.SOUTH);
        getContentPane().add(sbLeste, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        new BarraRolagem().setVisible(true);
    }
}

/********************************************************************
 * Este arquivo é parte integrante do livro identificado abaixo e é * protegido
 * pela legislação que trata dos direitos autorais. * * Título: Programação de
 * Computadores em Java * Autor: Rui Rossi dos Santos * Editora: NovaTerra
 * Editora e Distribuidora Ltda. * Ano: 2014 *
 ********************************************************************/
