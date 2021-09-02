package br.com.bilhete.agencia_viagem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bilhete.agencia_viagem.model.Agencia;

public interface AgenciaRepository extends JpaRepository<Agencia, Long>{

	List<Agencia> findByNome(String nomeAgencia);

}
