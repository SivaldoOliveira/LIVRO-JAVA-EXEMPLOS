import static javax.swing.JOptionPane.*;

public class PBTeste {
    private static int[] numeros;

    public static void main(String[] args) {
        numeros = new int[] { 12, 17, 23, 28, 45, 55, 64, 72, 89, 97 };

        while (true)

        {
            String str = showInputDialog("Informe um numero");
            if (str == null)
                System.exit(0);
            int numero = Integer.parseInt(str);

            int indice = PesquisaBinaria.pesquisar(numeros, numeros.length, numero);

            if (indice == -1) {
                str = "O numero " + numero + "Nao foi encontrado!";
                showMessageDialog(null, str, "Erro", ERROR_MESSAGE);
            } else {
                str = "O numero " + numero + " Esta na posicao " + indice;
                showMessageDialog(null, str, "Info", INFORMATION_MESSAGE);
            }
        }

    }
}
