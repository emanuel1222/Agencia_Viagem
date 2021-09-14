package br.com.bilhete.agencia_viagem.controller.dto;

import br.com.bilhete.agencia_viagem.model.Cliente;

public class ClienteDto {
    private String nome;
    private String telefone;
    private String endereco;

    public ClienteDto(Cliente cliente){
        this.nome = cliente.getNome();
        this.telefone = cliente.getTelefone();
        this.endereco = cliente.getEndereco();
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getEndereco(){
        return endereco;
    }


    public static ClienteDto converter(Cliente cliente) {
        ClienteDto clienteDto = new ClienteDto(cliente);
        return clienteDto;
    }

}
