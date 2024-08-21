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
    public void pesquisarPorAutor(String autor) {
        List<Livro> livrosAutor = new ArrayList<>();

        for (Livro t : catalogoLivros) {
            if (t.getAutor().equalsIgnoreCase(autor)) {
                livrosAutor.add(t);
            }
        }
        System.out.println("Livros de " + autor);
        System.out.println(livrosAutor);
    }

    // Pesquisa livros publicados em um determinado intervalo de anos e retorna uma
    // lista com os livros encontrados.
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPeriodo = new ArrayList<>();

        for (Livro t : catalogoLivros) {
            // String resultado = nota >=7 ? "Aprovado" : "Reprovado";
            if (t.getAnoPublicacao() >= anoInicial && t.getAnoPublicacao() <= anoFinal) {
                livrosPeriodo.add(t);
            }
        }
        System.out.println("Livros do perido de " + anoInicial + " até " + anoFinal + ":");
        System.out.println(livrosPeriodo);
        return catalogoLivros;
    }

    // Pesquisa livros por título e retorna o primeiro livro encontrado.
    public void pesquisarPorTitulo(String titulo) {
        // List<Livro> livroTitulo = new ArrayList<>();
        System.out.println("Pesquisando pelo " + titulo);
        for (Livro t : catalogoLivros) {

            if (t.getTitulo().equals(titulo)) {
                System.out.println(t.getTitulo());
                return;
            }
        }

        System.out.println("Nao foi encontrado");
        // System.out.println("Livros de "+ titulo);
        // System.out.println(livroTitulo);
    }

    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivro("Livro S1", "Samuel", 2000);
        livros.adicionarLivro("Livro S2", "Samuel", 2014);
        livros.adicionarLivro("Livro B", "Bete", 2020);
        livros.adicionarLivro("Livro Su", "Sauzana", 2020);
        livros.adicionarLivro("Livro S3", "Samuel", 2004);
        livros.adicionarLivro("Livro M", "Moises", 1998);
        livros.pesquisarPorAutor("Bete");
        livros.pesquisarPorIntervaloAnos(1990, 2004);
        livros.pesquisarPorTitulo("Livro Sua");
    }
}