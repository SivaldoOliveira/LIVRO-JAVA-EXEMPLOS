import java.awt.*;
import javax.swing.*;

public class CaixaCombinacao extends JFrame {
    private JComboBox<String> coEstados;
    private JComboBox<String> coCores;

    public CaixaCombinacao() {
        setTitle("Caixas de combinação");
        setSize(250, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(2, 2, 5, 5));

        String[] estados = { "AC", "AM", "AL", "AP", "BA", "CE", "DF" };
        coEstados = new JComboBox<String>(estados);
        coEstados.setMaximumRowCount(5);

        String[] cores = { "Amarelo", "Azul", "Branco", "Laranja", "Preto", "Roxo", "Vermelho", "Verde", "Outra" };
        coCores = new JComboBox<String>(cores);
        coCores.setEditable(true);
        coCores.setMaximumRowCount(3);
        coCores.setSelectedIndex(8);

        getContentPane().add(new JLabel("Estado:"));
        getContentPane().add(coEstados);
        getContentPane().add(new JLabel("Cor preferida:"));
        getContentPane().add(coCores);
    }

    public static void main(String[] args) {
        new CaixaCombinacao().setVisible(true);
    }
}

/********************************************************************
 * Este arquivo é parte integrante do livro identificado abaixo e é * protegido
 * pela legislação que trata dos direitos autorais. * * Título: Programação de
 * Computadores em Java * Autor: Rui Rossi dos Santos * Editora: NovaTerra
 * Editora e Distribuidora Ltda. * Ano: 2014 *
 ********************************************************************/
