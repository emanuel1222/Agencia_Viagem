package br.com.bilhete.agencia_viagem.controller;


import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.bilhete.agencia_viagem.controller.dto.AgenciaDto;
import br.com.bilhete.agencia_viagem.controller.dto.DetalheAgenciaDto;
import br.com.bilhete.agencia_viagem.controller.form.AgenciaForm;
import br.com.bilhete.agencia_viagem.controller.form.AtualizacaoAgenciaForm;
import br.com.bilhete.agencia_viagem.model.Agencia;
import br.com.bilhete.agencia_viagem.repository.AgenciaRepository;

@RestController
@RequestMapping("/agencia")
public class AgenciaController {
	
	@Autowired
	private AgenciaRepository agenciaRepository;
    
    @GetMapping
    public List<AgenciaDto> getAgencia(String nomeAgencia){
        //Agencia agencia = new Agencia("Vix passagens", "Av. vitoria - 5582, Vitoria/ES", 1);
    	//System.out.println(nomeAgencia);

		//Dto = Saem dados direto da API para o cliente
    	if (nomeAgencia == null) {
            List<Agencia> agencia = agenciaRepository.findAll();
        	return AgenciaDto.converter(agencia);    		
    	} else {
    		List<Agencia> agencia = agenciaRepository.findByNome(nomeAgencia);
    		return (List<AgenciaDto>) AgenciaDto.converter(agencia); 
    	}
    }
		////Form = Dados que vem do cliente para a API
	@PostMapping
	@Transactional
	public ResponseEntity<AgenciaDto> cadastrarAgencia(@RequestBody @Valid AgenciaForm agenciaForm, UriComponentsBuilder uriBuilder){
		Agencia agencia = agenciaForm.converter();
		agenciaRepository.save(agencia);
		URI uri = uriBuilder.path("/agencia/{id}").buildAndExpand(agencia.getId()).toUri();
		return ResponseEntity.created(uri).body(new AgenciaDto(agencia));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DetalheAgenciaDto> detalharAgencia(@PathVariable Long id) {
		
		//Agencia agencia = agenciaRepository.getById(id);
		Optional<Agencia> agencia = agenciaRepository.findById(id);
		if(agencia.isPresent()) {
			return ResponseEntity.ok(new DetalheAgenciaDto(agencia.get()));
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/simplify/{id}")
	public ResponseEntity<AgenciaDto> agenciaDetalhadaSimplificada(@PathVariable Long id) {
		//Agencia agencia = agenciaRepository.getById(id);
		//return new AgenciaDto(agencia);
		
		Optional<Agencia> agencia = agenciaRepository.findById(id);
		if(agencia.isPresent()) {
			return ResponseEntity.ok(new AgenciaDto(agencia.get()));
		} else {
			return ResponseEntity.notFound().build();
		}
		
		
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<AgenciaDto> atualizarAgencia(@PathVariable Long id, @RequestBody @Valid AtualizacaoAgenciaForm agenciaForm){
		
		//Agencia agencia = agenciaForm.atualizar(id, agenciaRepository);
		//return ResponseEntity.ok(new AgenciaDto(agencia));
		
		Optional<Agencia> optional = agenciaRepository.findById(id);
		if(optional.isPresent()) {
			Agencia agencia = agenciaForm.atualizar(id, agenciaRepository);
			return ResponseEntity.ok(new AgenciaDto(agencia));
		} else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity removerAgencia(@PathVariable Long id){
		//agenciaRepository.deleteById(id);
		//return ResponseEntity.ok().build();
		
		Optional<Agencia> optional = agenciaRepository.findById(id);
		if(optional.isPresent()) {
			agenciaRepository.deleteById(id);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}	
	}
	
}
