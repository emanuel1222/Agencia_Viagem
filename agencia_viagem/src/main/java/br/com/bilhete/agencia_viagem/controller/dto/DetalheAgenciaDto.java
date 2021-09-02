package br.com.bilhete.agencia_viagem.controller.dto;

import br.com.bilhete.agencia_viagem.model.Agencia;

public class DetalheAgenciaDto {
	
	private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private int estahAberta;
    
    
	public DetalheAgenciaDto(Agencia agencia) {

		this.id = agencia.getId();
		this.nome = agencia.getNome();
		this.endereco = agencia.getEndereco();
		this.telefone = agencia.getTelefone();
		this.estahAberta = agencia.getEstahAberta();
	}


	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public int getEstahAberta() {
		return estahAberta;
	}
    
    
}

