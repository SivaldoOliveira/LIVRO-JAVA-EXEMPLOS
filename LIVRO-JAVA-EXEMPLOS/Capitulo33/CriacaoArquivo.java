import java.io.File;
import java.io.IOException;
import static javax.swing.JOptionPane.*;

public class CriacaoArquivo {
    public static void main(String[] args) {
        String dir = showInputDialog("Que diretório deseja criar?");
        if (dir == null)
            System.exit(0);
        File fl_dir = new File(dir);

        if (!fl_dir.exists()) {
            fl_dir.mkdirs();
            showMessageDialog(null, "Diretório criado: " +
                    fl_dir.getPath());
        } else
            showMessageDialog(null, "Diretório já existe!");

        try {
            while (true) {
                String arq = showInputDialog("Que arquivo deseja criar?");
                if (arq == null)
                    System.exit(0);
                File file = new File(fl_dir.getPath() + File.separator + arq);
                if (!file.exists())
                    file.createNewFile();
                else
                    showMessageDialog(null, "Arquivo já existe!", "Erro",
                            ERROR_MESSAGE);
            }
        } catch (IOException ioex) {
            showMessageDialog(null, "Erro ocorrido!", "Erro", 0);
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
