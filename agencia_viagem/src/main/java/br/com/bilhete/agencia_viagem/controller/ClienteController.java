package br.com.bilhete.agencia_viagem.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bilhete.agencia_viagem.controller.dto.ClienteDto;
import br.com.bilhete.agencia_viagem.model.Cliente;


@RestController
public class ClienteController {
//(nome, telefone, sexo, email, endereco)   
    @RequestMapping("/cliente")

    public ClienteDto getClientes(){

        Cliente cliente = new Cliente("Emanuel","19808586908", "32415888", "masculino", "emanuel@hotmail.com", "rua jacana, casa 003, serra/es");
        return ClienteDto.converter(cliente);
    }
    
}
