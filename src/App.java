import entidades.Usuario;

import java.time.LocalDate;

import entidades.Projeto;
import entidades.Tarefa;
import enums.PrioridadeTarefa;
import enums.StatusProjeto;
import enums.StatusTarefa;
import enums.StatusUsuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNome("João");
        usuario.setCpf("123456789-10");
        usuario.setEmail("Joao@gmail.com");
        usuario.setSenha("123");
        usuario.setDataNascimento(LocalDate.of(2000, 12, 11));
        usuario.setStatus(StatusUsuario.ATIVO);

        Projeto projeto = new Projeto();
        projeto.setId(1);
        projeto.setNome("Projeto 1");
        projeto.setResponsavel(usuario);
        projeto.setDatainicio(LocalDate.of(2020, 5, 9));;
        projeto.setDataConclusao(LocalDate.of(2021, 2, 10));
        projeto.setDescricao("Projeto de FullStack");
        projeto.setStatus(StatusProjeto.ATIVO);

        Tarefa tarefas = new Tarefa();
        tarefas.setId(1);
        tarefas.setUsuario(usuario);
        tarefas.setTitulo("Tarefa1");
        tarefas.setStatus(StatusTarefa.FAZENDO);
        tarefas.setDescricao("Fazendo Tarefa 1");
        tarefas.setDataCriacao(LocalDate.of(2020, 11, 10));
        tarefas.setDataConclusao(LocalDate.of(2021, 3, 10));
        tarefas.setPrioridade(PrioridadeTarefa.ALTA);
        tarefas.setProjeto(projeto);
    }
}
