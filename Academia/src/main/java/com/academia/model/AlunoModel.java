package com.academia.model;
import org.springframework.data.mongodb.core.mapping.Document;
import com.academia.enums.TipoDePlano;
import com.academia.enums.TipoDeUsuario;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "Alunos")
public class AlunoModel extends UsuarioModel {
    private TipoDePlano tipoDePlano;
    private LocalDateTime dataInicioDePlano;
    private LocalDate dataFimPlano;
    private List<AulaModel> aulasMatriculadas = new ArrayList<>(); // Inicializa a lista de aulas matriculadas

    public AlunoModel() {super();}
    
    public AlunoModel(String id, String nome, int idade, String email, String senha, TipoDeUsuario tipoDeUsuario, TipoDePlano tipoDePlano, LocalDateTime dataInicioDePlano, LocalDate dataFimPlano,List<AulaModel> aulasMatriculadas) {
        super(id, nome, idade, email, senha, tipoDeUsuario);
        this.tipoDeUsuario = TipoDeUsuario.ALUNO; // Define o tipo de usuário como "Aluno"
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
  
}    
