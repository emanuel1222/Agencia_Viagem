package br.com.bilhete.agencia_viagem.controller.dto;

import br.com.bilhete.agencia_viagem.model.Balconista;

public class BalconistaDto {
    
    private String nome;
    private boolean deFerias;

    public BalconistaDto(Balconista balconista){
        this.nome = balconista.getNome();
        this.deFerias = balconista.getDeFerias();
        
    }

    public String getNome(){
        return nome;
    }

    public boolean getDeFerias(){
        return deFerias;
    }

    public static BalconistaDto converter(Balconista balconista){
        //return balconista.stream().map(BalconistaDto::new);
        BalconistaDto balconistaDto = new BalconistaDto(balconista);
        return balconistaDto;
    }

}
