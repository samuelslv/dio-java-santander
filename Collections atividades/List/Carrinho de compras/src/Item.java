package src;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "; Preço: " + preco + "; QTD: " + quantidade;
    }

}
