package br.com.bilhete.agencia_viagem.controller.dto;

import br.com.bilhete.agencia_viagem.model.Bilhete;

public class BilheteDto {
    
    private String numBilhete;
    private String itinerario;
    private String data;

    public BilheteDto(Bilhete bilhete){
        this.numBilhete = bilhete.getNumBilhete();
        this.itinerario = bilhete.getItinerario();
        this.data = bilhete.getData();
    }

    public String getNumBilhete(){
        return numBilhete;
    } 

    public String getItinerario(){
        return itinerario;
    }

    public String getData(){
        return data;
    }

    public static BilheteDto converte(Bilhete bilhete) {
        BilheteDto bilheteDto = new BilheteDto(bilhete);
        return bilheteDto;
    }


}
