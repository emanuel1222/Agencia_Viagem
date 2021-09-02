package br.com.bilhete.agencia_viagem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bilhete.agencia_viagem.controller.dto.BilheteDto;
import br.com.bilhete.agencia_viagem.model.Bilhete;


@RestController
public class BilheteController {
    
    @RequestMapping("/bilhete")
    public BilheteDto getBilhetes(){
        Bilhete bilhete = new Bilhete("0629", "GRU - SP / VIX - ES", "02/08/2021",350.50);
        return BilheteDto.converte(bilhete);
    }


}
