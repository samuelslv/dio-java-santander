import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();

    }

    // Adiciona uma nova tarefa à lista com a descrição fornecida.
    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    // Remove uma tarefa da lista com base em sua descrição.
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        listaTarefas.removeAll(tarefasParaRemover);
    }

    // Retorna o número total de tarefas na lista.
    public int obterNumeroTotalTarefas() {
        return listaTarefas.size();

    }

    // Retorna uma lista contendo a descrição de todas as tarefas na lista.
    public void obterDescricoesTarefas() {
        System.out.println(listaTarefas);
        /*for (Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa.getDescricao());
        }*/
    }

    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        System.out.println("----- Tamamho da lista de tarefas: " + tarefas.obterNumeroTotalTarefas());
        tarefas.adicionarTarefa("Tarefa 1");
        tarefas.adicionarTarefa("Tarefa 2");
        tarefas.adicionarTarefa("Tarefa 3");
        tarefas.adicionarTarefa("Tarefa 4");
        tarefas.adicionarTarefa("Tarefa 5");
        tarefas.adicionarTarefa("Tarefa 6");
        System.out.println("----- Tamamho da lista de tarefas: " + tarefas.obterNumeroTotalTarefas());
        System.out.println("----- Tarefas: ");
        tarefas.obterDescricoesTarefas();
        System.out.println("----- Revomer tarefa 4");
        tarefas.removerTarefa("Tarefa 4");
        System.out.println("----- Tarefas: ");
        tarefas.obterDescricoesTarefas();

    }
}