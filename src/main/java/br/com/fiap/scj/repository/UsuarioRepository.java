package br.com.fiap.scj.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.fiap.scj.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}