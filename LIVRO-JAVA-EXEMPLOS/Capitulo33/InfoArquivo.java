import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import static javax.swing.JOptionPane.*;

public class InfoArquivo {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            String arq = showInputDialog("Que arquivo deseja analisar?");
            if (arq == null)
                break;
            File file = new File(arq);
            if (!file.exists()) {
                showMessageDialog(null, "Caminho não existe!", "Erro",
                        ERROR_MESSAGE);
                continue;
            }

            String props = "Propriedades do arquivo:" +
                    "\nLocalização: " + file.getPath() +
                    "\nTipo: " + (file.isDirectory() ? "Diretório" : "Arquivo") +
                    "\nÚltima modificação: " +
                    df.format(new Date(file.lastModified())) +
                    "\nOculto: " + (file.isHidden() ? "Sim" : "Não") +
                    "\nPermissões: " +
                    "\n - Leitura: " + (file.canRead() ? "Sim" : "Não") +
                    "\n - Escrita: " + (file.canWrite() ? "Sim" : "Não") +
                    "\n - Execução: " + (file.canExecute() ? "Sim" : "Não");
            showMessageDialog(null, props);
        }
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
