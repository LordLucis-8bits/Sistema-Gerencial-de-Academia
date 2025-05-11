package com.academia.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.util.List;


@Document(collection = "Relatorios")
public class RelatorioModel {
    @Id
    protected String id;
    protected AulaModel aula;
    protected InstrutorModel instrutor;
    protected List<AlunoModel> alunos;
    protected LocalDate dataHoraGeracao;

    public RelatorioModel() {}

    public RelatorioModel(String id, AulaModel aula, InstrutorModel instrutor, List<AlunoModel> alunos, LocalDate dataHoraGeracao) {
        this.id = id;
        this.aula = aula;
        this.instrutor = instrutor;
        this.alunos = alunos;
        this.dataHoraGeracao = dataHoraGeracao;
    }

    // Getters
    public String getId() {return id;}
    public AulaModel getAula() {return aula;}
    public InstrutorModel getInstrutor() {return instrutor;}
    public List<AlunoModel> getAlunos() {return alunos;}
    public LocalDate getDataHoraGeracao() {return dataHoraGeracao;}
    
    // Setters
    public void setId(String id) {this.id = id;}
    public void setAula(AulaModel aula) {this.aula = aula;}
    public void setInstrutor(InstrutorModel instrutor) {this.instrutor = instrutor;}
    public void setAlunos(List<AlunoModel> alunos) {this.alunos = alunos;}
    public void setDataHoraGeracao(LocalDate dataHoraGeracao) {this.dataHoraGeracao = dataHoraGeracao;}

}
