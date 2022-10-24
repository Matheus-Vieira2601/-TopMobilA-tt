package br.unicamp.topmobil;

import java.io.Serializable;
import com.google.gson.annotations.SerializedName;


import kotlin.jvm.internal.SerializedIr;

public class Service {

    @SerializedName("nome")
    private String nome;
    @SerializedName("email")
    private String email;
    @SerializedName("Telefone")
    private String telefone;
    @SerializedName("senha")
    private String senha;

    public Service(String nome, String email, String telefone, String senha) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}