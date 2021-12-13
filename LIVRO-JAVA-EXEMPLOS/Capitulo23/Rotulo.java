import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class Rotulo extends Janela {
    private JLabel lbVerde;
    private JLabel lbAmarelo;
    private JLabel lbAzul;

    public Rotulo() {
        super("Rótulos", new Dimension(410, 210));
        URL url = getClass().getResource("Livros.png");
        ImageIcon ii_livro = new ImageIcon(url);

        lbVerde = new JLabel();
        lbVerde.setText("Rótulo 1");
        lbVerde.setLocation(10, 10);
        lbVerde.setSize(370, 50);
        lbVerde.setOpaque(true);
        lbVerde.setBackground(new Color(0, 255, 0));
        lbVerde.setForeground(new Color(0, 0, 170));
        lbVerde.setFont(new Font("Courier", Font.BOLD, 21));
        lbVerde.setToolTipText("Rótulo verde");
        lbVerde.setIcon(ii_livro);
        lbVerde.setHorizontalAlignment(SwingConstants.LEFT);
        lbVerde.setVerticalAlignment(SwingConstants.TOP);
        lbVerde.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbVerde.setVerticalTextPosition(SwingConstants.CENTER);

        lbAmarelo = new JLabel("Rótulo 2");
        lbAmarelo.setBounds(10, 60, 370, 50);
        lbAmarelo.setOpaque(true);
        lbAmarelo.setBackground(new Color(255, 255, 0));
        lbAmarelo.setForeground(new Color(0, 0, 170));
        lbAmarelo.setFont(new Font("Courier", Font.BOLD, 21));
        lbAmarelo.setToolTipText("Rótulo amarelo");
        lbAmarelo.setIcon(ii_livro);
        lbAmarelo.setHorizontalAlignment(SwingConstants.CENTER);
        lbAmarelo.setVerticalAlignment(SwingConstants.CENTER);
        lbAmarelo.setHorizontalTextPosition(SwingConstants.CENTER);
        lbAmarelo.setVerticalTextPosition(SwingConstants.BOTTOM);

        lbAzul = new JLabel("Rótulo 3", ii_livro, SwingConstants.RIGHT);
        lbAzul.setBounds(10, 110, 370, 50);
        lbAzul.setOpaque(true);
        lbAzul.setBackground(new Color(0, 0, 255));
        lbAzul.setForeground(new Color(255, 255, 255));
        lbAzul.setFont(new Font("Courier", Font.BOLD, 21));
        lbAzul.setToolTipText("Rótulo azul");
        lbAzul.setVerticalAlignment(SwingConstants.BOTTOM);
        lbAzul.setHorizontalTextPosition(SwingConstants.LEFT);
        lbAzul.setVerticalTextPosition(SwingConstants.CENTER);

        getContentPane().add(lbVerde);
        getContentPane().add(lbAmarelo);
        getContentPane().add(lbAzul);
    }

    public static void main(String[] args) {
        new Rotulo().setVisible(true);
    }
}

/********************************************************************
 * Este arquivo é parte integrante do livro identificado abaixo e é * protegido
 * pela legislação que trata dos direitos autorais. * * Título: Programação de
 * Computadores em Java * Autor: Rui Rossi dos Santos * Editora: NovaTerra
 * Editora e Distribuidora Ltda. * Ano: 2014 *
 ********************************************************************/
