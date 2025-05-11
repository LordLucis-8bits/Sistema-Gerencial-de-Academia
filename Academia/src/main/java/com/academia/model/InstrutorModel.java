package com.academia.model;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;

@Document(collection = "Instrutores")
public class InstrutorModel extends UsuarioModel {
    private String especialidade;
    private ArrayList<AulaModel> aulasMinistradas = new ArrayList<>(); // Inicializa a lista de aulas ministradas

    public InstrutorModel() {super();}
    
    public InstrutorModel(String id, String nome, int idade, String email, String senha, String tipoDeUsuario , String especialidade, ArrayList<AulaModel> aulasMinistradas) {
        super(id, nome, idade, email, senha, tipoDeUsuario);
        this.tipoDeUsuario = "Instrutor"; // Define o tipo de usuário como "Instrutor"
        this.especialidade = especialidade;
        this.aulasMinistradas = aulasMinistradas;
    }
    
    //Getters
    public String getEspecialidade() {return especialidade;}
    public ArrayList<AulaModel> getAulasMinistradas() {return aulasMinistradas;}

    //Setters
    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}
    public void setAulasMinistradas(ArrayList<AulaModel> aulasMinistradas) {this.aulasMinistradas = aulasMinistradas;}

}
