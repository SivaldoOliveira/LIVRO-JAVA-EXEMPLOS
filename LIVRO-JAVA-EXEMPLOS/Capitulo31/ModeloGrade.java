import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class ModeloGrade extends JFrame {
    private JTable tbDados;

    public ModeloGrade() {
        setTitle("Grade de dados");
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] titulos = { "Estado", "Municípios" };
        Object[][] dados = { { "Espírito Santo", 71 }, { "Minas Gerais", 756 },
                { "Paraná", 371 }, { "Rio de Janeiro", 81 }, { "São Paulo", 625 },
                { "Santa Catarina", 217 }, { "Rio Grande do Sul", 427 } };
        tbDados = new JTable(new Modelo(titulos, dados));
        tbDados.setFocusable(true);

        getContentPane().setLayout(new GridLayout(1, 1));
        getContentPane().add(new JScrollPane(tbDados));
    }

    public static void main(String[] args) {
        new ModeloGrade().setVisible(true);
    }
}

class Modelo extends AbstractTableModel {
    protected String[] colunas;
    protected Object[][] linhas;

    public Modelo(String[] colunas, Object[][] linhas) {
        this.colunas = colunas;
        this.linhas = linhas;
    }

    public int getRowCount() {
        return linhas.length;
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    public Object getValueAt(int linha, int coluna) {
        return linhas[linha][coluna];
    }

    public boolean isCellEditable(int linha, int coluna) {
        return false;
    }

    public Class getColumnClass(int coluna) {
        return getValueAt(0, coluna).getClass();
    }
}

/********************************************************************
 * Este arquivo é parte integrante do livro identificado abaixo e é *
 * protegido pela legislação que trata dos direitos autorais. *
 * *
 * Título: Programação de Computadores em Java *
 * Autor: Rui Rossi dos Santos *
 * Editora: NovaTerra Editora e Distribuidora Ltda. *
 * Ano: 2014 *
 ********************************************************************/
