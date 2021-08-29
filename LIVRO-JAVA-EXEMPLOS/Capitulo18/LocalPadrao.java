import static java.lang.System.out;
import java.util.Locale;

public class LocalPadrao {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();

        out.println("Local padrão: " + local.getDisplayName());
        out.print("idioma: " + local.getDisplayLanguage());
        out.print(" - " + local.getLanguage());
        out.println("- " + local.getISO3Language());
        out.println("País: " + local.getCountry());
        out.println("- " + local.getISO3Country());

    }

}
