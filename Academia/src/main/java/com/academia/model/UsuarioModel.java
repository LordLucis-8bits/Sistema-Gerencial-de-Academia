package com.academia.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuarios")
public abstract class UsuarioModel {
    @Id
    protected String id;
    protected String nome;
    protected int idade;
    protected String email;
    protected String senha;
    protected String tipoDeUsuario; // Pode ser "Aluno", "Instrutor" ou "Administrador"     

    public UsuarioModel() {}

    public UsuarioModel(String id, String nome, int idade, String email, String senha, String tipoDeUsuario) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.tipoDeUsuario = tipoDeUsuario;
    }
    
    //Getters
    public String getId() {return id;}
    public String getNome() {return nome;}
    public int getIdade() {return idade;}
    public String getEmail() {return email;}
    public String getSenha() {return senha;}
    public String getTipoDeUsuario() {return tipoDeUsuario;}

    //Setters
    public void setId(String id) {this.id = id;}
    public void setNome(String nome) {this.nome = nome;}
    public void setIdade(int idade) {this.idade = idade;}
    public void setEmail(String email) {this.email = email;}
    public void setSenha(String senha) {this.senha = senha;}
    public void setTipoDeUsuario(String tipoDeUsuario) {this.tipoDeUsuario = tipoDeUsuario;}

    //Metodo de Autenticação
    public boolean autenticar(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }           
    
}

