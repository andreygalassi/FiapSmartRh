package br.com.fiap.scj.repository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.fiap.scj.model.Empresa;
import br.com.fiap.scj.model.Usuario;

@RepositoryRestResource
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {

}