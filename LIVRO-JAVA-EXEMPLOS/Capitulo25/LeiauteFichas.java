import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeiauteFichas extends JFrame implements ActionListener {
    private JPanel pnControles;
    private JPanel pnCartoes;
    private JPanel pnCartao1;
    private JPanel pnCartao2;
    private JPanel pnCartao3;
    private JButton btPrimeiro;
    private JButton btAnterior;
    private JButton btProximo;
    private JButton btUltimo;
    private CardLayout cl;

    public LeiauteFichas() {
        setTitle("Leiaute de fichas");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        pnControles = new JPanel();
        pnCartoes = new JPanel();
        cl = new CardLayout();

        pnCartao1 = new JPanel();
        pnCartao1.setBackground(Color.CYAN);
        pnCartao1.add(new JLabel("Cartão 1", SwingConstants.CENTER));
        pnCartao2 = new JPanel();
        pnCartao2.setBackground(Color.YELLOW);
        pnCartao2.add(new JLabel("Cartão 2", SwingConstants.CENTER));
        pnCartao3 = new JPanel();
        pnCartao3.setBackground(Color.MAGENTA);
        pnCartao3.add(new JLabel("Cartão 3", SwingConstants.CENTER));

        pnCartoes.setLayout(cl);
        pnCartoes.add(pnCartao1, "C1");
        pnCartoes.add(pnCartao2, "C2");
        pnCartoes.add(pnCartao3, "C3");

        btPrimeiro = new JButton("Primeiro");
        btAnterior = new JButton("Anterior");
        btProximo = new JButton("Próximo");
        btUltimo = new JButton("Último");
        btPrimeiro.addActionListener(this);
        btAnterior.addActionListener(this);
        btProximo.addActionListener(this);
        btUltimo.addActionListener(this);

        pnControles.setLayout(new GridLayout(4, 1));
        pnControles.add(btPrimeiro);
        pnControles.add(btAnterior);
        pnControles.add(btProximo);
        pnControles.add(btUltimo);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(pnControles, BorderLayout.WEST);
        getContentPane().add(pnCartoes, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btPrimeiro)
            cl.first(pnCartoes);
        if (e.getSource() == btAnterior)
            cl.previous(pnCartoes);
        if (e.getSource() == btProximo)
            cl.next(pnCartoes);
        if (e.getSource() == btUltimo)
            cl.last(pnCartoes);
    }

    public static void main(String[] args) {
        new LeiauteFichas().setVisible(true);
    }
}

/********************************************************************
 * Este arquivo é parte integrante do livro identificado abaixo e é * protegido
 * pela legislação que trata dos direitos autorais. * * Título: Programação de
 * Computadores em Java * Autor: Rui Rossi dos Santos * Editora: NovaTerra
 * Editora e Distribuidora Ltda. * Ano: 2014 *
 ********************************************************************/
