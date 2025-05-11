package com.academia.model;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "Alunos")
public class AlunoModel extends UsuarioModel {
    protected TipoDePlano tipoDePlano;
    protected LocalDateTime dataInicioDePlano;
    protected LocalDate dataFimPlano;
    protected List<AulaModel> aulasMatriculadas = new ArrayList<>(); // Inicializa a lista de aulas matriculadas

    public AlunoModel() {super();}
    
    public AlunoModel(String id, String nome, int idade, String email, String senha, String tipoDeUsuario, TipoDePlano tipoDePlano, LocalDateTime dataInicioDePlano, LocalDate dataFimPlano,List<AulaModel> aulasMatriculadas) {
        super(id, nome, idade, email, senha, tipoDeUsuario);
        this.tipoDeUsuario = "Aluno"; // Define o tipo de usuário como "Aluno"
        this.tipoDePlano = tipoDePlano;
        this.dataInicioDePlano = dataInicioDePlano;
        this.dataFimPlano = dataFimPlano;
        this.aulasMatriculadas = aulasMatriculadas;
    }
    
    //Getters
    public TipoDePlano getTipoDePlano() {return tipoDePlano;}
    public List<AulaModel> getAulasMatriculadas() {return aulasMatriculadas;}
    public LocalDateTime getDataInicioDePlano() {return dataInicioDePlano;}
    public LocalDate getDataFimPlano() {return dataFimPlano;}

    //Setters
    public void setTipoDePlano(TipoDePlano tipoDePlano) {this.tipoDePlano = tipoDePlano;}
    public void setAulasMatriculadas(List<AulaModel> aulasMatriculadas) {this.aulasMatriculadas = aulasMatriculadas;}
    public void setDataInicioDePlano(LocalDateTime dataInicioDePlano) {this.dataInicioDePlano = dataInicioDePlano;}
    public void setDataFimPlano(LocalDate dataFimPlano) {this.dataFimPlano = dataFimPlano;}
  
    //Matricula aluno em uma aula
    public void matricularEmAula(AulaModel aula) {
        if (!aulasMatriculadas.contains(aula)) {
            aulasMatriculadas.add(aula);
        }
    }

    //Metodo para calcular o fim do plano
    protected LocalDate calcularDataFimPlano(TipoDePlano tipoDePlano, LocalDate inicio) {
        return switch (tipoDePlano) {
            case DIARIO -> inicio.plusDays(1);
            case MENSAL -> inicio.plusMonths(1);
            case TRIMESTRAL -> inicio.plusMonths(3);
            case SEMESTRAL -> inicio.plusMonths(6);
        };
    }

    //Metodo para verificar se o plano do aluno está ativo
     public boolean planoAtivo() {
        return LocalDate.now().isBefore(dataFimPlano);
    }

    //Vizualiza as aulas disponiveis
    public void visualizarAulasDisponiveis(List<AulaModel> todasAsAulas) {
        System.out.println("Aulas disponíveis no sistema:");
        for (AulaModel aula : todasAsAulas) {
            System.out.println(aula.getTipo());
        }
    }
}    
