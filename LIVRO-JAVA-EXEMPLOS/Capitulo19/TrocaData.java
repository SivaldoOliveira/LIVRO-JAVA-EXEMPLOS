import static javax.swing.JOptionPane.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class TrocaData {
    private static Date[] dados;
    private static int qtde;

    public static void main(String[] args) {
        dados = new Date[100];
        qtde = 0;

        while (true) {
            int i = showOptionDialog(null, "Escolha uma opção", "Ordenação por Troca - Datas", 0, 3, null,
                    new String[] { "Incluir", "Ordenar", "Listar" }, "Incluir");
            if (i == -1)
                System.exit(0);
            if (i == 0)
                incluir();
            else if (i == 1)
                ordenar();
            else if (i == 2)
                listar();
        }
    }

    private static void incluir() {
        if (qtde == dados.length) {
            showMessageDialog(null, "Limite excedido", "Erro", ERROR_MESSAGE);
            return;
        }

        String str = showInputDialog(null, "Informe uma data");
        if (str == null)
            return;
        try {
            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
            dados[qtde++] = df.parse(str);
        } catch (ParseException pe) {
            showMessageDialog(null, "Dado inválido!", "Erro", ERROR_MESSAGE);
        }
    }

    private static void ordenar() {
        if (qtde == 0) {
            showConfirmDialog(null, "Não há dados!", "Erro", ERROR_MESSAGE);
            return;
        }
        OrdenacaoTroca.ordenar(dados, qtde);
        showMessageDialog(null, "Ordenação concluído!");
    }

    private static void listar() {
        if (qtde == 0) {
            showMessageDialog(null, "Não há dados!", "Erro", ERROR_MESSAGE);
            return;
        }

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        String str = "Lista de datas: ";
        for (int i = 0; i < qtde; i++) {
            if (i % 10 == 0)
                str += "\n \t";
            str += df.format(dados[i]) + " ";
        }
        showMessageDialog(null, str);
    }
}
