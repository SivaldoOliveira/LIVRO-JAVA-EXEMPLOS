import javax.swing.JOptionPane;

public class CadastroVeiculos {
    public static void main(String[] args) {
        Veiculo[] dados = new Veiculo[100];

        dados[0] = new Onibus("ZAB-9090", 2009, 44);
        dados[1] = new Caminhao("EAA-8789", 2007, 45);
        dados[2] = new Caminhao("ZTB-9090", 2007, 43);
        dados[3] = new Onibus("ACC-7790", 2005, 44);

        String str = "Tipo dos Objetos:";
        for (int i = 0; i < dados.length; i++) {
            if (dados[i] == null)
                break;
            str += "\n" + (i + 1) + ") " + dados[i].getClass().getName();
        }

        JOptionPane.showMessageDialog(null, str);

        for (Veiculo v : dados) {
            if (v == null)
                break;
            v.exibirDados();
        }

        System.exit(0);
    }
}
