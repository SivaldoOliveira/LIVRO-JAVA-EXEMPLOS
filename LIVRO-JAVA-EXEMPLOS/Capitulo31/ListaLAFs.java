import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class ListaLAFs {
    public static void main(String[] args) {
        LookAndFeelInfo[] lafs = UIManager.getInstalledLookAndFeels();
        String str = "LookAndFeels disponíveis:\n";
        for (LookAndFeelInfo info : lafs)
            str += "\n" + info.getName() + " - " + info.getClassName();
        JOptionPane.showMessageDialog(null, str);
    }
}
