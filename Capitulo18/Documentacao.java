package Capitulo17;

import javax.swing.JOptionPane;

/**
 * Essa classe visa ilustrar o uso de comentários comuns de documentação.
 * 
 * @author Sivaldo Muniz de Oliveira
 * @version 1.0
 */
public class Documentacao {

    /**
     * Armazena um texto qualquer.
     * 
     * @see java.lang.String
     */
    private String texto;

    /**
     * Construtor padrão da classe. Ele atribui o contéudo de seu parâmentro texto
     * ao atributo texto da classe.
     * 
     * @param texto 0 texto a ser atribuido ao atributo texto.
     */

    public Documentacao(String texto) {
        this.texto = texto;
    }

    /**
     * Esse método inverte o contéudo do atributo texto.
     * 
     * @return Uma <code>String<code> com o conteúdo invertido do atributo texto.
     */

    public String inverso() {
        String str = "";
        for (int i = 0; i < texto.length(); i++)
            str = texto.charAt(i) + str;
        return str;
    }

    /**
     * Método que torna esta classe executável e permite testá-la. Cria uma
     * instância da classe Documentacao e a usa para exibir o inverso da palavra
     * informada.
     * 
     * @see javax.swing.JOptionPane
     */

    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Informe uma palavra");
        if (str == null)
            System.exit(0);

        Documentacao dc = new Documentacao(str);
        str = dc.inverso();
        JOptionPane.showMessageDialog(null, str);
        System.exit(0);
    }

}
