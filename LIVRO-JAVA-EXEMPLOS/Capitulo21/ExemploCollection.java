import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ExemploCollection {
    private static Collection<Contato> colecao;

    public static void main(String[] args) {
        colecao = new ArrayList<Contato>();

        while (true) {
            Contato contato = new Contato();

            String str = showInputDialog("Informe o nome do contato");
            if (str == null)
                break;
            contato.setNome(str);

            if (colecao.contains(contato)) {
                showMessageDialog(null, "Contato ja cadastrado!", "Erro", ERROR_MESSAGE);
                continue;
            }

            str = showInputDialog("Informe o e-mail do contato");
            if (str == null)
                break;
            contato.setEmail(str);

            colecao.add(contato);
        }

        String str = "Recuperacao com foreach";
        for (Contato contato : colecao)
            str += "\n" + contato;
        showMessageDialog(null, str);

        str = "Recuperacao com iterator";
        Iterator<Contato> it = colecao.iterator();
        while (it.hasNext())
            str += "\n" + it.next();
        showMessageDialog(null, str);

        exibirEstado();
        colecao.clear();
        exibirEstado();

        System.exit(0);
    }

    private static void exibirEstado() {
        String str = "Estado da colecao: ";
        str += "\nVazia: " + (colecao.isEmpty() ? "Sim" : "Não");
        str += "\nTamanho: " + colecao.size();
        showMessageDialog(null, str);
    }
}

/********************************************************************
 * Este arquivo é parte integrante do livro identificado abaixo e é * protegido
 * pela legislação que trata dos direitos autorais. * * Título: Programação de
 * Computadores em Java * Autor: Rui Rossi dos Santos * Editora: NovaTerra
 * Editora e Distribuidora Ltda. * Ano: 2014 *
 ********************************************************************/
