import static java.lang.System.out;
import java.util.Locale;

public class PaisesDisponiveis {

    public static void main(String[] args) {
        String[] paises = Locale.getISOCountries();
        out.println("Paíse disponiveis: ");
        for (int i = 1; i <= paises.length; i++) {
            out.print(paises[i - 1] + " ");
            if (i % 25 == 0)
                out.println();

        }
    }
}
