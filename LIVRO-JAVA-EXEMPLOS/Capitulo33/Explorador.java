import java.io.File;
import static javax.swing.JOptionPane.*;

public class Explorador {
    public static void main(String[] args) {
        while (true) {
            String dir = showInputDialog("Indique um diretório");
            if (dir == null)
                System.exit(0);
            File fl_dir = new File(dir);

            if (!fl_dir.exists()) {
                showMessageDialog(null, "Diretório não existe!", "Erro",
                        ERROR_MESSAGE);
                continue;
            }

            if (!fl_dir.isDirectory()) {
                showMessageDialog(null, "Não é um diretório!", "Erro",
                        ERROR_MESSAGE);
                continue;
            }

            String[] conteudo = fl_dir.list();

            String str = "Conteúdo do diretório: " + fl_dir.getPath();
            for (String s : conteudo) {
                File file = new File(fl_dir.getPath() + File.separator + s);
                str += "\n- " + s + " (" +
                        (file.isFile() ? "Arquivo" : "Diretório") + ")";
            }
            showMessageDialog(null, str);
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
