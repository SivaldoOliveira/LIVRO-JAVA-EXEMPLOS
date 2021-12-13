import java.awt.*;
import javax.swing.*;

public class CampoSenha extends JFrame {
    private JTextField tfId;
    private JPasswordField pfSenha;

    public CampoSenha() {
        setTitle("Campos de senha");
        setSize(400, 120);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(3, 2, 5, 5));

        tfId = new JTextField();
        pfSenha = new JPasswordField();
        pfSenha.setEchoChar('@');

        getContentPane().add(new JLabel("Identificação:"));
        getContentPane().add(tfId);
        getContentPane().add(new JLabel("Senha:"));
        getContentPane().add(pfSenha);
        getContentPane().add(new JButton("OK"));
        getContentPane().add(new JButton("Cancelar"));
    }

    public static void main(String[] args) {
        new CampoSenha().setVisible(true);
    }
}

/********************************************************************
 * Este arquivo é parte integrante do livro identificado abaixo e é * protegido
 * pela legislação que trata dos direitos autorais. * * Título: Programação de
 * Computadores em Java * Autor: Rui Rossi dos Santos * Editora: NovaTerra
 * Editora e Distribuidora Ltda. * Ano: 2014 *
 ********************************************************************/
