import javax.swing.JOptionPane;

public class ConsultaClasse {
    public static void main(String[] args) {
        Veiculo v1 = new Onibus("AAA-4747", 2009, 46);
        Veiculo v2 = new Caminhao("BBB-7869", 2009, 2);

        JOptionPane.showMessageDialog(null, v1.getClass().getName());
        JOptionPane.showMessageDialog(null, v2.getClass().getName());
        System.exit(0);
    }

}
