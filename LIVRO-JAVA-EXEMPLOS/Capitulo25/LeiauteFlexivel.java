import java.awt.*;
import javax.swing.*;

public class LeiauteFlexivel extends JFrame {
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt7;
    private GridBagLayout gbl;
    private GridBagConstraints regras;

    public LeiauteFlexivel() {
        setTitle("Leiaute flexível");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        gbl = new GridBagLayout();
        regras = new GridBagConstraints();
        getContentPane().setLayout(gbl);

        bt1 = new JButton("Botão 1");
        bt2 = new JButton("Botão 2");
        bt3 = new JButton("Botão 3");
        bt4 = new JButton("Botão 4");
        bt5 = new JButton("Botão 5");
        bt6 = new JButton("Botão 6");
        bt7 = new JButton("Botão 7");

        regras.fill = GridBagConstraints.NONE;
        regras.anchor = GridBagConstraints.CENTER;
        adicionar(bt1, 60, 10, 0, 0, 1, 3);

        regras.fill = GridBagConstraints.BOTH;
        regras.anchor = GridBagConstraints.CENTER;
        adicionar(bt2, 10, 10, 0, 1, 2, 1);

        regras.fill = GridBagConstraints.BOTH;
        regras.anchor = GridBagConstraints.CENTER;
        adicionar(bt3, 10, 10, 2, 1, 2, 1);

        regras.fill = GridBagConstraints.BOTH;
        regras.anchor = GridBagConstraints.CENTER;
        adicionar(bt4, 10, 10, 1, 1, 1, 1);

        regras.fill = GridBagConstraints.BOTH;
        regras.anchor = GridBagConstraints.CENTER;
        adicionar(bt5, 30, 10, 1, 2, 1, 1);

        regras.fill = GridBagConstraints.HORIZONTAL;
        regras.anchor = GridBagConstraints.CENTER;
        adicionar(bt6, 60, 90, 3, 0, 2, 1);

        regras.fill = GridBagConstraints.VERTICAL;
        regras.anchor = GridBagConstraints.CENTER;
        adicionar(bt7, 30, 90, 3, 2, 1, 1);
    }

    private void adicionar(Component c, int folgaX, int folgaY, int linha, int coluna, int largura, int altura) {
        regras.weightx = folgaX;
        regras.weighty = folgaY;
        regras.gridy = linha;
        regras.gridx = coluna;
        regras.gridwidth = largura;
        regras.gridheight = altura;

        gbl.setConstraints(c, regras);
        getContentPane().add(c);
    }

    public static void main(String[] args) {
        new LeiauteFlexivel().setVisible(true);
    }
}

/********************************************************************
 * Este arquivo é parte integrante do livro identificado abaixo e é * protegido
 * pela legislação que trata dos direitos autorais. * * Título: Programação de
 * Computadores em Java * Autor: Rui Rossi dos Santos * Editora: NovaTerra
 * Editora e Distribuidora Ltda. * Ano: 2014 *
 ********************************************************************/
