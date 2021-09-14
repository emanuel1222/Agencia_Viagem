package br.com.bilhete.agencia_viagem.model;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import antlr.collections.List;

//@Entity
public class Balconista extends Pessoa{

    //@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double salario;
    private boolean deFerias;
    //@OneToOne
    //private Agencia nomeAgencia;

    //private LinkedList<Bilhete> bilhetes = new LinkedList<Bilhete>();

    public Balconista (String nome, String cpf, String telefone, String sexo, String email, String endereco, double salario, boolean deFerias ,Agencia nomeAgencia){
        super(nome, cpf, telefone, sexo, email, endereco);
        this.setSalario(salario);
        this.setDeFerias(deFerias);
        //this.setAgencia(nomeAgencia);
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setDeFerias(boolean deFerias){
        this.deFerias = deFerias;
    }

    public boolean getDeFerias(){
        return deFerias;
    }
/*
    public void setAgencia(Agencia agencia){
        this.nomeAgencia = agencia;
    }

    public Agencia getAgencia(){
        return nomeAgencia;
    }

*/
}