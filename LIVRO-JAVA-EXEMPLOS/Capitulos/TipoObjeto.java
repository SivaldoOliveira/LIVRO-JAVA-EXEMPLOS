import javax.swing.JOptionPane;

public class TipoObjeto {
    public static void main(String[] args) {
        Veiculo v1 = new Onibus("AAA-3385", 2009, 46);
        String str = "Tipo de v1: ";
        if (v1 instanceof Onibus)
            str += "Onibus";
        else if (v1 instanceof Caminhao)
            str += "Caminhao";
        JOptionPane.showMessageDialog(null, str);

        Veiculo v2 = new Caminhao("VVV-8987", 2012, 4);
        str = "Tipo de v2: ";
        if (v2 instanceof Onibus)
            str += "Onibus";
        else if (v2 instanceof Caminhao)
            str += "Caminhao";
        JOptionPane.showMessageDialog(null, str);

        System.exit(0);
    }

}
