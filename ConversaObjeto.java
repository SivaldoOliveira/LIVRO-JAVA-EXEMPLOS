
import javax.swing.JOptionPane;

public class ConversaObjeto {
    public static void main(String[] args) {
        Veiculo v1 = new Onibus("bbb-7885", 2001, 46);
        Onibus bus = (Onibus) v1;

        String str = "Dados do ônibus: " + "\nPlaca: " + v1.getPlaca() + "\nAno: " + v1.getAno() + "\nAssentos: "
                + bus.getAssentos();
        JOptionPane.showMessageDialog(null, str);

        System.exit(0);
    }

}
