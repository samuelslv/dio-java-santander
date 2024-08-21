import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> catalogoLivros;

    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }

    // Adiciona um livro ao catálogo.
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogoLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Pesquisa livros por autor e retorna uma lista com os livros encontrados.
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosAutor = new ArrayList<>();

        if (!catalogoLivros.isEmpty()) {
            for (Livro t : catalogoLivros) {
                if (t.getAutor().equalsIgnoreCase(autor)) {
                    livrosAutor.add(t);
                }
            }
            System.out.println("Livros de " + autor);
        }
        return livrosAutor;
    }

    // Pesquisa livros publicados em um determinado intervalo de anos e retorna uma
    // lista com os livros encontrados.
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPeriodo = new ArrayList<>();

        if (!catalogoLivros.isEmpty()) {
            for (Livro t : catalogoLivros) {
                // String resultado = nota >=7 ? "Aprovado" : "Reprovado";
                if (t.getAnoPublicacao() >= anoInicial && t.getAnoPublicacao() <= anoFinal) {
                    livrosPeriodo.add(t);
                }
            }
        }
        System.out.println("Livros do perido de " + anoInicial + " até " + anoFinal + ":");
        return livrosPeriodo;
    }

    // Pesquisa livros por título e retorna o primeiro livro encontrado.
    public Livro pesquisarPorTitulo(String titulo) {
        // List<Livro> livroTitulo = new ArrayList<>();
        Livro livroTitulo = null;
        System.out.println("Pesquisando pelo titulo: " + titulo);
        if (!catalogoLivros.isEmpty()) {
            for (Livro t : catalogoLivros) {
                if (t.getTitulo().equalsIgnoreCase(titulo)) {
                    livroTitulo = t;
                    break;
                }
            }
        }
        return livroTitulo;

    }

    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivro("Livro S1", "Samuel", 2000);
        livros.adicionarLivro("Livro S2", "Samuel", 2014);
        livros.adicionarLivro("Livro B", "Bete", 2020);
        livros.adicionarLivro("Livro Su", "Sauzana", 2020);
        livros.adicionarLivro("Livro S3", "Samuel", 2004);
        livros.adicionarLivro("Livro M", "Moises", 1998);

        System.out.println("----- Pesquisando autor -----");
        System.out.print(livros.pesquisarPorAutor("Bete"));
        System.out.println("\n\n----- Pesquisando no intervalo -----");
        System.out.print(livros.pesquisarPorIntervaloAnos(1990, 2004));
        System.out.println("\n\n----- Pesquisando por titulo -----");
        System.out.print(livros.pesquisarPorTitulo("Livro Su"));
    }
}