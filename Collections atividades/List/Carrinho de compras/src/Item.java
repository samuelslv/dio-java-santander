package src;
public class Item {

    private String descricao;

    public Item(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    /*public void setDescricao(String descricao) {
        this.descricao = descricao;
    }*/

    

}
