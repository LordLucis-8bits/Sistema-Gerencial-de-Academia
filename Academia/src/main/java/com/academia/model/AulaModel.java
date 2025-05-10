package com.academia.model;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.annotation.Id;

@Document(collection = "Aulas")
public class AulaModel {
    @Id
    protected String tipo;
    protected LocalDateTime horario;
    protected InstrutorModel instrutor;
    protected int limiteAlunos;
    protected List<AlunoModel> alunosMatriculados; // Inicializa a lista de alunos matriculados
    protected String status; //"Iniciada", "Finalizada", "Em Andamento", "Cancelada"

    public AulaModel() {}

    public AulaModel(String tipo, LocalDateTime horario, InstrutorModel instrutor, int limiteAlunos, List<AlunoModel> alunosMatriculados  ,String status) {
        this.tipo = tipo;
        this.horario = horario;
        this.instrutor = instrutor;
        this.limiteAlunos = limiteAlunos;
        this.alunosMatriculados = alunosMatriculados;
        this.status = status;
    }

    //Getters       
    public String getTipo() {return tipo;}
    public LocalDateTime getHorario() {return horario;}
    public InstrutorModel getInstrutor() {return instrutor;}
    public int getLimiteAlunos() {return limiteAlunos;}
    public List<AlunoModel> getAlunosMatriculados() {return alunosMatriculados;}
    public String getStatus() {return status;}

    //Setters
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setHorario(LocalDateTime horario) {this.horario = horario;}
    public void setInstrutor(InstrutorModel instrutor) {this.instrutor = instrutor;}
    public void setLimiteAlunos(int limiteAlunos) {this.limiteAlunos = limiteAlunos;}
    public void setAlunosMatriculados(List<AlunoModel> alunosMatriculados) {this.alunosMatriculados = alunosMatriculados;}
    public void setStatus(String status) {this.status = status;}
    
}
