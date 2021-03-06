import static javax.swing.JOptionPane.*;

public class PLAtletas {
    private static Atleta[] dados;
    private static int qtde;

    public static void main(String[] args) {
        dados = new Atleta[1000000];
        qtde = 0;

        while (true) {
            int i = showOptionDialog(null, "Escolha uma opção", "Cadastro de atletas", 0, 1, null,
                    new String[] { "Incluir", "Excluir", "Localizar", "Listar" }, "Incluir");
            if (i == -1)
                System.exit(0);
            if (i == 0)
                incluir();
            else if (i == 1)
                excluir();
            else if (i == 2)
                localizar();
            else if (i == 3)
                listar();
        }
    }

    private static void incluir() {
        if (qtde == dados.length) {
            showMessageDialog(null, "Limite excedido", "Erro", ERROR_MESSAGE);
            return;
        }

        Atleta att = new Atleta();
        String str = showInputDialog("Informe o número do atleta");
        if (str == null)
            return;
        try {
            att.setNumero(str);
        } catch (Exception ex) {
            showMessageDialog(null, ex.getMessage(), "Erro", ERROR_MESSAGE);
            return;
        }
        int indice = PesquisaLinear.pesquisar(dados, qtde, att);
        if (indice != -1) {
            showMessageDialog(null, "Já há um atleta com o número " + att.getNumero(), "Erro", ERROR_MESSAGE);
            return;
        }
        str = showInputDialog("Informe o nome do atleta");
        if (str == null)
            return;
        att.setNome(str);

        dados[qtde++] = att;
        showMessageDialog(null, "Registro incluído!\n" + att);
    }

    private static void excluir() {
        if (qtde == 0) {
            showMessageDialog(null, "Não há dados", "Erro", ERROR_MESSAGE);
            return;
        }
        Atleta att = new Atleta();

        String str = showInputDialog("Informe o número do atleta");
        if (str == null)
            return;
        try {
            att.setNumero(str);
        } catch (Exception ex) {
            showMessageDialog(null, ex.getMessage(), "Erro", ERROR_MESSAGE);
            return;
        }
        int indice = PesquisaLinear.pesquisar(dados, qtde, att);

        if (indice == -1) {
            str = "Não há atleta com o número " + att.getNumero();
            showMessageDialog(null, str, "Erro", 0);
            return;
        } else
            att = dados[indice];
        for (int i = indice; i < qtde - 1; i++)
            dados[i] = dados[i + 1];
        qtde--;
        showMessageDialog(null, "Registro excluído!\n" + att);
    }

    private static void localizar() {
        if (qtde == 0) {
            showMessageDialog(null, "Não há dados!", "Erro", ERROR_MESSAGE);
            return;
        }
        Atleta att = new Atleta();

        String str = showInputDialog("Informe o número do atletta");
        if (str == null)
            return;
        try {
            att.setNumero(str);
        } catch (Exception ex) {
            showMessageDialog(null, ex.getMessage(), "Erro", ERROR_MESSAGE);
            return;
        }
        int indice = PesquisaLinear.pesquisar(dados, qtde, att);

        if (indice == -1) {
            str = "Não há atleta com o número " + att.getNumero();
            showMessageDialog(null, str, "Erro", 0);
            return;
        }
        showMessageDialog(null, dados[indice]);
    }

    private static void listar() {
        if (qtde == 0) {
            showMessageDialog(null, "Não há dados!", "Erro", ERROR_MESSAGE);
            return;
        }
        String str = "";
        for (int i = 0; i < qtde; i++)
            str += "\n" + dados[i];

        showMessageDialog(null, str, "Relatório", INFORMATION_MESSAGE);
    }
}
