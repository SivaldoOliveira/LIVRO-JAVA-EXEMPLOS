import static javax.swing.JOptionPane.*;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class OrdenacaoPersonalizada {
    private static List<Funcionario> lista;

    public static void main(String[] args) {
        lista = new LinkedList<Funcionario>();

        while (true) {
            int i = showOptionDialog(null, "Escolha um opção", "Cadastro de funcionários", 0, 3, null,
                    new String[] { "Incluir", "Ordenar", "Inverter", "Desordenar", "Relatório" }, "Incluir");
            if (i == -1)
                System.exit(0);
            if (i == 0)
                incluir();
            else if (i == 1)
                ordenar();
            else if (i == 2)
                inverter();
            else if (i == 3)
                desordenar();
            else if (i == 4)
                exibir();

        }
    }

    private static void incluir() {
        Funcionario fun = new Funcionario();

        String str = showInputDialog("Matrícula do Funcionário");
        if (str == null)
            return;
        fun.setMatricula(Integer.parseInt(str));

        str = showInputDialog("Nome do funcionario");
        if (str == null)
            return;
        fun.setNome(str);

        str = showInputDialog("Salário do Funcionario");
        if (str == null)
            return;
        fun.setSalario(Double.parseDouble(str));

        lista.add(fun);
    }

    private static void ordenar() {
        int i = showOptionDialog(null, "Opção de ordenação:", "Cadastro de funcionários", 0, 3, null,
                new String[] { "Matricula", "Nome", "Salário" }, "Matricula");
        if (i == -1)
            return;
        if (i == 0)
            Collections.sort(lista);
        else if (i == 1)
            Collections.sort(lista, new FunNomeComparator());
        else if (i == 2)
            Collections.sort(lista, new FunSalarioComparator());
    }

    private static void inverter() {
        Collections.reverse(lista);
    }

    private static void desordenar() {
        Collections.shuffle(lista);
    }

    private static void exibir() {
        String str = "Funcionarios cadastrados:\n";
        for (Funcionario fun : lista)
            str += "\n" + fun;
        showMessageDialog(null, str);
    }
}
