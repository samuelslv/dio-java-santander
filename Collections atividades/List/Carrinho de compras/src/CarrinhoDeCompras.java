package src;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaCompras;

    public CarrinhoDeCompras() {
        this.listaCompras = new ArrayList<>();

    }

    // Adiciona uma nova Item à lista com a descrição fornecida.
    public void adicionarItem(String descricao) {
        listaCompras.add(new Item(descricao));
    }

    // Remove uma Item da lista com base em sua descrição.
    public void removerItem(String descricao) {
        List<Item> ItemsParaRemover = new ArrayList<>();

        for (Item t : listaCompras) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                ItemsParaRemover.add(t);
            }
        }
        listaCompras.removeAll(ItemsParaRemover);
    }

    // Retorna o número total de Items na lista.
    public int obterNumeroTotalItems() {
        return listaCompras.size();

    }

    // Retorna uma lista contendo a descrição de todas as Items na lista.
    public void obterDescricoesItems() {
        System.out.println(listaCompras);
        /*for (Item Item : listaCompras) {
            System.out.println(Item.getDescricao());
        }*/
    }

    public static void main(String[] args) {
        CarrinhoDeCompras Item = new CarrinhoDeCompras();

        System.out.println("----- Tamamho da lista de Items: " + Item.obterNumeroTotalItems());
        Item.adicionarItem("Item 1");
        Item.adicionarItem("Item 2");
        Item.adicionarItem("Item 3");
        Item.adicionarItem("Item 4");
        Item.adicionarItem("Item 5");
        Item.adicionarItem("Item 6");
        System.out.println("----- Tamamho da lista de Items: " + Item.obterNumeroTotalItems());
        System.out.println("----- Items: ");
        Item.obterDescricoesItems();
        System.out.println("----- Revomer Item 4");
        Item.removerItem("Item 4");
        System.out.println("----- Items: ");
        Item.obterDescricoesItems();

    }
}