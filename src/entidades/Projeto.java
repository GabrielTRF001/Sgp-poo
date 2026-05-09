package entidades;
import java.time.LocalDate;

import enums.StatusProjeto;

public class Projeto {
    private long id;
    private String nome;
    private String descricao;
    private LocalDate datainicio;
    private LocalDate dataConclusao;
    private Usuario responsavel;
    private StatusProjeto status;

    public Projeto() {
    }

    public Projeto(StatusProjeto status) {
        this.status = status;
    }

    public Projeto(long id, String nome, String descricao, LocalDate datainicio, LocalDate dataConclusao,
            Usuario responsavel) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.datainicio = datainicio;
        this.dataConclusao = dataConclusao;
        this.responsavel = responsavel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(LocalDate datainicio) {
        this.datainicio = datainicio;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public StatusProjeto getStatus() {
        return status;
    }

    public void setStatus(StatusProjeto status) {
        this.status = status;
    }

}
