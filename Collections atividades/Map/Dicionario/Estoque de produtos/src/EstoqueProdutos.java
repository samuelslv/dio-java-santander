import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0d;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                valorTotal += (p.getPreco() * p.getQuantidade());
                //System.out.println("------" + valorTotal);
            }
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisbarato = null;
        double maiorPreco = Double.MAX_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() < maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisbarato = p;
                }
            }
        }
        return produtoMaisbarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidade = null;
        double maiorQuantidade = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getQuantidade() > maiorQuantidade) {
                    maiorQuantidade = p.getQuantidade();
                    produtoMaiorQuantidade = p;
                }
            }
        }
        return produtoMaiorQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1, "Produto21", 21, 2);
        estoque.adicionarProduto(2, "Produto12", 12, 4);
        estoque.adicionarProduto(3, "Produto24", 24, 5);
        estoque.adicionarProduto(4, "Produto4", 4, 42);
        estoque.adicionarProduto(5, "Produto7", 7, 4);

        estoque.exibirProdutos();
        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println(estoque.obterProdutoMaisCaro());
        System.out.println(estoque.obterProdutoMaisBarato());
        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
