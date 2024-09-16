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

<<<<<<< HEAD
    public void setOk(boolean isOk) {
        this.isOk = isOk;
=======
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
>>>>>>> 8b040a3ae3f4042637f62b2d82d345314975a0f9
    }

    @Override
    public String toString() {
        return "[descricao=" + descricao + ", Finalizado?=" + isOk + "]";
    }

<<<<<<< HEAD
=======
    public void setOk(boolean isOk) {
        this.isOk = isOk;
    }



>>>>>>> 8b040a3ae3f4042637f62b2d82d345314975a0f9
}
