import java.awt.*;
import javax.swing.*;

public class Painel extends Janela {
    private JButton btGravar;
    private JButton btSair;
    private JPanel pnVerde;
    private JPanel pnAmarelo;

    public Painel() {
        super("Painéis", new Dimension(210, 210));

        pnVerde = new JPanel();
        pnVerde.setLayout(null);
        pnVerde.setBounds(10, 10, 170, 70);
        pnVerde.setBackground(Color.GREEN);

        pnAmarelo = new JPanel();
        pnAmarelo.setLayout(null);
        pnAmarelo.setBounds(10, 90, 170, 70);
        pnAmarelo.setBackground(Color.YELLOW);

        btGravar = new JButton("Gravar");
        btGravar.setBounds(35, 30, 100, 30);
        btSair = new JButton("Sair");
        btSair.setBounds(35, 30, 100, 30);

        pnVerde.add(btGravar);
        pnAmarelo.add(btSair);

        getContentPane().add(pnVerde);
        getContentPane().add(pnAmarelo);
    }

    public static void main(String[] args) {
        new Painel().setVisible(true);
    }
}

/********************************************************************
 * Este arquivo é parte integrante do livro identificado abaixo e é * protegido
 * pela legislação que trata dos direitos autorais. * * Título: Programação de
 * Computadores em Java * Autor: Rui Rossi dos Santos * Editora: NovaTerra
 * Editora e Distribuidora Ltda. * Ano: 2014 *
 ********************************************************************/
