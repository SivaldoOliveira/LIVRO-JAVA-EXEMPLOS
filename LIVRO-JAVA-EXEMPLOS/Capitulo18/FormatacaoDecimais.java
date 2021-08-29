import static java.lang.System.out;
import java.text.DecimalFormat;

public class FormatacaoDecimais {
    public static void main(String[] args) {
        double numero = 1234567.123456;
        out.println("Número original: \t" + numero);

        DecimalFormat df = new DecimalFormat("#,##0.0000");
        out.println("Número Formatado:\t" + df.format(numero));

    }
}
