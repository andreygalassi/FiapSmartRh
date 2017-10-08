package br.com.fiap.scj;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

import br.com.fiap.scj.model.Empresa;
import br.com.fiap.scj.model.Nota;
import br.com.fiap.scj.model.Prova;
import br.com.fiap.scj.model.Usuario;
import br.com.fiap.scj.model.Vaga;
import br.com.fiap.scj.repository.EmpresaRepository;

@Component
public class SpringDataRestCustomization extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		// TODO Auto-generated method stub
		System.out.println("RECONFIGURANDO..............");
		super.configureRepositoryRestConfiguration(config);
		config.exposeIdsFor(Empresa.class, Nota.class,Prova.class,Usuario.class,Vaga.class, EmpresaRepository.class);
	}
}
