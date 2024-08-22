import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasSet == null) ? 0 : palavrasSet.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavrasSet == null) {
            if (other.palavrasSet != null)
                return false;
        } else if (!palavrasSet.equals(other.palavrasSet))
            return false;
        return true;
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraRemover = null;
        for (String p : palavrasSet) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraRemover = palavra;
                break;
            }
        }
        palavrasSet.remove(palavraRemover);
    }

    public String verificarPalavra(String palavra) {
        for (String p : palavrasSet) {
            if (p.equals(palavra)) {
                return "Palavra existe";
            }
        }
        return "Palavra nao existe";
    }

    public void exibirPalavras() {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas lista = new ConjuntoPalavrasUnicas();

        lista.adicionarPalavra("Samuel Silva");
        lista.adicionarPalavra("Samuel Silva");
        lista.adicionarPalavra("Samuel Silva");
        lista.adicionarPalavra("Samuel Silva");
        lista.adicionarPalavra("Remover");
        lista.adicionarPalavra("Suzana");
        lista.adicionarPalavra("Bete");
        lista.adicionarPalavra("Moises");

        lista.exibirPalavras();
        lista.removerPalavra("Remover");
        lista.exibirPalavras();
        System.out.println(lista.verificarPalavra("Suzana"));
    }
}
