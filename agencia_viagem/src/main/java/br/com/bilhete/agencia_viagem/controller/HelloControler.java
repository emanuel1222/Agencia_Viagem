package br.com.bilhete.agencia_viagem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @RequestMapping("/")
    public String hello(){
        return "Hello World!";
    }
}
