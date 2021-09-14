package br.com.bilhete.agencia_viagem.controller.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import br.com.bilhete.agencia_viagem.model.Agencia;

public class AgenciaForm {

	@NotNull @NotEmpty @Length(min = 5,max = 50, message = "About Me must be between 5 and 50 characters")
    private String nome;
	@NotNull @NotEmpty @Length(min = 15, max = 100, message = "About Me must be between 15 and 100 characters")
    private String endereco;
	@NotNull @NotEmpty //@Length(min = 8, max = 15, message = "About Me must be between 8 and 15 characters")
	private String telefone;


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public Agencia converter() {
        return new Agencia(nome, endereco,telefone);
    }
}
