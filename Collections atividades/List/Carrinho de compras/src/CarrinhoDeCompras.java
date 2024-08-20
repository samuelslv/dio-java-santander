package src;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaCompras;

    public CarrinhoDeCompras() {
        this.listaCompras = new ArrayList<>();
    }

    // Adiciona uma nova Item à lista com a descrição fornecida.
    public void adicionarItem(String nome, double preco, int quantidade) {
        listaCompras.add(new Item(nome, preco, quantidade));
    }

    // Remove uma Item da lista com base em sua descrição.
    public void removerItem(String nome) {
        List<Item> ItemsParaRemover = new ArrayList<>();

        for (Item t : listaCompras) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                ItemsParaRemover.add(t);
            }
        }
        listaCompras.removeAll(ItemsParaRemover);
    }

    // Retorna o número total de Items na lista.
    public double calcularValorToral() {
        double valor = 0;
        for (Item i : listaCompras) {
            valor = valor + (i.getQuantidade() * i.getPreco());
        }

        return valor;

    }

    // Retorna uma lista contendo a descrição de todas as Items na lista.
    public void exibirItens() {
        System.out.println(listaCompras);
        /*
         * for (Item Item : listaCompras) {
         * System.out.println(Item.getDescricao());
         * }
         */
    }

    public static void main(String[] args) {
        CarrinhoDeCompras Item = new CarrinhoDeCompras();

        Item.adicionarItem("12 Café", 3, 1);
        Item.adicionarItem("5 Leite em pó", 2, 1);
        Item.adicionarItem("5Playstation 5", 5000, 1);
        Item.adicionarItem("Dual sense 5", 500, 1);
        Item.adicionarItem("Puzzle", 32, 1);
        Item.adicionarItem("IPhone", 4, 1);
        System.out.println("----- Lita de items: ");
        Item.exibirItens();
        System.out.println("----- Valor total: " + Item.calcularValorToral());
        System.out.println("----- Revomer Puzzle");
        Item.removerItem("Puzzle");
        System.out.println("----- Lita de items: ");
        Item.exibirItens();

    }
}