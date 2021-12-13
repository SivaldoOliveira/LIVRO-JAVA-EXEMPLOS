import java.awt.*;
import javax.swing.*;

public class DesktopImagem extends JDesktopPane {
    private ImageIcon iiIMagem;

    public DesktopImagem(String imagem) {
        iiIMagem = new ImageIcon(getClass().getResource(imagem));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        iiIMagem.paintIcon(this, g, 0, 0);
    }

    public Dimension getPreDimension() {
        return new Dimension(iiIMagem.getIconWidth(),
                iiIMagem.getIconHeight());
    }
}
