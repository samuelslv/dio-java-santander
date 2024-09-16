import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void limparListaTarefas() {
        tarefasSet.removeAll(tarefasSet);
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefasSet.isEmpty()) {
          for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
              tarefaParaRemover = t;
              break;
            }
          }
          tarefasSet.remove(tarefaParaRemover);
        } else {
          System.out.println("O conjunto está vazio");
        }
    
        if(tarefaParaRemover == null) {
          System.out.println("Tarefa não encontrada!");
        }
    }

    public int contarConvidados() {
        return tarefasSet.size();
    }

    public void exibirTarefas() {
        if(!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
          } else {
            System.out.println("Tarefa não encontrada!");
          }
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasOK = new HashSet<>();
        for (Tarefa c : tarefasSet) {
            if (c.getIsOk() == true) {
                tarefasOK.add(c);
            }
        }
        return tarefasOK;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNotOK = new HashSet<>();
        for (Tarefa c : tarefasSet) {
            if (c.getIsOk() == false) {
                tarefasNotOK.add(c);
            }
        }
        return tarefasNotOK;
    }

    public void marcarTarefaConcluida(String descricao) {

        for (Tarefa c : tarefasSet) {
            if (c.getDescricao() == descricao) {
                c.setOk(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {

        for (Tarefa c : tarefasSet) {
            if (c.getDescricao() == descricao) {
                c.setOk(false);
            }
        }
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        System.out.println("------ Adicionar tarefas");
        lista.adicionarTarefa("Tarefa1");
        lista.adicionarTarefa("Tarefa2");
        lista.adicionarTarefa("Tarefa3");
        lista.adicionarTarefa("Tarefa4");
        lista.adicionarTarefa("Tarefa5");
        lista.adicionarTarefa("Tarefa6");
        System.out.println("------ Exibir tarefas");
        lista.exibirTarefas();
        System.out.println("------ Contar tarefas: " + lista.contarTarefas());
        System.out.println("------ Tarefas concluidas");
        System.out.println(lista.obterTarefasConcluidas());
        System.out.println("------ Tarefas pendentes");
        System.out.println(lista.obterTarefasPendentes());
        System.out.println("------ Concluir tarefas");
        lista.marcarTarefaConcluida("Tarefa5");
        System.out.println("------ Tarefas concluidas");
        System.out.println(lista.obterTarefasConcluidas());
        System.out.println("------Limpar tarefas");
        lista.limparListaTarefas();
        System.out.println("------ Exibir tarefas");
        lista.exibirTarefas();
    }
}
