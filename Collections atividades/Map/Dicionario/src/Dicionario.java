import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String descricao = null;
        if (!dicionarioMap.isEmpty()) {
            descricao = dicionarioMap.get(palavra);
        }

        return descricao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Samuel1", "def1");
        dicionario.adicionarPalavra("Samuel2", "def2");
        dicionario.adicionarPalavra("Samuel3", "def3");
        dicionario.adicionarPalavra("Samuel4", "def4");

        dicionario.exibirPalavras();
        dicionario.removerPalavra("Samuel3");
        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Samuel1"));
    }

}
