import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class DialogoPadrao extends JFrame implements ActionListener {
    private JPanel pnCenter;
    private JButton btMensagem;
    private JButton btConfirmacao;
    private JButton btEntrada;
    private JButton btOpcao;
    private JLabel lbResposta;

    public DialogoPadrao() {
        setTitle("Diálogos padronizados");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        btMensagem = new JButton("Mensagem");
        btConfirmacao = new JButton("Confirmação");
        btEntrada = new JButton("Entrada");
        btOpcao = new JButton("Opção");
        lbResposta = new JLabel("Resposta:");

        btMensagem.addActionListener(this);
        btConfirmacao.addActionListener(this);
        btEntrada.addActionListener(this);
        btOpcao.addActionListener(this);

        pnCenter = new JPanel();
        pnCenter.add(btMensagem);
        pnCenter.add(btConfirmacao);
        pnCenter.add(btEntrada);
        pnCenter.add(btOpcao);

        getContentPane().add(pnCenter, BorderLayout.CENTER);
        getContentPane().add(lbResposta, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btMensagem) {
            showMessageDialog(this, "Erro", "Mensagem", ERROR_MESSAGE);
            showMessageDialog(this, "Informação", "Mensagem",
                    INFORMATION_MESSAGE);
            showMessageDialog(this, "Alerta", "Mensagem", WARNING_MESSAGE);
            return;
        }

        if (e.getSource() == btConfirmacao) {
            int res = showConfirmDialog(this, "Sim ou não?", "Confirme",
                    YES_NO_OPTION);

            if (res == -1)
                lbResposta.setText("Resposta: Nenhuma");
            else if (res == 0)
                lbResposta.setText("Resposta: Yes");
            else if (res == 1)
                lbResposta.setText("Resposta: No");

            res = showConfirmDialog(this, "OK?", "Confirme",
                    OK_CANCEL_OPTION);

            if (res == -1)
                lbResposta.setText("Resposta: Nenhuma");
            if (res == 0)
                lbResposta.setText("Resposta: OK");
            if (res == 2)
                lbResposta.setText("Resposta: Cancel");
            return;
        }

        if (e.getSource() == btEntrada) {
            String str = showInputDialog(this, "Qual é seu nome?",
                    "Informe", QUESTION_MESSAGE);
            lbResposta.setText("Resposta: " + str);

            str = (String) showInputDialog(this, "O que você quer?", "Opte",
                    QUESTION_MESSAGE, null, new String[] { "Tudo", "Nada" }, "Nada");
            lbResposta.setText("Resposta: " + str);
            return;
        }

        if (e.getSource() == btOpcao) {
            int res = showOptionDialog(this, "Sim?", "Confirme", 0,
                    QUESTION_MESSAGE, null, new String[] { "Sim", "Não" }, "Não");

            if (res == -1)
                lbResposta.setText("Resposta: Nenhuma");
            else if (res == 0)
                lbResposta.setText("Resposta: Sim");
            else if (res == 1)
                lbResposta.setText("Resposta: Não");
        }
    }

    public static void main(String[] args) {
        new DialogoPadrao().setVisible(true);
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
