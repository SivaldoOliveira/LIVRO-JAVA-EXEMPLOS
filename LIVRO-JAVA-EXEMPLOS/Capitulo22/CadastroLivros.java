import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CadastroLivros {
    private static List<Livro> livros;

    public static void main(String[] args) {
        livros = new ArrayList<Livro>();
        livros.add(new Livro(1, "Java", 2010, new Editora(1, "NovaTerra")));
        livros.add(new Livro(2, "Mente", 1996, new Editora(2, "Episteme")));
        livros.add(new Livro(3, "Corpo", 2002, new Editora(2, "Episteme")));

        livros.get(0).incluirAutor(new Autor(1, "Rui Rossi dos Santos"));
        livros.get(0).incluirAutor(new Autor(1, "Mônica Rodrigues"));
        livros.get(1).incluirAutor(new Autor(2, "Reginaldo Gomes"));
        livros.get(1).incluirAutor(new Autor(3, "Fábio Santiago"));
        livros.get(1).incluirAutor(new Autor(4, "Carlos Abreu"));
        livros.get(2).incluirAutor(new Autor(5, "Mara Moreira"));
        livros.get(2).incluirAutor(new Autor(6, "Carla Pitanga"));

        livros.get(0).incluirCapitulo(new Capitulo(4, "Variáveis"));
        livros.get(0).incluirCapitulo(new Capitulo(3, "Aplicativos"));
        livros.get(0).incluirCapitulo(new Capitulo(2, "Ambiente"));
        livros.get(0).incluirCapitulo(new Capitulo(1, "Introdução"));

        for (Livro l : livros) {
            System.out.println(l);

            l.ordenarAutores();
            System.out.print("  Autores: ");
            ListIterator<Autor> la = l.getIteratorAutores();
            while (la.hasNext())
                System.out.print("[" + la.next().getNome() + "]");

            l.ordenarCapitulos();
            System.out.println("\n  Capítulos: " + l.getCapitulos().size());
            ListIterator<Capitulo> lc = l.getIteratorCapitulos();
            while (lc.hasNext())
                System.out.println("\t" + lc.next());
        }
    }
}
