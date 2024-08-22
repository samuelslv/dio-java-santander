import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasUnicasSet == null) ? 0 : palavrasUnicasSet.hashCode());
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
        if (palavrasUnicasSet == null) {
            if (other.palavrasUnicasSet != null)
                return false;
        } else if (!palavrasUnicasSet.equals(other.palavrasUnicasSet))
            return false;
        return true;
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return (boolean) palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavras() {
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
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
        System.out.println("A linguagem 'Bete' está no conjunto? " + lista.verificarPalavra("Bete"));
    }
}
