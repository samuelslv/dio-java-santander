import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoRemover = null;
        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoRemover = a;
                break;
            }
        }
        alunoSet.remove(alunoRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Samuel2", 1L, 7);
        gerenciadorAlunos.adicionarAluno("Samuel1", 2L, 1);
        gerenciadorAlunos.adicionarAluno("Samuel4", 3L, 2);
        gerenciadorAlunos.adicionarAluno("Samuel3", 4L, 3);

        gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        gerenciadorAlunos.removerAluno(3L);
        gerenciadorAlunos.exibirAlunos();
    }

}
