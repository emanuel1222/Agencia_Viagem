package br.com.bilhete.agencia_viagem.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bilhete.agencia_viagem.controller.dto.BalconistaDto;
import br.com.bilhete.agencia_viagem.model.Agencia;
import br.com.bilhete.agencia_viagem.model.Balconista;

@RestController
public class BalconistaController {

    @RequestMapping("/balconista")

    public BalconistaDto getBalconistas(){
        Agencia agencia = new Agencia();
        Balconista balconista = new Balconista("Joao pedro","15106186796", "99875236", "masculino", "joao.agencia@gmail.com", "av. dante micheline, vitoria/es",2500.00,true,agencia);
        return BalconistaDto.converter(balconista);
    }
    
}
