package br.com.bilhete.agencia_viagem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Pessoa{

    //@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    //private Long id;
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String sexo;
    protected String email;
    protected String endereco;
    

    public Pessoa (String nome, String  cpf, String telefone, String sexo, String email, String endereco){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.setSexo(sexo);
        this.setEmail(email);
        this.setEndereco(endereco);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(String cpf){
       this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getSexo(){
        return sexo;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }


}