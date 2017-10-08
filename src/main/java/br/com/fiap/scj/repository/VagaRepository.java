package br.com.fiap.scj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.fiap.scj.model.Usuario;
import br.com.fiap.scj.model.Vaga;

@RepositoryRestResource
public interface VagaRepository extends CrudRepository<Vaga, Long> {

}