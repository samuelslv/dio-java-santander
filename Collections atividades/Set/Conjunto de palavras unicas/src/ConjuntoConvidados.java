import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoConvidados other = (ConjuntoConvidados) obj;
        if (convidadoSet == null) {
            if (other.convidadoSet != null)
                return false;
        } else if (!convidadoSet.equals(other.convidadoSet))
            return false;
        return true;
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados lista = new ConjuntoConvidados();

        lista.adicionarConvidado("Samuel Silva", 10);
        lista.adicionarConvidado("Samuel Silva", 10);
        lista.adicionarConvidado("Suzana", 30);
        lista.adicionarConvidado("Bete", 40);
        lista.adicionarConvidado("Moises", 50);

       System.out.println(lista.contarConvidados());
       lista.exibirConvidados();
    }
}
