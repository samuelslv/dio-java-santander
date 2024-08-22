import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoList;

    public AgendaContatos() {
        this.contatoList = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoList.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!contatoList.isEmpty()) {
            System.out.println(contatoList);
        } else {
            System.out.println("Erro");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> mostrarLista = new HashSet<>();
        if (!contatoList.isEmpty()) {
            for (Contato contato : contatoList) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    mostrarLista.add(contato);
                }
            }
        } else {
            System.out.println("Erro");
        }
        return mostrarLista;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        if (!contatoList.isEmpty()) {
            for (Contato contato : contatoList) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumero(novoNumero);
                }
            }
        } else {
            System.out.println("Erro");
        }
    }

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        System.out.println("Adicionar contatos");
        contatos.adicionarContato("Samuel", 1);
        contatos.adicionarContato("Bete", 2);
        contatos.adicionarContato("Rafael", 3);
        contatos.adicionarContato("Moises", 4);
        contatos.adicionarContato("Suzana", 5);
        contatos.adicionarContato("Bibi", 6);
        contatos.adicionarContato("Maria", 7);
        contatos.adicionarContato("Helio", 8);
        contatos.adicionarContato("Kyslla", 9);

        System.out.println("Exibir contatos");
        contatos.exibirContatos();

        System.out.println("Pesquisar contato");
        System.out.println(contatos.pesquisarPorNome("Moises"));

        System.out.println("Mudar numero");
        contatos.atualizarNumeroContato("Moises", 120262);

        System.out.println("Exibir contatos");
        contatos.exibirContatos();
    }

}