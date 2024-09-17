import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroNome = agendaContatoMap.get(nome);
        }
        return numeroNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Samuel1", 1);
        agendaContatos.adicionarContato("Samuel2", 2);
        agendaContatos.adicionarContato("Samuel3", 3);
        agendaContatos.adicionarContato("Samuel4", 4);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Samuel3"));
        agendaContatos.removerContato("Samuel3");
        System.out.println(agendaContatos.pesquisarPorNome("Samuel3"));
        agendaContatos.pesquisarPorNome("Samuel3");
        agendaContatos.exibirContatos();
    }
}
