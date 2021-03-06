import static javax.swing.JOptionPane.*;

public class CadastroComputadores {
    public static void main(String[] args) {
        Computador[] registros = new Computador[100];

        for (int indice = 0; indice < registros.length; indice++) {
            Computador comp = null;
            int codigo = 0;
            String str, descricao;
            String nr = "Computador " + (indice + 1) + ": ";

            while (true) {
                str = showInputDialog(nr + "Código");
                if (str == null)
                    break;

                try {
                    codigo = Integer.parseInt(str);
                } catch (NumberFormatException nfe) {
                    showMessageDialog(null, "Código inválido!", "Erro", 0);
                    continue;
                }

                str = showInputDialog(nr + "descrição");
                if (str == null)
                    break;
                descricao = str;

                try {
                    comp = new Computador(codigo, descricao);
                    break;
                } catch (Exception ex) {
                    showMessageDialog(null, ex.getMessage(), "Erro", 0);
                }
            }
            if (str == null)
                break;

            registros[indice] = comp;
        }

        String relatorio = "Relatório de computadores:";
        for (Computador comp : registros) {
            if (comp == null)
                break;
            relatorio += "\n" + comp;
        }

        showMessageDialog(null, relatorio);
        System.exit(0);
    }
}
