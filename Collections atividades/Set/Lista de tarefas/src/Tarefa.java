public class Tarefa {
    private String descricao;
    private boolean isOk;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.isOk = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getIsOk() {
        return isOk;
    }

    public void setOk(boolean isOk) {
        this.isOk = isOk;
    }

    @Override
    public String toString() {
        return "[descricao=" + descricao + ", Finalizado?=" + isOk + "]";
    }

}
