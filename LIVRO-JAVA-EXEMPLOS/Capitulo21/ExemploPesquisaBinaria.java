import static javax.swing.JOptionPane.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploPesquisaBinaria {
    private static List<Funcionario> lista;

    public static void main(String[] args) {
        lista = new LinkedList<Funcionario>();

        while (true) {
            int i = showOptionDialog(null, "Escolha uma opção", "Cadastro de funcionários", 0, 3, null,
                    new String[] { "Incluir", "Pesquisar", "Relatório" }, "Incluir");
            if (i == -1)
                System.exit(0);
            if (i == 0)
                incluir();
            else if (i == 1)
                pesquisar();
            else if (i == 2)
                exibir();
        }
    }

    private static void incluir() {
        Funcionario fun = new Funcionario();

        String str = showInputDialog("Matrícula do funcionário");
        if (str == null)
            return;
        fun.setMatricula(Integer.parseInt(str));

        str = showInputDialog("Nome do funcionário");
        if (str == null)
            return;
        fun.setNome(str);

        str = showInputDialog("Salário do funcionário");
        if (str == null)
            return;
        fun.setSalario(Double.parseDouble(str));

        lista.add(fun);
    }

    private static void pesquisar() {
        int i = showOptionDialog(null, "Opção de pesquisa:", "Cadastro de funcionários", 0, 3, null,
                new String[] { "Matrícula", "Nome", "Salário" }, "Matrícula");
        if (i == -1)
            return;
        if (i == 0)
            pesquisarPelaMatricula();
        else if (i == 1)
            pesquisarPeloNome();
        else if (i == 2)
            pesquisarPeloSalario();
    }

    private static void pesquisarPelaMatricula() {
        Collections.sort(lista);

        Funcionario fun = new Funcionario();
        String str = showInputDialog("Matrícula do funcionário");
        if (str == null)
            return;
        fun.setMatricula(Integer.parseInt(str));

        int indice = Collections.binarySearch(lista, fun);

        if (indice < 0)
            showMessageDialog(null, "Não encontrado!");
        else
            showMessageDialog(null, "Encontrado no índice " + indice);
    }

    private static void pesquisarPeloNome() {
        Collections.sort(lista, new FunNomeComparator());

        Funcionario fun = new Funcionario();
        String str = showInputDialog("Nome do funcionário");
        if (str == null)
            return;
        fun.setNome(str);

        int indice = Collections.binarySearch(lista, fun, new FunNomeComparator());

        if (indice < 0)
            showMessageDialog(null, "Não encontrado!");
        else
            showMessageDialog(null, "Encontrado no índice " + indice);
    }

    private static void pesquisarPeloSalario() {
        Collections.sort(lista, new FunSalarioComparator());

        Funcionario fun = new Funcionario();
        String str = showInputDialog("Salário do funcionário");
        if (str == null)
            return;
        fun.setSalario(Double.parseDouble(str));

        int indice = Collections.binarySearch(lista, fun, new FunSalarioComparator());

        if (indice < 0)
            showMessageDialog(null, "Não encontrado!");
        else
            showMessageDialog(null, "Encontrado no índice " + indice);
    }

    private static void exibir() {
        String str = "Funcionários cadastrados:\n";
        for (Funcionario fun : lista)
            str += "\n" + fun;
        showMessageDialog(null, str);
    }
}

/********************************************************************
 * Este arquivo é parte integrante do livro identificado abaixo e é * protegido
 * pela legislação que trata dos direitos autorais. * * Título: Programação de
 * Computadores em Java * Autor: Rui Rossi dos Santos * Editora: NovaTerra
 * Editora e Distribuidora Ltda. * Ano: 2014 *
 ********************************************************************/
