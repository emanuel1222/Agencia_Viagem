package br.com.bilhete.agencia_viagem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Cliente extends Pessoa{

    private Long id;

    public Cliente (String nome, String cpf, String telefone, String sexo, String email, String endereco){
        
        super(nome, cpf, telefone, sexo, email, endereco);
    }
/*
    public void comprarBilhete(){
        //completar função
    }
*/
}